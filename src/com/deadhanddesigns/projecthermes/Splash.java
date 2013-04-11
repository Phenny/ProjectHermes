package com.deadhanddesigns.projecthermes;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;



public class Splash extends Activity{

	MediaPlayer ourSong; // variabila oursong de tip media player
	
	@Override
	protected void onCreate(Bundle bundle) {
		// TODO Auto-generated method stub
		super.onCreate(bundle);
		
		setContentView(R.layout.splash); //activitatea splash are drept corespondent layoutul Splash
		ourSong = MediaPlayer.create(Splash.this, R.raw.soundsplash); //initializeaza melodia de start cu sunetul splashsound din folderul RAW
				
		ourSong.start(); //porneste melodia
		
		
		Thread timer = new Thread(){ //porneste un nou fir de executie
			public void run(){
				try{
					sleep(6500);					//asteapta 6500 milisecunde 
				} catch (InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openStartingPoint = new Intent("com.deadhanddesigns.projecthermes.MENU"); //creeaza nou intent care porneste activitatea MENU
					startActivity(openStartingPoint);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() { // cand se face trecerea la urmatoarea activitatea, activitatea splash elibereaza memoria ocupata de melodie
		// TODO Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();
	}
}

