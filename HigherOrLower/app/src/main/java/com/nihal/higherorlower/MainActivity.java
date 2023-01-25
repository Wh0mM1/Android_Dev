package com.nihal.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random=new Random();
    int x = random.nextInt(20)+1;
    public void makeToast(String str)
    {
        Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
    }
    public void onCheck(View view)
    {
        EditText num=(EditText) findViewById(R.id.nums);
        int n=Integer.parseInt(num.getText().toString());
        Log.i("random", String.valueOf(x));
        Log.i("num",num.getText().toString());
        if(n==x)
        {
            Log.i("Guess","Perfect");
            makeToast("Perfect Guess");
            x=random.nextInt(20)+1;
        }
        else if(n<x)
        {
            Log.i("Guess","Lesser Number");
            makeToast("Guessed number is lesser");
        }
        else if(n>x)
        {
            Log.i("Guess","Greater Number");
            makeToast("Guessed number is greater");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}