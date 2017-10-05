package com.example.johnny.calculodenotas;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1m1,n2m1,n3m1,n1m2,n2m2,n3m2,n1m3,n2m3,n3m3;
    private TextView nf1,nf2,nf3;
    float f1,f2,f3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //campos EditText para ingresar datos
        n1m1 = (EditText)(findViewById(R.id.n1m1));
        n2m1 = (EditText)(findViewById(R.id.n2m1));
        n3m1 = (EditText)(findViewById(R.id.n3m1));
        n1m2 = (EditText)(findViewById(R.id.n1m2));
        n2m2 = (EditText)(findViewById(R.id.n2m2));
        n3m2 = (EditText)(findViewById(R.id.n3m2));
        n1m3 = (EditText)(findViewById(R.id.n1m3));
        n2m3 = (EditText)(findViewById(R.id.n2m3));
        n3m3 = (EditText)(findViewById(R.id.n3m3));
        //TextView para mostrar promedios de notas
        nf1 = (TextView) (findViewById(R.id.Nf1));
        nf2 = (TextView) (findViewById(R.id.Nf2));
        nf3 = (TextView) (findViewById(R.id.Nf3));

        //CARGA LOS DATOS INICIALES
        abrir("file","nota11",n1m1);
        abrir("file","nota21",n2m1);
        abrir("file","nota31",n3m1);

        abrir("file","nota12",n1m2);
        abrir("file","nota22",n2m2);
        abrir("file","nota32",n3m2);

        abrir("file","nota13",n1m3);
        abrir("file","nota23",n2m3);
        abrir("file","nota33",n3m3);


        //=================================================
        //ACTUALIZACION EN TIEMPO REAL PARA MATERIA_1
        final EditText nf11 = (EditText) findViewById(R.id.n1m1);
        nf11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {

                editable.toString();

                if(editable.length()>0){
                    calcularM1(n1m1.getId());
                    guardar("file","nota11",n1m1.getText().toString());
                }
                else{
                    Toast resultado4 = Toast.makeText(getApplicationContext(),"NO HAY NOTAS", Toast.LENGTH_LONG);
                    resultado4.show();
                }
            }
        });

        final EditText nf12 = (EditText) findViewById(R.id.n2m1);
        nf12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                editable.toString();

                if(editable.length()>0){
                    calcularM1(n2m1.getId());
                    guardar("file","nota21",n2m1.getText().toString());
                }
                else{
                    Toast resultado4 = Toast.makeText(getApplicationContext(),"NO HAY NOTAS", Toast.LENGTH_LONG);
                    resultado4.show();
                }
            }
        });

        final EditText nf13 = (EditText) findViewById(R.id.n3m1);
        nf13.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                editable.toString();

                if(editable.length()>0){
                    calcularM1(n3m1.getId());
                    guardar("file","nota31",n3m1.getText().toString());
                }
                else{
                    Toast resultado4 = Toast.makeText(getApplicationContext(),"NO HAY NOTAS", Toast.LENGTH_LONG);
                    resultado4.show();
                }
            }
        });

        //=================================================
        //ACTUALIZACION EN TIEMPO REAL PARA MATERIA_2
        final EditText nf21 = (EditText) findViewById(R.id.n1m2);
        nf21.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {

                editable.toString();

                if(editable.length()>0){
                    calcularM1(n1m2.getId());
                    guardar("file","nota12",n1m2.getText().toString());
                }
                else{
                    Toast resultado4 = Toast.makeText(getApplicationContext(),"NO HAY NOTAS", Toast.LENGTH_LONG);
                    resultado4.show();
                }
            }
        });

        final EditText nf22 = (EditText) findViewById(R.id.n2m2);
        nf22.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                editable.toString();

                if(editable.length()>0){
                    calcularM1(n2m2.getId());
                    guardar("file","nota22",n2m2.getText().toString());
                }
                else{
                    Toast resultado4 = Toast.makeText(getApplicationContext(),"NO HAY NOTAS", Toast.LENGTH_LONG);
                    resultado4.show();
                }
            }
        });

        final EditText nf23 = (EditText) findViewById(R.id.n3m2);
        nf23.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                editable.toString();

                if(editable.length()>0){
                    calcularM1(n3m2.getId());
                    guardar("file","nota32",n3m2.getText().toString());
                }
                else{
                    Toast resultado4 = Toast.makeText(getApplicationContext(),"NO HAY NOTAS", Toast.LENGTH_LONG);
                    resultado4.show();
                }
            }
        });

        //=================================================
        //ACTUALIZACION EN TIEMPO REAL PARA MATERIA_3
        final EditText nf31 = (EditText) findViewById(R.id.n1m3);
        nf31.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {

                editable.toString();

                if(editable.length()>0){
                    calcularM1(n1m3.getId());
                    guardar("file","nota13",n1m3.getText().toString());
                }
                else{
                    Toast resultado4 = Toast.makeText(getApplicationContext(),"NO HAY NOTAS", Toast.LENGTH_LONG);
                    resultado4.show();
                }
            }
        });

        final EditText nf32 = (EditText) findViewById(R.id.n2m3);
        nf32.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                editable.toString();

                if(editable.length()>0){
                    calcularM1(n2m3.getId());
                    guardar("file","nota23",n2m3.getText().toString());
                }
                else{
                    Toast resultado4 = Toast.makeText(getApplicationContext(),"NO HAY NOTAS", Toast.LENGTH_LONG);
                    resultado4.show();
                }
            }
        });

        final EditText nf33 = (EditText) findViewById(R.id.n3m3);
        nf33.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                editable.toString();

                if(editable.length()>0){
                    calcularM1(n3m3.getId());
                    guardar("file","nota33",n3m3.getText().toString());
                }
                else{
                    Toast resultado4 = Toast.makeText(getApplicationContext(),"NO HAY NOTAS", Toast.LENGTH_LONG);
                    resultado4.show();
                }
            }
        });

    }

    private void calcularM1(int id) {
        String not1;
        String not2;
        String not3;
        String not12;
        String not22;
        String not32;
        String not13;
        String not23;
        String not33;

        if(n1m1.getId() == id || n2m1.getId() == id || n2m1.getId() == id){
            if(n1m1.getText().toString().length()>0){
                if(Float.parseFloat(n1m1.getText().toString())<=5){
                    not1 = n1m1.getText().toString();
                }else{
                    not1="6";
                }
            }
            else{not1="0";}

            if(n2m1.getText().toString().length()>0){
                if(Float.parseFloat(n2m1.getText().toString())<=5){
                    not2 = n2m1.getText().toString();
                }else{
                    not2="6";
                }
            }
            else{not2="0";}

            if(n3m1.getText().toString().length()>0){

                if(Float.parseFloat(n3m1.getText().toString())<=5){
                    not3 = n3m1.getText().toString();
                }else{
                    not3="6";
                }
            }
            else{not3="0";}

            float n1 = Float.parseFloat(not1);
            float n2 = Float.parseFloat(not2);
            float n3 = Float.parseFloat(not3);
            float def = (n1+n2+n3)/3;
            f1=def;

            if(Float.parseFloat(not1)==6 || Float.parseFloat(not2)==6 || Float.parseFloat(not3)==6){
                nf1.setText("Error!");
            }
            else{
                nf1.setText(String.format("%.2f",def));
            }

        }else if(n1m2.getId() == id || n2m2.getId() == id || n3m2.getId() == id){
            if(n1m2.getText().toString().length()>0){
                if(Float.parseFloat(n1m2.getText().toString())<=5){
                    not12 = n1m2.getText().toString();
                }else{
                    not12="6";
                }
            }
            else{not12="0";}

            if(n2m2.getText().toString().length()>0){

                if(Float.parseFloat(n2m2.getText().toString())<=5){
                    not22 = n2m2.getText().toString();
                }else{
                    not22="6";
                }
            }
            else{not22="0";}

            if(n3m2.getText().toString().length()>0){

                if(Float.parseFloat(n3m2.getText().toString())<=5){
                    not32 = n3m2.getText().toString();
                }else{
                    not32="6";
                }
            }
            else{not32="0";}

            float n1 = Float.parseFloat(not12);
            float n2 = Float.parseFloat(not22);
            float n3 = Float.parseFloat(not32);
            float def = (n1+n2+n3)/3;
            f2=def;

            if(Float.parseFloat(not12)==6 || Float.parseFloat(not22)==6 || Float.parseFloat(not32)==6){
                nf2.setText("Error!");
            }
            else{
                nf2.setText(String.format("%.2f",def));
            }

        }else if(n1m3.getId() == id || n2m3.getId() == id || n2m3.getId() == id){
            if(n1m3.getText().toString().length()>0){
                if(Float.parseFloat(n1m3.getText().toString())<=5){
                    not13 = n1m3.getText().toString();
                }else{
                    not13="6";
                }
            }
            else{not13="0";}

            if(n2m3.getText().toString().length()>0){

                if(Float.parseFloat(n2m3.getText().toString())<=5){
                    not23 = n2m3.getText().toString();
                }else{
                    not23="6";
                }
            }
            else{not23="0";}

            if(n3m3.getText().toString().length()>0){

                if(Float.parseFloat(n3m3.getText().toString())<=5){
                    not33 = n3m3.getText().toString();
                }else{
                    not33="6";
                }
            }
            else{not33="0";}

            float n1 = Float.parseFloat(not13);
            float n2 = Float.parseFloat(not23);
            float n3 = Float.parseFloat(not33);
            float def = (n1+n2+n3)/3;
            f3=def;

            if(Float.parseFloat(not13)==6 || Float.parseFloat(not23)==6 || Float.parseFloat(not33)==6){
                nf3.setText("Error!");
            }
            else{
                nf3.setText(String.format("%.2f",def));
            }
        }


    }

    private void guardar(String a, String b, String c){
        SharedPreferences preferencias=getSharedPreferences(a, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferencias.edit();
        editor.putString(b,c);
        editor.commit();
    }

    public void abrir(String a, String b, EditText c){
        SharedPreferences preferencias = getSharedPreferences(a, Context.MODE_PRIVATE);
        String dato = preferencias.getString(b, "");
        if (dato.length()==0) {
            Toast.makeText(this,"No existe", Toast.LENGTH_LONG).show();
        }
        else {
            c.setText(dato);
        }
    }


    public void acercade(View v){
        Intent i = new Intent(this, AcercaDe.class);
        startActivity(i);
    }

    //ESTE METODO ESTA EN DESUSO
    private void calcular(View v){
        //Intent i = new Intent(this, ReporteNotas.class);
        //startActivity(i);
        SharedPreferences preferencias = getSharedPreferences("file", Context.MODE_PRIVATE);
        preferencias.edit().clear().commit();

    }
}
