package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.instagram.databinding.ActivityMain6Binding;
import com.example.instagram.databinding.ActivityMainBinding;

public class MainActivity6 extends AppCompatActivity {

    ActivityMain6Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain6Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




    }
}