package com.nihal.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void converter(View view)
    {
        EditText amount=(EditText) findViewById(R.id.amount);
        String str=amount.getText().toString();
        double conv=Double.parseDouble(str);
        Log.i("Entered amount :",str);
        conv=conv*80;
        Log.i("converted amount", String.valueOf(conv));
        Log.i("start","converter enabled");
        Toast.makeText(MainActivity.this,"Converted amount is: "+String.valueOf(conv),Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}