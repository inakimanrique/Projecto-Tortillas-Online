package com.alumno.tortillascebanc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResumenPedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen_pedido);

        Bundle extras = getIntent().getExtras();
        String texto = extras.getString("Nombre");
        String texto1 = extras.getString("Direccion");
        String numero = extras.getString("Telefono");
        TextView tv = (TextView) findViewById(R.id.txtTexto);
        tv.setText("La solicitud de " + texto + "// " + texto1 +"// "+numero+ " ha sido:");
    }

}
