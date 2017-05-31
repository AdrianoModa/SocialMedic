package com.example.androidc22.socialmedic;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaMenu extends AppCompatActivity {

    private Button bMedicos;
    private Button bFavoritos;
    private Button bHospitais;
    private Button bAvaliacao;
    private Button bSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);

        bMedicos = (Button) findViewById(R.id.btnMedicos);
        bMedicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itTelaMedico = new Intent(TelaMenu.this, TelaMedicos.class);
                startActivity(itTelaMedico);
            }
        });

        bFavoritos = (Button) findViewById(R.id.btnfavoritos);
        bFavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itTelaFavoritos = new Intent(TelaMenu.this, TelaFavoritos.class);
                startActivity(itTelaFavoritos);
            }
        });

        bHospitais = (Button) findViewById(R.id.btnHospitais);
        bHospitais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itTelaHopitais = new Intent(TelaMenu.this, TelaHospitais.class);
                startActivity(itTelaHopitais);
            }
        });

        bAvaliacao = (Button) findViewById(R.id.btnSair);
        bAvaliacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
