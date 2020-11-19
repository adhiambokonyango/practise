package com.example.practise;

import java.util.ArrayList;

public class Utils {
    private static Utils instance;

    private static ArrayList<Book> allBooks;
    private static ArrayList<Book> alreadyReadBooks;
    private static ArrayList<Book> wantToReadBooks;
    private static ArrayList<Book> currentlyReadingBooks;
    private static ArrayList<Book> favoriteBooks;

    private Utils() {
        if (null == allBooks){
            allBooks = new ArrayList<>();
            initData();
        }
        if (null == alreadyReadBooks){
            alreadyReadBooks = new ArrayList<>();
        }
        if (null == wantToReadBooks){
            wantToReadBooks = new ArrayList<>();
        }
        if (null == currentlyReadingBooks){
            currentlyReadingBooks = new ArrayList<>();
        }
        if (null == favoriteBooks){
            favoriteBooks = new ArrayList<>();
        }
    }

    private void initData() {
        // TODO: add initial data

        allBooks.add(new Book(
                1,
                "Sulwe",
                "lupita",
                15,
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1554153712i/42785750._UY400_SS400_.jpg",
                "luo narrative",
                "long description"));

        allBooks.add(new Book(
                2,
                "Amara the Brave",
                "Matt Zhang",
                315,
                "https://marketplace.canva.com/EAD7WWWtKSQ/1/0/251w/canva-purple-and-red-leaves-illustration-children%27s-book-cover-hNI7HYnNVQQ.jpg",
                "luo narrative",
                "long description"));

        allBooks.add(new Book(
                3,
                "Winter Solace",
                "Angelina McDunnel",
                315,
                "https://lh3.googleusercontent.com/proxy/Vv7soqhyJVvFgyjsADbAw7Uhi0K42BS_uZD6QFuLOMcOgHE57ob4eleBWGw_ZD4Ebv0Gl_b2zC9bAaY1TcWZGhTCHJWlCzxxEawGi07pgy-xEBlKtB5NLh8N9moQx5mPbFwtzI9ozg",
                "luo narrative",
                "long description"));
    }

    public static Utils getInstance() {
        if (null != instance){
            return instance;
        } else {
            instance = new Utils();
            return instance;
        }

    }

    public static ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public static ArrayList<Book> getAlreadyReadBooks() {
        return alreadyReadBooks;
    }

    public static ArrayList<Book> getWantToReadBooks() {
        return wantToReadBooks;
    }

    public static ArrayList<Book> getCurrentlyReadingBooks() {
        return currentlyReadingBooks;
    }

    public static ArrayList<Book> getFavoriteBooks() {
        return favoriteBooks;
    }
}
