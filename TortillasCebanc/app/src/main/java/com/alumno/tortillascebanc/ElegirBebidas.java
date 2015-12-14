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

public class ElegirBebidas extends AppCompatActivity {
    private Spinner Opciones;
    private EditText cantidad;
    private float precio;
    private float preciocan;
    private float total;
    private TextView mensaje;
    private float cant;
    private Button añadir;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_bebidas);


        añadir = (Button)findViewById(R.id.btnAñadir);
        Opciones=(Spinner)findViewById(R.id.cmbOpciones);
        cantidad = (EditText) findViewById(R.id.txtCantidad);
        mensaje = (TextView) findViewById(R.id.lblMensaje);





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



                            if (position == 0) {
                                precio = 2;

                            } else if (position == 1) {
                                precio = 2 ;

                            } else if (position == 2) {
                                precio = (float) (1.5);

                            } else if (position == 3) {
                                precio = 2 ;

                            } else if (position == 4) {
                                precio = (float) (1.5);

                            } else if (position == 5) {
                                precio = 1;

                            }


                    }


                    public void onNothingSelected(AdapterView<?> parent) {
                        mensaje.setText("");
                    }
                });


        añadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        cant = Float.parseFloat(cantidad.getText().toString());
                if (cantidad.length() > 0) {
        if (cant <= 20) {
                preciocan = precio*cant;
        } else {
            cantidad.setError("No puedes pedir más de 20 bebidas.");
        }
                total=total+preciocan;
                mensaje.setText("Precio: " + total + " €");


            }
            }else
            error();



    });



    }
    public void salirAplicacion(View view){
        finish();
    }
   }
