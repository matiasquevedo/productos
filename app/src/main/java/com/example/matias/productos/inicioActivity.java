package com.example.matias.productos;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class inicioActivity extends AppCompatActivity {

    private Button btn;
    private ImageButton btnRegistro;
    private final String MSN = "MENSAJE ENVIADO";

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio2);

        btn = (Button) findViewById(R.id.buttonComenzar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(inicioActivity.this,MainActivity.class);
                intent.putExtra("mensaje",MSN);
                startActivity(intent);
            }
        });

        btnRegistro = (ImageButton) findViewById(R.id.imageButtonRegistro);

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(inicioActivity.this,registroActivity.class);
                intent.putExtra("key",1);
                startActivity(intent);
            }
        });
    }

}
