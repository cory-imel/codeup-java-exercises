package grades;

import java.util.ArrayList;
import java.util.HashMap;
import util.Input;

public class GradesApplication {
    private static HashMap<String, Student> students = new HashMap<>();


    public static void main(String[] args) {
        Input input = new Input();

        initializeStudents();
        System.out.println();

        System.out.println("Would you like to display all of the students?");
        boolean all = input.yesNo();
        if(all) {
            displayAll();
        }else {
            displayPrompt();
        }
    }


    private static void initializeStudents() {

        students.put("xoxide", new Student("Cory"));
        students.put("abbyperez28", new Student("Abby"));
        students.put("acano0824", new Student("Ash"));
        students.put("aggiefan17", new Student("Terry"));
        System.out.printf("Welcome!%n%n");
        System.out.printf("Here are the github usernames of our students:%n");
        students.forEach((k, v) -> {
            v.addGrade(((int) (Math.random() * ((100 - 60) + 1)) + 60));
            v.addGrade(((int) (Math.random() * ((100 - 60) + 1)) + 60));
            v.addGrade(((int) (Math.random() * ((100 - 60) + 1)) + 60));
            System.out.printf("|%s|  ", k);
        });
        System.out.println();
    }

    private static void displayAll() {
            System.out.println();
            System.out.printf("What student would you like to see more information on?%n");

            students.forEach((k, student) -> {
                final ArrayList<Integer> grades;
                grades = student.getGrades();
                System.out.printf("Name: %s - Github Username: %s%n", student.getName(), k);
                System.out.print("Grades: ");
                for (int grade : grades) {
                    System.out.printf("%d ", grade);
                }
                System.out.println();
                System.out.printf("Current Average: %d%n", (int) student.getGradeAverage());
                System.out.println();
            });
        System.out.println("Goodbye, and have a wonderful day!");
    }

    private static void displayPrompt() {
        Input input = new Input();
        String userIn;
        ArrayList<Integer> grades;

        System.out.println();
        System.out.printf("What student would you like to see more information on?%n");

        userIn = input.getString().toLowerCase();

        if (students.containsKey(userIn)) {
            grades = students.get(userIn).getGrades();

            System.out.printf("Name: %s - Github Username: %s%n", students.get(userIn).getName(), userIn);
            System.out.print("Grades: ");
            for (int grade : grades) {
                System.out.printf("%d ", grade);
            }
            System.out.println();
            System.out.printf("Current Average: %d%n", (int) students.get(userIn).getGradeAverage());
            System.out.println();
            System.out.println("Would you like to see another student?");

        } else {

            System.out.printf("Sorry, no student found with the gihub username of %s.%n", userIn);
            displayPrompt();
        }


        if (input.yesNo()) {

            displayPrompt();

        } else {
            System.out.println("Goodbye, and have a wonderful day!");
        }
    }
}

