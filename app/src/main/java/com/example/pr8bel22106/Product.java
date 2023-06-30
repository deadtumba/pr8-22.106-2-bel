package com.example.pr8bel22106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Product extends AppCompatActivity implements View.OnClickListener {
    Button otpr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        otpr = findViewById(R.id.button6);
        otpr.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        startActivity(new Intent(this,Basket.class));
    }
}