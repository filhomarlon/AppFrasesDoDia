package com.appfrasesdodia.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){
        TextView texto = findViewById(R.id.textApareceFrase);

        String[] frasessort = {
                "Posso não ter um centavo no bolso, mas tenho um sorriso no rosto e isso vale mais que todo dinheiro do mundo.\n" +
                        "\n" +
                        "Seu Madruga",
                "O trabalho não é ruim. Ruim é ter de trabalhar!\n" +
                        "\n" +
                        "Seu Madruga",
                "Sou pobre, porém honrado!\n" +
                        "\n" +
                        "Seu Madruga",
                "A vingança nunca é plena, mata a alma e envenena.\n" +
                        "\n" +
                        "Seu Madruga",
        };

        int sorteio = new Random().nextInt(4);

        texto.setText(frasessort[sorteio]);
    }
}
