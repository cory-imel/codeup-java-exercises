import java.util.Scanner;

class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the first number of the operation");
        int firstNum = sc.nextInt();
        System.out.println("Please input the second number of the operation");
        int secondNum = sc.nextInt();

        System.out.println(add(firstNum,secondNum));
        System.out.println(subtract(firstNum,secondNum));
        System.out.println(multiply(firstNum,secondNum));
        System.out.println(divide(firstNum,secondNum));
        System.out.println(modulus(firstNum,secondNum));
        System.out.println(getInteger(1,10,sc));

    }
    private static int add(int num1, int num2){
        return num1 + num2;
    }
    private static int subtract(int num1, int num2){
        return num1 - num2;
    }
    private static int multiply(int num1, int num2){
        if (num1 != 0 && num2 != 0) {
            if (num2 > 0) {
                return multiply(num1, num2 - 1) + num1;
            } else {
                return multiply(num1, num2 + 1) - num1;
            }
        }
        return 0;
    }
    private static int divide(int num1, int num2){
        if (num1 != 0 && num2 != 0) {
                return num1 / num2;
        }else{
            System.out.println("Does not compute!");
            return 0;
        }
    }
    private static int modulus(int num1, int num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 % num2;
        } else {
            System.out.println("Does not compute!");
            return 0;
        }
    }
    private static int getInteger(int min, int max, Scanner sc){
        System.out.printf("Enter a number between %d and %d: ",min, max);
        int input = sc.nextInt();
        if(!(input >= min && input <= max)){
           input = getInteger(min, max, sc);
        }
        return input;
    }
}
