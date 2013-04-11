package com.deadhanddesigns.projecthermes;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;




public class Menu extends Activity {
	ImageButton ibBluetooth; // declarare de variabila
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		ibBluetooth = (ImageButton) findViewById(R.id.ibBluetooth); //variabila ibBluetooth are drept corespondent in XML butonul ibBluetooth
	
	ibBluetooth.setOnClickListener(new OnClickListener() { // on click listener. asteapta ca butonul sa fie apasat, atunci cand este apasat, porneste activitatea BluetoothChat
		public void onClick(View v) {
		Intent intent=new Intent ("com.deadhanddesigns.projecthermes.BLUETOOTHCHAT");
		startActivity(intent);
	
		}});}}
//cod nefinalizat care are drept scop implementarea unui menu inflater (exemplu in activitatea urmatoare)
	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.half_bluetooth, menu);
		return true;
	}

}*/














