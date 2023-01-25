package com.nihal.toastdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void displayImage(View view)
    {
        Log.i("Test","Button Clicked");
        ImageView imageView=(ImageView) findViewById(R.id.natureImage);
        imageView.setImageResource(R.drawable.natural);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}