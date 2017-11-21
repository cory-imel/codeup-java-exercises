import java.util.Scanner;

class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the first number of the operation");
        double firstNum = sc.nextDouble();
        System.out.println("Please input the second number of the operation");
        double secondNum = sc.nextDouble();

        System.out.println(add(firstNum,secondNum));
        System.out.println(subtract(firstNum,secondNum));
        System.out.println(multiply(firstNum,secondNum));
        System.out.println(divide(firstNum,secondNum));
        System.out.println(modulus(firstNum,secondNum));


    }

    private static double add(double num1, double num2){
        return num1 + num2;
    }
    private static double subtract(double num1, double num2){
        return num1 - num2;
    }
    private static double multiply(double num1, double num2){
        if (num1 != 0 && num2 != 0) {
            if (num2 > 0) {
                return multiply(num1, num2 - 1) + num1;
            } else {
                return multiply(num1, num2 + 1) - num1;
            }
        }
        return 0;
    }
    private static double divide(double num1, double num2){
        if (num1 != 0 && num2 != 0) {
                return num1 / num2;
        }else{
            System.out.println("Does not compute!");
            return 0;
        }
    }
    private static double modulus(double num1, double num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 % num2;
        } else {
            System.out.println("Does not compute!");
            return 0;
        }
    }
}
