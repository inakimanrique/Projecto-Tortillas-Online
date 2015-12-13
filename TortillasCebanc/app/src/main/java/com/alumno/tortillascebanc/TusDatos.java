package com.alumno.tortillascebanc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TusDatos extends AppCompatActivity {
    private Button bSiguiente;
    private EditText name, direccion, telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tus_datos);

        bSiguiente = (Button) findViewById(R.id.btnSiguiente);
        name = (EditText)findViewById(R.id.txtNombre);
        direccion = (EditText)findViewById(R.id.txtDireccion);
        telefono = (EditText)findViewById(R.id.txtTelefono);

        bSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.length() > 0 && direccion.length() > 0 && telefono.length() >0) {
                    lanzarDatos();

                }else
                    error();

            }
        });

    }
    public void lanzarDatos (){

        Intent intent = new Intent(this, ElegirBebidas.class);
        Intent intent2 = new Intent(this, ResumenPedido.class);
        intent2.putExtra("Nombre", name.getText().toString());
        intent2.putExtra("Direccion", direccion.getText().toString());
        intent2.putExtra("Telefono", telefono.getText().toString());
        startActivity(intent);
    }

    //Método usado para validar si los campos estan vacíos.
    public void error(){
        Toast toast = Toast.makeText(this, "Debes rellenar todos los campos.", Toast.LENGTH_SHORT);
        toast.show();
    }
    //Método para salir de la aplicación
    public void salir(View view){
        finish();
    }
}
