package ru.netology.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void shouldAddMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldShowMovie() {
        MovieManager manager = new MovieManager();


        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovieAndMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Белград");

        String[] expected = {"Бладшот", "Вперед", "Белград"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovieUnderLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Белград");
        manager.addMovie("Джентельмены");

        String[] expected = {"Джентельмены", "Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastEqualsLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");


        String[] expected = {"Человек-невидимка", "Джентельмены", "Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastOverLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");


        String[] expected = {"Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Белград", "Вперед"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
