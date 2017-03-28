package com.example.androidc22.socialmedic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaMedicos extends AppCompatActivity{

    private Button btnMedico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_medicos);

        btnMedico = (Button) findViewById(R.id.btnHospital03);

        btnMedico.setOnClickListener(new View.OnClickListener() {
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
