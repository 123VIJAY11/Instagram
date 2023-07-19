package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.instagram.databinding.ActivityMain2Binding;
import com.example.instagram.databinding.ActivityMain8Binding;

public class MainActivity8 extends AppCompatActivity {

ActivityMain8Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain8Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



    }
}