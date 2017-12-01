package util;

import java.util.Scanner;

public class Input {
    private Scanner scan;

    public Input() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString() {
        return this.scan.nextLine();
    }

    public boolean yesNo() {
        String input = this.scan.next();
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max) {
        System.out.println("Please input an integer between " + min + " and " + max);

        int userInput = this.getInt();

        if(userInput > max || userInput < min) {
            return getInt(min, max);
        } else {
            return userInput;
        }
    }

    public int getInt() {
        if (this.scan.hasNextInt()){
            return this.scan.nextInt();
        }else{
            System.out.println("The input was invalid, please try again:");
            this.scan.next();
            return getInt();
        }
    }


    public double getDouble(double min, double max) {
        System.out.println("Please input an decimal number between " + min + " and " + max);

        double userInput = this.getDouble();

        if(userInput > max || userInput < min) {
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }

    public double getDouble() {
        if (this.scan.hasNextDouble()){
            return this.scan.nextDouble();
        }else{
            System.out.println("The input was invalid, please try again:");
            this.scan.next();
            return getDouble();
        }
    }
}
