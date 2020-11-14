package com.example.practise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button buttonAllBooks, buttonCurrentlyReading, buttonAlreadyRead, buttonWantToRead, buttonFavoriteBooks, buttonAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();

        buttonAllBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllBooksActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initializeViews() {
        buttonAllBooks = findViewById(R.id.buttonAllBooks);
        buttonCurrentlyReading = findViewById(R.id.buttonCurrentlyReading);
        buttonAlreadyRead = findViewById(R.id.buttonAlreadyRead);
        buttonWantToRead = findViewById(R.id.buttonWantToRead);
        buttonFavoriteBooks = findViewById(R.id.buttonFavoriteBooks);
        buttonAbout = findViewById(R.id.buttonAbout);
    }


}