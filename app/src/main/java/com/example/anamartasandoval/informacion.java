package com.example.anamartasandoval;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class informacion extends AppCompatActivity {
    TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
    }

    public void Regresar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

        txtResultado = findViewById(R.id.txtResultado);
    }
}