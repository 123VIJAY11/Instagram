package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.instagram.databinding.ActivityMain2Binding;
import com.example.instagram.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {

    ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
                startActivity(intent);
            }
        });
        binding.reel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity3.this,MainActivity7.class);
                startActivity(intent);
            }
        });

        binding.home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity3.class);
                startActivity(intent);

            }
        });

        binding.profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity3.this, MainActivity6.class);
                startActivity(intent);
            }
        });


    }
}