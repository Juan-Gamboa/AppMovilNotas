package com.example.myapplicationnotaspromedio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplicationnotaspromedio.modals.CantidadNotas;

public class MainActivity extends AppCompatActivity {

    private EditText cantNotasEditTxt;
    private Button cantBtn;
    private Button regresarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.cantNotasEditTxt = findViewById(R.id.promedioEditTxt);

        this.cantBtn = findViewById(R.id.promedioBtn);
        this.cantBtn.setOnClickListener(view -> {

            System.out.println(this.cantNotasEditTxt.getText());
            CantidadNotas cantidadNotas = new CantidadNotas();
            cantidadNotas.setCantidadNot(Integer.parseInt(this.cantNotasEditTxt.getText().toString()));
            System.out.println("Estoy en CantidadNotas " + cantidadNotas.getCantidadNot());
            Intent intent = new Intent(this, PromedioActivity.class);
            startActivity(intent);
        });

        this.regresarBtn = findViewById(R.id.regresarBtn);
        this.regresarBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}