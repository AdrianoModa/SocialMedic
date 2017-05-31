package com.example.androidc22.socialmedic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaHospitais extends AppCompatActivity {

    private Button btnHospital01;



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




    }
}
