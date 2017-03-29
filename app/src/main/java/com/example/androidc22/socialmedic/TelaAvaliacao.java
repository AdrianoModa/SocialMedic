package com.example.androidc22.socialmedic;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class TelaAvaliacao extends AppCompatActivity {

    private Button btnEnviarComent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_avaliacao);

        btnEnviarComent = (Button) findViewById(R.id.btnEnviarComent);
        btnEnviarComent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(TelaAvaliacao.this);
                dlg.setMessage("Obrigado por avaliar!");
                dlg.setNeutralButton("OK", null);
            }
        });


        //Toast.makeText(this, "Tela Avaliacao OK!", Toast.LENGTH_LONG).show();
    }
}
