package com.example.guilherme.projetopeixinho.Activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.guilherme.projetopeixinho.R;

public class PrincipalActivity extends Activity {

   private TextView TvAbreEtiqueta;
    private  TextView TvAbreProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        TvAbreEtiqueta = (TextView) findViewById(R.id.tvAbreEtiqueta);
        TvAbreEtiqueta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abreEtiquetas();
            }
        });

        TvAbreProduto = (TextView) findViewById(R.id.tvAbreProduto);
        TvAbreProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abreCadastroProduto();
            }
        });


    }

    public void abreCadastroProduto(){
        Intent intent = new Intent(PrincipalActivity.this, CadastroProdutoActivity.class);
        startActivity(intent);
    }

    public void abreEtiquetas(){
        Intent intent = new Intent(PrincipalActivity.this, EtiquetasActivity.class);
        startActivity(intent);
    }
}
