package com.example.lab2ssg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_siguiente;
    Button btn_anterior;

    private ImageView imagen;
    private TextView artista;
    private TextView description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_siguiente = findViewById(R.id.btn_siguiente);
        btn_anterior = findViewById(R.id.btn_anterior);
        imagen = (ImageView) findViewById(R.id.image_view);
        artista = (TextView) findViewById((R.id.article_name));
        description = (TextView) findViewById(R.id.article_description);

        btn_siguiente.setOnClickListener(view -> {
            imagen.setImageResource(R.drawable.fremercury);
            artista.setText(R.string.artist_two_name);
            description.setText(R.string.content_article_artist_two);
        });

        btn_anterior.setOnClickListener(view -> {
            imagen.setImageResource(R.drawable.chebenington);
            artista.setText(R.string.artist_one_name);
            description.setText(R.string.content_article_artist_one);
        });
    }
}