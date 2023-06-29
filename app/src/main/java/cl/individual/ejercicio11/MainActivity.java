package cl.individual.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import cl.individual.ejercicio11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initListeners();
    }

    private void initListeners() {
        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String boton1 = "Turn off flight mode";
                mostrarToast(boton1);
            }
        });

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String boton2 = "Updating profile";
                mostrarToast(boton2);
            }
        });

        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String boton3 = "Picture saved to gallery";
                mostrarToast(boton3);
            }
        });

        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String boton4 = "Unlocked level 5";
                mostrarToast(boton4);
            }
        });

        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String boton5 = "Level 4 completed";
                mostrarToast(boton5);
            }
        });

        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String boton6 = "Music paused";
                mostrarToast(boton6);
            }
        });
    }

    public void mostrarToast(String boton) {
        Toast.makeText(this, "Has seleccionado: " + boton, Toast.LENGTH_LONG).show();
    }
}