package com.example.johnny.calculodenotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReporteNotas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte_notas);
    }

    public void volver(View v){
        finish();
    }
}
