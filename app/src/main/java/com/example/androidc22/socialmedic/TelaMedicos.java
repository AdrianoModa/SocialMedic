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

        btnMedico01 = (Button) findViewById(R.id.btnMedico01);
        btnMedico01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent itTelaMedicoPerfil = new Intent(TelaMedicos.this, TelaMedicosPerfil.class);
                startActivity(itTelaMedicoPerfil);
            }
        });

    }


}
