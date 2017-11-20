import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String questionAns = "Sure.";
        String yellingAns = "Whoa, chill out!";
        String emptyAns = "Fine. Be that way!";
        String whatever = "Whatever.";
        String input;
        Scanner sc = new Scanner(System.in);


        System.out.println("What would you like to say to bob?");
        input = sc.nextLine();

        if (input.contains("?")){
            System.out.println(questionAns);
        } else if (input.equals("") || input.equals("\n") || input.equals(" ")){
            System.out.println(emptyAns);
        } else if (input.equals(input.toUpperCase())){
            System.out.println(yellingAns);
        }else {
            System.out.println(whatever);
        }
    }
}