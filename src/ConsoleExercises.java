import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double firstInt, area, length, width, perimeter, volume;
        String firstWord, secondWord, thirdWord;
        String firstSentance;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input a number: ");
        firstInt = sc.nextInt();
        System.out.println(firstInt);

        System.out.println("Please input three words: ");
        firstWord = sc.next();
        secondWord = sc.next();
        thirdWord = sc.next();
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

        System.out.println("Please input a sentence: ");
        sc.nextLine();
        firstSentance = sc.nextLine();
        System.out.println(firstSentance);


        System.out.println("Please input the classroom length: ");
        length = sc.nextDouble();
        System.out.println("Please input the classroom width: ");
        width = sc.nextDouble();
        area = length * width;
        perimeter = 2 * length + 2 * width;
        volume = area * 2;
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The volume is: " + volume);
    }
}