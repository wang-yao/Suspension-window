package com.example.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;

public class Two extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main1);
		
		WindowManager wManager = (WindowManager) getApplicationContext().getSystemService(
                Context.WINDOW_SERVICE);
		wManager.removeView(MainActivity.v);
	}
}
