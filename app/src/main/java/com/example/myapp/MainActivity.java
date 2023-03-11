package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static final String Key = "COUNTER";
    private static final String Key2 = "COUNTER2";
    private Integer MC1 = 0;
    private Integer MC2 = 0;

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(Key, MC1);
        outState.putInt(Key2, MC2);}

    @SuppressLint("SetTextI18n")
    @Override
    protected void onRestoreInstanceState (Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        MC1 = savedInstanceState.getInt(Key);
        MC2 = savedInstanceState.getInt(Key2);
        TextView counterView = findViewById(R.id.MC1);
        TextView countView = findViewById(R.id.MC2);
        counterView.setText(MC1.toString());
        countView.setText(MC2.toString());}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void MCOne(View view) {
        MC1++;
        TextView counterView = findViewById(R.id.MC1);
        counterView.setText(MC1.toString());
    }
    public void MCTwo(View view) {
        MC2++;
        TextView countView = findViewById(R.id.MC2);
        countView.setText(MC2.toString());
    }
    public void Delete(View view) {
        MC1 = 0;
        MC2 = 0;
        TextView counterView = findViewById(R.id.MC1);
        TextView countView = findViewById(R.id.MC2);
        counterView.setText(MC1.toString());
        countView.setText(MC2.toString());}
}