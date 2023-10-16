package com.example.semana05appformsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.semana05appformsandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnIrListado.setOnClickListener(this);
        binding.btnIrRegistro.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnIrListado){
            startActivity(new Intent(MainActivity.this, ListaActivity.class));
        }else if(view.getId() == R.id.btnIrRegistro){
            startActivity(new Intent(MainActivity.this, RegistroActivity.class));
        }
    }
}