package com.example.androidc22.socialmedic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class TelaHospitaisPerfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_hospitais_perfil);

        Toast.makeText(this, "Tela Hospital Perfis", Toast.LENGTH_LONG).show();
    }
}
