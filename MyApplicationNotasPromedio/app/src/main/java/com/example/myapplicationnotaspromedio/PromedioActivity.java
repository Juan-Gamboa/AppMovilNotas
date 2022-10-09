package com.example.myapplicationnotaspromedio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplicationnotaspromedio.modals.CantidadNotas;

public class PromedioActivity extends AppCompatActivity {

    private EditText promedioEditTxt;
    private Button promedioBtn;
    private Button regresarBtn;
    private Button siguiBtn;
    public int restprom;
    public int cont;
    private CantidadNotas cantidadNotas;
    public int valorN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promedio);

        this.promedioEditTxt = findViewById(R.id.promedioEditTxt);
        this.promedioBtn = findViewById(R.id.promedioBtn);
        this.promedioBtn.setOnClickListener(view -> {
            valorN = cantidadNotas.getCantidadNot();
            System.out.println(cont);
            System.out.println(valorN);
            if (cont == valorN) {
                //this.promedioEditTxt.setFocusable(false);
                System.out.println("ya conte");
                System.out.println(restprom/valorN);
            }
        });

        this.siguiBtn = findViewById(R.id.siguiBtn);
        this.siguiBtn.setOnClickListener(view -> {
            System.out.println("estoy contando");
            cont++;
            System.out.println(cont);
            //valorNu = cantidadNotas.getCantidadNot();
            restprom += Integer.parseInt(this.promedioEditTxt.getText().toString());
            System.out.println("promedio fuera if "+ restprom);
            /*if (cont == valorN) {
                promedioBtn.setEnabled(true);
            }*/
        });


        this.regresarBtn = findViewById(R.id.regresarBtn);
        this.regresarBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        });

    }
}