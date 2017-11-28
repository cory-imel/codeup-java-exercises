package movies;

import util.Input;

public class MoviesApplication {
    private static Movie all[] = MoviesArray.findAll();


    public static void main(String[] args) {
//        Input ask = new Input();
//        System.out.println();
//        ask.getString();

        System.out.println(getAllMovies(all));
    }

    public static String getAllMovies(Movie movies[]){
        StringBuilder builder = new StringBuilder();
        for (Movie movie : movies){
             builder.append(String.format("%s -- %s%n",movie.getName(),movie.getCategory()));
        }
        return builder.toString();
    }

}
