package shapes;

class Square extends Quadrilateral implements Measurable{
    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public void setWidth(int input) {
        width = input;
        length = input;
    }

    public void setLength(int input) {
        length = input;
        width = input;
    }
}