package com.alumno.tortillascebanc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ResumenPedido extends AppCompatActivity {

    private String nombre,direccion,telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen_pedido);


        Bundle extras = getIntent().getExtras();
        nombre = extras.getString("Nombre");
        direccion = extras.getString("Direccion");
        telefono = extras.getString("Telefono");
    }

}
