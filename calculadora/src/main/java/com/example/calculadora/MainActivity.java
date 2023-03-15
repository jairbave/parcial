package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class ClasePrincipal {
        public static void main(String[] args) {

            Calculadora mensajero_Suma = new Calculadora();
            mensajero_Suma.MostrarResultado();


            tvcr.setTex();


        }
    }
}