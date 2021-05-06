package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;
    private TextView textResultadoIMC;
    private TextView textSatusPeso;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        textResultadoIMC = findViewById(R.id.textViewResultadoIMC);
        textSatusPeso = findViewById(R.id.textViewStatusPeso);
    }

    public void calcularIMC(View view){

        double peso;
        double altura;
        double imc;

        peso = Double.parseDouble(editPeso.getText().toString());
        altura = Double.parseDouble(editAltura.getText().toString());
        imc = peso/Math.pow(altura,2);

        resultadoIMC(imc);
    }

    private void resultadoIMC(double imc){

        if(imc<17){
            textResultadoIMC.setText(Double.toString(imc));
            textSatusPeso.setText("Muito abaixo do peso");
        }
        else if(17<=imc && 18.5>imc){
            textResultadoIMC.setText(Double.toString(imc));
            textSatusPeso.setText("Abaixo do peso");
        }
        else if(18.5<=imc && 25>imc){
            textResultadoIMC.setText(Double.toString(imc));
            textSatusPeso.setText("Peso normal");
        }
        else if(25<=imc && 30>imc){
            textResultadoIMC.setText(Double.toString(imc));
            textSatusPeso.setText("Acima do peso");
        }else if(30<=imc && 35>imc){
            textResultadoIMC.setText(Double.toString(imc));
            textSatusPeso.setText("Obesidade I");
        }
        else if(35<=imc && 40>imc){
            textResultadoIMC.setText(Double.toString(imc));
            textSatusPeso.setText("Obesidade II(severa)");
        }
        else if(40<=imc){
            textResultadoIMC.setText(Double.toString(imc));
            textSatusPeso.setText("Obesidade III(mórbida)");
        }
        else {
            textResultadoIMC.setText(Double.toString(0.0));
            textSatusPeso.setText("Erro: Algum valor está incorreto.");
        }

    }
}