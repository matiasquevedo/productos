package com.example.matias.productos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class registroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        //datos enviados del INTENT
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.getString("key") != null){
            Toast.makeText(registroActivity.this,"Todo Ok",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(registroActivity.this,"Mensaje Vacio",Toast.LENGTH_LONG).show();
        }
    }
}
