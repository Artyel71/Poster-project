package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.MovieManager;

public class MovieManagerTest {

    @Test
    void shouldAddMovie() {
        MovieManager film = new MovieManager();
        film.add("m1");
        film.add("m2");
        film.add("m3");
        film.add("m4");
        String[] expected = {"m1", "m2", "m3", "m4"};
        String[] actual = film.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastWithLimit() {
        MovieManager film = new MovieManager(3);
        film.add("m1");
        film.add("m2");
        film.add("m3");
        film.add("m4");
        String[] expected = {"m4", "m3", "m2"};
        String[] actual = film.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastFive() {
        MovieManager film = new MovieManager();
        film.add("m1");
        film.add("m2");
        film.add("m3");
        film.add("m4");
        film.add("m5");
        film.add("m6");
        film.add("m7");
        String[] expected = {"m7", "m6", "m5", "m4", "m3"};
        String[] actual = film.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindWhenLessThenLimit() {
        MovieManager film = new MovieManager(7);
        film.add("m1");
        film.add("m2");
        film.add("m3");
        String[] expected = {"m3", "m2", "m1"};
        String[] actual = film.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void ShouldFindIfMoviesEqualLimit() {
        MovieManager film = new MovieManager(3);
        film.add("m1");
        film.add("m2");
        film.add("m3");
        String[] expected = {"m3", "m2", "m1"};
        String[] actual = film.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindIfNoMovies() {
        MovieManager film = new MovieManager();
        String[] expected = {};
        String[] actual = film.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}

