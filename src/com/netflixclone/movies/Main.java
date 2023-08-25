package com.netflixclone.movies;

public class Main {
    public static void main(String[] args) {
        // NetflixMovie 객체 생성
        Movie movie1 = new Movie("Harry Potter", 2001, "Fantasy");
        Movie movie2 = new Movie("STRANGER THINGS", 2016, "SF");
        Movie movie3 = new Movie("BLACK MIRROR", 2011, "Drama");
        Movie movie4 = new Movie("THE RAIN", 2018, "SF");
        Movie movie5 = new Movie("D.P.", 2023, "Drama");
        Movie movie6 = new Movie("ELITE", 2022, "Drama");
        Movie movie7 = new Movie("M3GAN", 2023, "Horror");
        Movie movie8 = new Movie("About Time", 2013, "Romance");
        Movie movie9 = new ActionMovie("Spider Man", 2002);
        Movie movie10 = new DramaMovie("Breaking Bad", 2013);

        // 출력
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);
        System.out.println(movie4);
        System.out.println(movie5);
        System.out.println(movie6);
        System.out.println(movie7);
        System.out.println(movie8);
        System.out.println(movie9);
        System.out.println(movie10);
    }
}
