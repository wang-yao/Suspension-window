package com.example.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;

public class MainActivity extends Activity {
	
	static View v;
	private WindowManager wManager;// 窗口管理者
    private WindowManager.LayoutParams mParams;// 窗口的属性
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.one).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this, Two.class));
			}
		});
		wManager = (WindowManager) getApplicationContext().getSystemService(
                Context.WINDOW_SERVICE);
        mParams = new WindowManager.LayoutParams();
        mParams.type = WindowManager.LayoutParams.TYPE_SYSTEM_ALERT;// 系统提示window
        mParams.format = PixelFormat.TRANSLUCENT;// 支持透明
       
        mParams.width = WindowManager.LayoutParams.MATCH_PARENT;//窗口的宽和高
        mParams.height = 150;
        mParams.gravity = Gravity.BOTTOM;
        
        //mParams.format = PixelFormat.RGBA_8888;
        mParams.flags |= WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;// 焦点
       
//        mParams.x = 0;//窗口位置的偏移量
//        mParams.y = 30;
        
        v = LayoutInflater.from(this).inflate(R.layout.tab, null);
//        v.post(new Runnable() {
//			
//			@Override
//			public void run() {
//				
//			}
//		});
        
        wManager.addView(v, mParams);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
