package com.alumno.tortillascebanc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ElegirTortilla extends AppCompatActivity {

    private String nombre,direccion,telefono;
    private Button bSiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_tortilla);
        bSiguiente = (Button) findViewById(R.id.btnSiguiente);

        Bundle extras = getIntent().getExtras();
        nombre = extras.getString("Nombre");
        direccion = extras.getString("Direccion");
        telefono = extras.getString("Telefono");

        bSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarDatos();


            }
        });

    }






    public void lanzarDatos (){

        Intent intent = new Intent(this, ElegirBebidas.class);
        intent.putExtra("Nombre", nombre);
        intent.putExtra("Direccion", direccion);
        intent.putExtra("Telefono", telefono);
        startActivity(intent);
    }


}
