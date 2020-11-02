package org.example;


import java.io.IOException;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws IOException, SQLException {
        Movies movies = new Movies();
        movies.createDataBaseMovies();

    }
}
