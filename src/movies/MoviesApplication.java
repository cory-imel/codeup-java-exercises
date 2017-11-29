package movies;

import util.Input;

public class MoviesApplication {
    private static Movie all[] = MoviesArray.findAll();
    private static Movie sorted[][] = new Movie[4][100];


    public static void main(String[] args) {
        sortMovies(all);
//        Input ask = new Input();
//        System.out.println();
//        ask.getString();
//getAllMovies(all);
        System.out.println(getAllMovies(sorted));
    }

    private static String getAllMovies(Movie movies[][]){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i <= 4; i++){
            for (int j = 0; j <= 100; j++) {
                builder.append(String.format("%s -- %s%n", movies[i][j].getName(), movies[i][j].getCategory()));
            }
        }
        return builder.toString();
    }

    private static void sortMovies(Movie movies[]) {
        for (int i = 0; i < movies.length - 1; i++) {
            switch (movies[i].getCategory()) {
                case "animated":
                    sorted[0][i] = movies[i];
                    break;
                case "drama":
                    sorted[1][i] = movies[i];
                    break;
                case "horror":
                    sorted[2][i] = movies[i];
                    break;
                case "scifi":
                    sorted[3][i] = movies[i];
                    break;
            }
        }
        System.out.println(sorted[0][0]);
    }

}
