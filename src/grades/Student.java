package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        int sum = 0;
        if(!grades.isEmpty()) {
            for (int grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }
        return sum;
    }

//    public static void main(String[] args) {
//        Student student1 = new Student("Robby");
//
//        student1.addGrade(75);
//        student1.addGrade(50);
//        student1.addGrade(90);
//        System.out.println(student1.getName());
//        System.out.println(student1.getGradeAverage());
//
//    }
}
