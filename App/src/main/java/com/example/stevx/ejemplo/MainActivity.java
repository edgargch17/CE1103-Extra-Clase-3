package com.example.stevx.ejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1 , editText2;

    Button suma;
    Button resta;
    Button multiplicacion;
    Button division;

    TextView total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);

        suma = findViewById(R.id.Sumar);
        resta = findViewById(R.id.Restar);
        multiplicacion = findViewById(R.id.Multiplicar);
        division = findViewById(R.id.Dividir);

        total = findViewById(R.id.total);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1 = Integer.parseInt(editText1.getText().toString());
                int valor2 = Integer.parseInt(editText2.getText().toString());
                int resultado = valor1 + valor2;
                total.setText(resultado+"");
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1 = Integer.parseInt(editText1.getText().toString());
                int valor2 = Integer.parseInt(editText2.getText().toString());
                int resultado = valor1 - valor2;
                total.setText(resultado+"");
            }
        });
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1 = Integer.parseInt(editText1.getText().toString());
                int valor2 = Integer.parseInt(editText2.getText().toString());
                int resultado = valor1 * valor2;
                total.setText(resultado+"");
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor1 = Integer.parseInt(editText1.getText().toString());
                int valor2 = Integer.parseInt(editText2.getText().toString());
                int resultado = valor1 / valor2;
                total.setText(resultado+"");
            }
        });



    }


}
