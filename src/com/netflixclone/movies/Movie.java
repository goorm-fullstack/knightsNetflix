package com.netflixclone.movies;

public class Movie {
    private String title;
    private int releaseYear;
    private String genre;

    public Movie(String title, int releaseYear, String genre) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "NetflixMovie{" +
                "title='" + title + '\'' +
                ", release=" + releaseYear +
                ", genre='" + genre + '\'' +
                '}';
    }
}

class ActionMovie extends Movie {
    public ActionMovie(String title, int release) {
        super(title, release, "Action");
    }
}

class DramaMovie extends Movie {
    public DramaMovie(String title, int release) {
        super(title, release, "Drama");
    }
}
