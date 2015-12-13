package com.alumno.tortillascebanc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ElegirBebidas extends AppCompatActivity { private Spinner Opciones;
    private EditText cantidad;
    private float precio;
    private TextView mensaje;
    private float cant;
    private String cola = "Refresco de cola", limon = "Limón", naranja = "Naranja", nestea = "Nestea", cerveza = "Cerveza", agua = "Agua";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_bebidas);



        Opciones=(Spinner)findViewById(R.id.cmbOpciones);
        cantidad = (EditText) findViewById(R.id.txtCantidad);
        mensaje = (TextView) findViewById(R.id.lblMensaje);

        cantidad.setText("1");



        final String[] datos =
                new String[]{"Refresco de cola - 2€","Limón - 2€","Naranja - 1.50€","Nestea - 2€","Cerveza - 1.50€","Agua - 1€"};

        ArrayAdapter<String> adaptador=
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, datos);

        Opciones = (Spinner) findViewById (R.id.cmbOpciones);
        adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        Opciones.setAdapter(adaptador);

        Opciones.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent,
                                               android.view.View v, int position, long id) {


                        cant = Float.parseFloat(cantidad.getText().toString());

                        if (cant <= 20) {
                            if (position == 0) {
                                precio = 2 * cant;
                                mensaje.setText("Has elegido " + cant + " unidades de " + cola + " el precio total es: " + precio + "€");
                            } else if (position == 1) {
                                precio = 2 * cant;
                                mensaje.setText("Has elegido " + cant + " unidades de " + limon + " el precio total es: " + precio + "€");
                            } else if (position == 2) {
                                precio = (float) (1.5 * cant);
                                mensaje.setText("Has elegido " + cant + " unidades de " + naranja + " el precio total es: " + precio + "€");
                            } else if (position == 3) {
                                precio = 2 * cant;
                                mensaje.setText("Has elegido " + cant + " unidades de " + nestea + " el precio total es: " + precio + "€");
                            } else if (position == 4) {
                                precio = (float) (1.5 * cant);
                                mensaje.setText("Has elegido " + cant + " unidades de " + cerveza + " el precio total es: " + precio + "€");
                            } else if (position == 5) {
                                precio = 1 * cant;
                                mensaje.setText("Has elegido " + cant + " unidades de " + agua + " el precio total es: " + precio + "€");
                            }

                        }else{
                            cantidad.setError("No puedes pedir más de 20 bebidas.");
                        }
                    }


                    public void onNothingSelected(AdapterView<?> parent) {
                        mensaje.setText("");
                    }
                });
    }
}