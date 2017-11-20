import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
          int i;
          long square, cube;
          long count = 0;
          int fbCount = 0;
          String answer;
          boolean doItAgain = false;
          int gradeNumber;




//        while (i <= 15){
//            System.out.println(i++ + "\n");
//        }

            for (i = 5; i <= 15; i++){
                System.out.println(i + "\n");
            }

//        do {
//            System.out.println(count *= count);
//            System.out.println("\n");
//        }while (count < 1000000);

        for (count = 2; count < 10000000; count *= count){
            System.out.println(count + "\n");
        }


        while (fbCount++ < 100){
            if(0 == fbCount % 3 && 0 == fbCount % 5){
                System.out.println("FizzBuzz!");
            } else if (0 == fbCount % 3){
                System.out.println("Fizz");
            } else if (0 == fbCount % 5){
                System.out.println("Buzz");
            } else {
                System.out.println(fbCount);
            }
        }

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("What number would you like to go up to? ");
            count = sc.nextLong();
            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (i = 1; i <= count; i++){
                square = i * i;
                cube = i * i * i;
                System.out.println(i + "       |" + square + "        |" + cube);
            }
            System.out.println("Would you like to continue? (Y)/N: ");
            answer = sc.next();
            doItAgain = answer.equalsIgnoreCase("y");
            } while (doItAgain);


        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("What grade would you like to convert? 0-100 ");
            gradeNumber = sc.nextInt();
            if (gradeNumber >= 97){
                System.out.println("A+");
            } else if (gradeNumber >= 93){
                System.out.println("A");
            } else if (gradeNumber >= 90){
                System.out.println("A-");
            } else if (gradeNumber >= 87){
                System.out.println("B+");
            } else if (gradeNumber >= 83){
                System.out.println("B");
            } else if (gradeNumber >= 80){
                System.out.println("B-");
            } else if (gradeNumber >= 77){
                System.out.println("C+");
            } else if (gradeNumber >= 73){
                System.out.println("C");
            } else if (gradeNumber >= 70){
                System.out.println("C-");
            } else if (gradeNumber >= 67){
                System.out.println("D+");
            } else if (gradeNumber >= 63){
                System.out.println("D");
            } else if (gradeNumber >= 60){
                System.out.println("D-");
            }else{
                System.out.println("F");
            }
            System.out.println("Would you like to continue? (Y)/N: ");
            answer = sc.next();
            doItAgain = answer.equalsIgnoreCase("y");
            } while (doItAgain);
    }
}