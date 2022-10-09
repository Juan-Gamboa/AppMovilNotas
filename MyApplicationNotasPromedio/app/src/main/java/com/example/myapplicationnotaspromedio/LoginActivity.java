package com.example.myapplicationnotaspromedio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplicationnotaspromedio.modals.InfoUsuario;

public class LoginActivity extends AppCompatActivity {

    private EditText usuarioTxt;
    private EditText asigTxt;
    private Button iniciarSesionBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        this.usuarioTxt = findViewById(R.id.usuarioTxt);
        this.asigTxt = findViewById(R.id.asigTxt);

        this.iniciarSesionBtn = findViewById(R.id.iniciarSesionBtn);
        this.iniciarSesionBtn.setOnClickListener(view -> {

            System.out.println(this.usuarioTxt.getText());
            InfoUsuario infoUsuario = new InfoUsuario();
            infoUsuario.setNombre(this.usuarioTxt.getText().toString());
            infoUsuario.setAsignatura(this.asigTxt.getText().toString());
            System.out.println("Estoy en infoUsuario " + infoUsuario.getNombre() + " "+ infoUsuario.getAsignatura());
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

    }
}