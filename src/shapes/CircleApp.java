package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Let's create a circle!");

        System.out.println("Please provide a radius for your circle");
        double radius = input.getDouble();

        Circle myCircle = new Circle(radius);

        System.out.println("Here's the area: " + myCircle.getArea());

        System.out.println("Here's the circumference: " + myCircle.getCircumference());
    }
}