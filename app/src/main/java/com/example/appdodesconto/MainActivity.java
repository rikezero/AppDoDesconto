package com.example.appdodesconto;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText nome;
    EditText valor;
    EditText porcentagem;
    Button btnCalcular;
    Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor = findViewById(R.id.preco);
        porcentagem = findViewById(R.id.porcentagem);
        btnCalcular = findViewById(R.id.botao);
        nome = findViewById(R.id.produto);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primeiro = valor.getText().toString();
                String segundo = porcentagem.getText().toString();
                String terceiro = nome.getText().toString();
                if(primeiro.isEmpty() || segundo.isEmpty() || terceiro.isEmpty()){
                    Toast.makeText(activity, "Preecha corretamente!", Toast.LENGTH_LONG).show();
                } else {
                    int primeiroNum = Integer.parseInt(primeiro);
                    int segundoNum = Integer.parseInt(segundo);
                    double porcentDecimal = segundoNum/100.0;
                    double valorFinal = primeiroNum - (primeiroNum*porcentDecimal);
                    String resultado = "O valor do desconto já com o desconto é: " + valorFinal;
                    Toast.makeText(activity, resultado, Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}

