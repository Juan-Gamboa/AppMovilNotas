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
    public int cant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.cantNotasEditTxt = findViewById(R.id.promedioEditTxt);

        this.cantBtn = findViewById(R.id.promedioBtn);
        this.cantBtn.setOnClickListener(view -> {

            System.out.println(this.cantNotasEditTxt.getText());
            cant = Integer.parseInt(this.cantNotasEditTxt.getText().toString());
            Intent intent = new Intent(this, PromedioActivity.class);
            Bundle infoP = this.getIntent().getExtras();
            Bundle infoC = new Bundle();
            infoC.putString("nombre", infoP.getString("nombre"));
            infoC.putString("asignatura", infoP.getString("asignatura"));
            infoC.putInt("cantidadNotas",Integer.parseInt(this.cantNotasEditTxt.getText().toString()));
            intent.putExtras(infoC);
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