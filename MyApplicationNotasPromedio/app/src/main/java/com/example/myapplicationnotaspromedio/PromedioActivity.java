package com.example.myapplicationnotaspromedio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplicationnotaspromedio.modals.CantidadNotas;

public class PromedioActivity extends AppCompatActivity {

    private EditText promedioEditTxt;
    private Button promedioBtn;
    private Button regresarBtn;
    private Button siguiBtn;
    public double restprom;
    public int cont;
    public int valorN;
    public double promedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promedio);
        Bundle infoP = this.getIntent().getExtras();
        this.promedioEditTxt = findViewById(R.id.promedioEditTxt);
        this.promedioBtn = findViewById(R.id.promedioBtn);
        this.promedioBtn.setOnClickListener(view -> {
            valorN = infoP.getInt("cantidadNotas");
            System.out.println(cont);
            System.out.println(valorN);
            if (cont == valorN) {
                //this.promedioEditTxt.setFocusable(false);
                System.out.println("ya conte");
                System.out.println(restprom/valorN);
                promedio = restprom/valorN;
                if (promedio >= 3) {
                    Toast.makeText(getApplicationContext(),"Felicidades "+infoP.getString("nombre")+
                                    " aprobaste la asignatura de "+infoP.getString("asignatura")+ " con un promedio de: "
                            +promedio,
                            Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Lo siento "+infoP.getString("nombre")+
                                    " reprobaste la asignatura de "+infoP.getString("asignatura")+ " con un promedio de: "
                                    +promedio,
                            Toast.LENGTH_LONG).show();
                }

            }

        });

        this.siguiBtn = findViewById(R.id.siguiBtn);
        this.siguiBtn.setOnClickListener(view -> {
            System.out.println("estoy contando");
            valorN = infoP.getInt("cantidadNotas");
            cont++;
            System.out.println(cont);
            System.out.println(valorN);
            restprom += Double.parseDouble(this.promedioEditTxt.getText().toString());
            System.out.println("promedio fuera if "+ restprom);
            Toast.makeText(getApplicationContext(),"Digite el siguiente numero",Toast.LENGTH_SHORT).show();
            if (cont == valorN) {
                promedioBtn.setEnabled(true);
                siguiBtn.setEnabled(false);
                promedioEditTxt.setFocusable(false);
            }
        });


        this.regresarBtn = findViewById(R.id.regresarBtn);
        this.regresarBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        });

    }
}