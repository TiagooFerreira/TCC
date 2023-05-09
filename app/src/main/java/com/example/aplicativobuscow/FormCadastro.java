package com.example.aplicativobuscow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.aplicativobuscow.databinding.ActivityFormCadastroBinding;
import com.example.aplicativobuscow.databinding.ActivityMainBinding;

public class FormCadastro extends AppCompatActivity {

    private ActivityFormCadastroBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFormCadastroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

    }
}