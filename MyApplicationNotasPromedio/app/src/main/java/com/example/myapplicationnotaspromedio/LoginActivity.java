package com.example.myapplicationnotaspromedio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


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

            Intent intent = new Intent(this, MainActivity.class);
            Bundle infoP = new Bundle();
            infoP.putString("nombre",this.usuarioTxt.getText().toString());
            infoP.putString("asignatura",this.asigTxt.getText().toString());
            intent.putExtras(infoP);
            startActivity(intent);
        });

    }
}