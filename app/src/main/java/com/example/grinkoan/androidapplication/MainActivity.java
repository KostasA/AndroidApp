package com.example.grinkoan.androidapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
{
	private final String TAG = "KA_"+getClass().getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Calculation cal = new Calculation();
		cal.add(5, 3);
		int result = cal.getResult();
		Log.d(TAG+"Result: ", String.valueOf(result));
	}


}
