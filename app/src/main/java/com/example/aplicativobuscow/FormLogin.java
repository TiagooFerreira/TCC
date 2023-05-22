package com.example.aplicativobuscow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    private TextView text_tela_cadastro;
    private Button bt_entrar;

    private EditText edit_senha;
    private CheckBox checkBoxSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
        iniciarComponentes();

        edit_senha = findViewById(R.id.edit_senha);
        checkBoxSenha = findViewById(R.id.checkBoxSenha);

        //Adicionando CheckBox para ocultar e mostrar Senha
        checkBoxSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    //mostrar senha
                    edit_senha.setTransformationMethod(null);
                }else{
                    edit_senha.setTransformationMethod(new PasswordTransformationMethod());
                }
            }
        });


        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormLogin.this,FormCadastro.class);
                startActivity(intent);
            }
        });

        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormLogin.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void iniciarComponentes(){
        text_tela_cadastro = findViewById(R.id.text_tela_cadastro);
        bt_entrar = findViewById(R.id.bt_entrar);
    }
}