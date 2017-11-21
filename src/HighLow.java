import java.util.Scanner;

class HighLow{
    public static void main(String[] args) {
        int guesses = 0;
        Scanner sc = new Scanner(System.in);
        play(sc, guesses);
    }
    private static void play(Scanner sc, int guesses){
        String response;
        int number = getRandom();
        int input = getUserInput(sc);
        guesses++;
        if(input == number){
            System.out.println("GOOD GUESS!");
        } else if (input > number){
            System.out.println("LOWER");
        }else{
            System.out.println("HIGHER");
        }
        System.out.println("Number of guesses: "+ guesses + "\n"+
                        "Would you like to guess again? ");
        response = sc.next();
        if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes") && guesses < 10) {
            play(sc, guesses);
        }
    }
    private static int getRandom(){
        return (int) (Math.random() * 100 +1);
    }
    private static int getUserInput(Scanner sc){
        System.out.printf("Enter a number between 1 and 100: ");
        int input = sc.nextInt();
        if(!(input >= 1 && input <= 100)){
            input = getUserInput(sc);
        }
        return input;
    }
}