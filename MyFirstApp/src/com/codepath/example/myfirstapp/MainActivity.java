package com.codepath.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	public EditText etWords;
	public TextView tvLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etWords = (EditText) findViewById(R.id.etWords);
        tvLabel = (TextView) findViewById(R.id.tvLabel);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
   public void onSubmit(View v){
	   String fieldValue = etWords.getText().toString();
	   Toast.makeText(this, fieldValue, Toast.LENGTH_SHORT).show();
	   tvLabel.setText(fieldValue);
    }
    
}
