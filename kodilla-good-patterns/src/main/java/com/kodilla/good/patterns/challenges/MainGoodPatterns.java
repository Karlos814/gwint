package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MainGoodPatterns {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String movies = movieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getValue())
                .map(l -> String.join("!", l))
                .collect(Collectors.joining("!"));

        System.out.println(movies);

    }
}
