package com.example.peliculas2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        Intent intent = getIntent();
        String movieTitle = intent.getStringExtra("movieTitle");
        int movieYear = intent.getIntExtra("movieYear", 0);
        String movieDescription = intent.getStringExtra("movieDescription");
        int movieLanguageId = intent.getIntExtra("movieLanguageId", 0);

        TextView titleTextView = findViewById(R.id.titleTextView);
        TextView yearTextView = findViewById(R.id.yearTextView);
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);
        TextView languageIdTextView = findViewById(R.id.languageIdTextView);

        titleTextView.setText(movieTitle);
        yearTextView.setText(String.valueOf(movieYear));
        descriptionTextView.setText(movieDescription);
        languageIdTextView.setText("Language ID: " + String.valueOf(movieLanguageId));

    }
}

