import java.util.Arrays;

public class ArrayExercises {

    public static void main(String[] args) {
        int[] returnArray;
        returnArray = new int[100];

        for(int i = 0; i < 99; i++){
           returnArray[i] = getRandomIntBetween(1,100);
        }

        for(int array : returnArray){
            System.out.println(array);
        }

    }

    public static int getRandomIntBetween(int min, int max){
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;


    }
}
