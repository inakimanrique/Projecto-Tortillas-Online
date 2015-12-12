package com.alumno.tortillascebanc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElegirTortilla extends AppCompatActivity {

    private Button bSiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_tortilla);
        bSiguiente = (Button) findViewById(R.id.button2);

        bSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarDatos();
            }
            });

        }


    public void lanzarDatos (){

        Intent intent = new Intent(this, ElegirBebidas.class);
        startActivity(intent);
    }
}
