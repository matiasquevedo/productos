package com.example.matias.productos;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text =(TextView) findViewById(R.id.textViewEnviado);

        //datos enviados del INTENT
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.getString("mensaje") != null){
            String mensaje = bundle.getString("mensaje");
            Toast.makeText(MainActivity.this,mensaje,Toast.LENGTH_LONG).show();
            text.setText(mensaje);
        } else {
            Toast.makeText(MainActivity.this,"Mensaje Vacio",Toast.LENGTH_LONG).show();
            text.setText("(Mensaje Vacio)");
        }


    }

}
