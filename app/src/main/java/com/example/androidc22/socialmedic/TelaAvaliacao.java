package com.example.androidc22.socialmedic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class TelaAvaliacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_avaliacao);

        Toast.makeText(this, "Tela Avaliacao OK!", Toast.LENGTH_LONG).show();
    }
}
