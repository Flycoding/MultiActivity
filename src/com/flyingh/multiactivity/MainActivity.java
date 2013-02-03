package com.flyingh.multiactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void startAnother(View view) {
		// startActivity(new Intent(getApplicationContext(), AnotherActivity.class));
		Intent intent = new Intent();
		// intent.setClass(this, AnotherActivity.class);
		// intent.setClassName(getApplicationContext(), "com.flyingh.multiactivity.AnotherActivity");
		// intent.setComponent(new ComponentName(getApplicationContext(), AnotherActivity.class));
		intent.setClassName("com.flyingh.multiactivity", "com.flyingh.multiactivity.AnotherActivity");
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
