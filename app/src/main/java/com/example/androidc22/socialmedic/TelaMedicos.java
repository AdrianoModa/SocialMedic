package com.example.androidc22.socialmedic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaMedicos extends AppCompatActivity{

    private Button btnMedico01;
    private Button btnMedico02;
    private Button btnMedico03;
    private Button btnMedico04;
    private Button btnMedico05;
    private Button btnMedico06;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_medicos);

        btnMedico01 = (Button) findViewById(R.id.btnHospital03);
        btnMedico01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent itTelaMedicoPerfil = new Intent(TelaMedicos.this, TelaMedicosPerfil.class);
                startActivity(itTelaMedicoPerfil);
            }
        });

        btnMedico02 = (Button) findViewById(R.id.btnHospital02);
        btnMedico02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent itTelaMedicoPerfil = new Intent(TelaMedicos.this, TelaMedicosPerfil.class);
                startActivity(itTelaMedicoPerfil);
            }
        });

        btnMedico03 = (Button) findViewById(R.id.btnMedico03);
        btnMedico03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent itTelaMedicoPerfil = new Intent(TelaMedicos.this, TelaMedicosPerfil.class);
                startActivity(itTelaMedicoPerfil);
            }
        });

        btnMedico04 = (Button) findViewById(R.id.btnHospital04);
        btnMedico04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent itTelaMedicoPerfil = new Intent(TelaMedicos.this, TelaMedicosPerfil.class);
                startActivity(itTelaMedicoPerfil);
            }
        });

        btnMedico05 = (Button) findViewById(R.id.btnHospital05);
        btnMedico05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent itTelaMedicoPerfil = new Intent(TelaMedicos.this, TelaMedicosPerfil.class);
                startActivity(itTelaMedicoPerfil);
            }
        });

        btnMedico06 = (Button) findViewById(R.id.btnHospital06);
        btnMedico06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent itTelaMedicoPerfil = new Intent(TelaMedicos.this, TelaMedicosPerfil.class);
                startActivity(itTelaMedicoPerfil);
            }
        });


        // Maikon coloquei o nome dos botoes de btnMedicos01 até o 06 pra ficar padronizado


        //Toast.makeText(this, "Tela Médicos OK!", Toast.LENGTH_LONG).show();

    }


}
