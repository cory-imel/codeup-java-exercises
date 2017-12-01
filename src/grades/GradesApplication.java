package grades;

import java.util.HashMap;
import java.util.Map;

import util.Input;

public class GradesApplication {
    private static HashMap<String, Student> students = new HashMap<>();

    public static void main(String[] args) {

        initializeStudents();
        displayPrompt();

    }


    public static void initializeStudents(){

        students.put("xoxide", new Student("Cory"));
        students.put("abbyperez28", new Student("Abby"));
        students.put("acano0824", new Student("Ash"));
        students.put("aggiefan17", new Student("Terry"));
        System.out.printf("Welcome!%n%n");
        System.out.println("Here are the github usernames of our students:\n");
        students.forEach((k,v) ->  {
            v.addGrade(((int)(Math.random() * ((100 - 60) + 1)) + 60));
            v.addGrade(((int)(Math.random() * ((100 - 60) + 1)) + 60));
            v.addGrade(((int)(Math.random() * ((100 - 60) + 1)) + 60));
            System.out.printf("|%s|  ",k);
        });
        System.out.println();
        System.out.println();
    }

    public static void displayPrompt(){
        Input input = new Input();
        String userIn;

        System.out.println("What student would you like to see more information on?\n");
        userIn = input.getString().toLowerCase();

        if(students.containsKey(userIn)) {
            for (Map.Entry<String, Student> e : students.entrySet()) {
                if (e.getKey().equals(userIn)) {
                    System.out.println();
                    System.out.printf("Name: %s - Github Username: %s%n",e.getValue().getName(),e.getKey());
                    System.out.printf("Current Average: %d%n%n",(int) e.getValue().getGradeAverage());
                }
            }
        }else{
            System.out.printf("Sorry, no student found with the gihub username of %s.%n",userIn);
            displayPrompt();
        }

        System.out.println("Would you like to see another student?\n");

        if (input.yesNo()){

            displayPrompt();
        }

        System.out.println("Goodbye, and have a wonderful day!");
    }
}
