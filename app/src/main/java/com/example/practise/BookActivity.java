package com.example.practise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {
    private TextView selectedBookName, author, pages, description, longdescription;
    private ImageView selectedBook;
    private Button addToReading, addToWantToRead, addToanalyzed, addToFavorites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        initViews();
    }

    private void initViews(){
        selectedBookName = findViewById(R.id.selectedBookName);
        author = findViewById(R.id.author);
        pages = findViewById(R.id.pages);
        description = findViewById(R.id.description);
        longdescription = findViewById(R.id.longdescription);

        selectedBook = findViewById(R.id.selectedBook);

        addToReading = findViewById(R.id.addToReading);
        addToWantToRead = findViewById(R.id.addToWantToRead);
        addToanalyzed = findViewById(R.id.addToanalyzed);
        addToFavorites = findViewById(R.id.addToFavorites);
    }
}