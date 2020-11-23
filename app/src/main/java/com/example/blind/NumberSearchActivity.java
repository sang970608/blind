package com.example.blind;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.blind.databinding.ActivityMainBinding;

public class NumberSearchActivity extends AppCompatActivity {

    ActivityMainBinding Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}