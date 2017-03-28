package com.example.androidc22.socialmedic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bEntrar;

    private Button btn_EsqueciSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast.makeText(this, "Construindo SocialMedic", Toast.LENGTH_LONG).show();

        btn_EsqueciSenha = (Button)findViewById(R.id.btn_EsqueciSenha);
        bEntrar = (Button) findViewById(R.id.btnEntrar);



        bEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itTelaMenu = new Intent(MainActivity.this, TelaMenu.class);
                startActivity(itTelaMenu);
            }
        });

        btn_EsqueciSenha.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent itTelaEsqueciSenha = new Intent(MainActivity.this, TelaEsqueceuSenha.class);
                startActivity(itTelaEsqueciSenha);

            }
        });
    }
}
