package com.example.androidc22.socialmedic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaHospitais extends AppCompatActivity {

    private Button btnHospital01;
    private Button btnHospital02;
    private Button btnHospital03;
    private Button btnHospital04;
    private Button btnHospital05;
    private Button btnHospital06;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_hospitais);


        btnHospital01 = (Button) findViewById(R.id.btnHospital01);
        btnHospital01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent itTelaHospitalPerfil = new Intent(TelaHospitais.this, TelaHospitaisPerfil.class);
                startActivity(itTelaHospitalPerfil);
            }
        });
        btnHospital02 = (Button) findViewById(R.id.btnHospital02);
        btnHospital02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent itTelaHospitalPerfil = new Intent(TelaHospitais.this, TelaHospitaisPerfil.class);
                startActivity(itTelaHospitalPerfil);
            }
        });
        btnHospital03 = (Button) findViewById(R.id.btnHospital03);
        btnHospital03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent itTelaHospitalPerfil = new Intent(TelaHospitais.this, TelaHospitaisPerfil.class);
                startActivity(itTelaHospitalPerfil);
            }
        });
        btnHospital04 = (Button) findViewById(R.id.btnHospital04);
        btnHospital04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent itTelaHospitalPerfil = new Intent(TelaHospitais.this, TelaHospitaisPerfil.class);
                startActivity(itTelaHospitalPerfil);
            }
        });
        btnHospital05 = (Button) findViewById(R.id.btnHospital05);
        btnHospital05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent itTelaHospitalPerfil = new Intent(TelaHospitais.this, TelaHospitaisPerfil.class);
                startActivity(itTelaHospitalPerfil);
            }
        });
        btnHospital06 = (Button) findViewById(R.id.btnHospital06);
        btnHospital06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent itTelaHospitalPerfil = new Intent(TelaHospitais.this, TelaHospitaisPerfil.class);
                startActivity(itTelaHospitalPerfil);
            }
        });



    }
}
