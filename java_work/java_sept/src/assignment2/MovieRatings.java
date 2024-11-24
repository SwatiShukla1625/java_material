package assignment2;

public class MovieRatings {
    public static void main(String[] args) {
        String[] movies = {"Inception", "The Dark Knight", "Interstellar", "Parasite", "The Matrix"};
        int[] ratings = {5, 4, 5, 3, 4};

        int highestRatingIndex = 0;
        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] > ratings[highestRatingIndex]) {
                highestRatingIndex = i;
            }
        }

        System.out.println("The highest-rated movie is: " + movies[highestRatingIndex] +
                " with a rating of " + ratings[highestRatingIndex] + "/5.");
    }
    }


