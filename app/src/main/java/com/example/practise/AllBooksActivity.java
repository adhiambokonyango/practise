package com.example.practise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {
    private RecyclerView booksRecyclerView;
    private BookRecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);
        adapter = new BookRecyclerViewAdapter(this);

        booksRecyclerView = findViewById(R.id.booksRecyclerView);
        booksRecyclerView.setAdapter(adapter);
        booksRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(
                1,
                "Sulwe",
                "lupita",
                15,
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1554153712i/42785750._UY400_SS400_.jpg",
                "luo narrative",
                "long description"));

        books.add(new Book(
                2,
                "Amara the Brave",
                "Matt Zhang",
                315,
                "https://marketplace.canva.com/EAD7WWWtKSQ/1/0/251w/canva-purple-and-red-leaves-illustration-children%27s-book-cover-hNI7HYnNVQQ.jpg",
                "luo narrative",
                "long description"));

        books.add(new Book(
                3,
                "Winter Solace",
                "Angelina McDunnel",
                315,
                "https://lh3.googleusercontent.com/proxy/Vv7soqhyJVvFgyjsADbAw7Uhi0K42BS_uZD6QFuLOMcOgHE57ob4eleBWGw_ZD4Ebv0Gl_b2zC9bAaY1TcWZGhTCHJWlCzxxEawGi07pgy-xEBlKtB5NLh8N9moQx5mPbFwtzI9ozg",
                "luo narrative",
                "long description"));
        adapter.setBooks(books);
    }
}