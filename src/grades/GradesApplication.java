package grades;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        students.put("xoxide", new Student("Cory"));
        students.put("abbyperez28", new Student("Abby"));
        students.put("acano0824", new Student("Ash"));
        students.put("aggiefan17", new Student("Terry"));

        for(Map.Entry<String, Student> e : students.entrySet()){
            e.getValue().addGrade(((int)(Math.random() * ((100 - 50) + 1)) + 50));
            e.getValue().addGrade(((int)(Math.random() * ((100 - 50) + 1)) + 50));
            e.getValue().addGrade(((int)(Math.random() * ((100 - 50) + 1)) + 50));
        }

        System.out.println(students.get("xoxide").getGradeAverage());

    }
}
