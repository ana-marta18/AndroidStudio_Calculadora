package com.example.anamartasandoval;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    float numero3 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void numeroCero(View view) {
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f) {
            txtResultado.setText("0");
        } else {
            txtResultado.setText(txtResultado.getText() + "0");
        }
    }

    public void numeroUno(View view) {
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f) {
            txtResultado.setText("1");
        } else {
            txtResultado.setText(txtResultado.getText() + "1");
        }
    }

    public void numeroDos(View view) {
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f) {
            txtResultado.setText("2");
        } else {
            txtResultado.setText(txtResultado.getText() + "2");
        }
    }

    public void numeroTres(View view) {
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f) {
            txtResultado.setText("3");
        } else {
            txtResultado.setText(txtResultado.getText() + "3");
        }
    }

    public void numeroCuatro(View view) {
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f) {
            txtResultado.setText("4");
        } else {
            txtResultado.setText(txtResultado.getText() + "4");
        }
    }

    public void numeroCinco(View view) {
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f) {
            txtResultado.setText("5");
        } else {
            txtResultado.setText(txtResultado.getText() + "5");
        }
    }

    public void numeroSeis(View view) {
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f) {
            txtResultado.setText("6");
        } else {
            txtResultado.setText(txtResultado.getText() + "6");
        }
    }

    public void numeroSiete(View view) {
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f) {
            txtResultado.setText("7");
        } else {
            txtResultado.setText(txtResultado.getText() + "7");
        }
    }

    public void numeroOcho(View view) {
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f) {
            txtResultado.setText("8");
        } else {
            txtResultado.setText(txtResultado.getText() + "8");
        }
    }

    public void numeroNueve(View view) {
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        if (numero1 == 0.0f) {
            txtResultado.setText("9");
        } else {
            txtResultado.setText(txtResultado.getText() + "9");
        }
    }

    public void limpiar(View view) {
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
        txtResultado.setText("0");
    }


    public void suma(View view) {
        numero3 = Float.parseFloat(txtResultado.getText().toString());
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        operacion = "+";
        txtResultado.setText("0");
    }

    public void resta(View view) {
        numero3 = Float.parseFloat(txtResultado.getText().toString());
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        operacion = "-";
        txtResultado.setText("0");
    }

    public void multiplicacion(View view) {
        numero3 = Float.parseFloat(txtResultado.getText().toString());
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        operacion = "*";
        txtResultado.setText("0");
    }

    public void division(View view) {
        numero3 = Float.parseFloat(txtResultado.getText().toString());
        numero1 = Float.parseFloat(txtResultado.getText().toString());
        operacion = "/";
        txtResultado.setText("0");
    }

    public void punto(View view) {
        numero1 = Float.parseFloat(txtResultado.getText().toString());

        if(numero1 == 0.0f){
            txtResultado.setText("0");
        } else {
            String punto = txtResultado.getText().toString();
            txtResultado.setText(punto + ".");
        }
    }

    public void Igual(View view) {
        numero2 = Float.parseFloat(txtResultado.getText().toString());
        if (operacion.equals("+")) {
            float resultado = numero3 + numero2;
            txtResultado.setText(resultado + "");
        }else if (operacion.equals("-")){
            float resultado = numero3 - numero2;
            txtResultado.setText(resultado + "");
        }else if (operacion.equals("*")){
            float resultado = numero3 * numero2;
            txtResultado.setText(resultado + "");
        }else if (operacion.equals("/")){
            float resultado = numero3 / numero2;
            txtResultado.setText(resultado + "");
        }
    }

    public void Informacion(View view){
        Intent i = new Intent(this, informacion.class);
        startActivity(i);

        txtResultado = findViewById(R.id.txtResultado);
    }
}