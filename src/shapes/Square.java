package shapes;

class Square extends Quadrilateral implements Measurable{
    public Square(int side) {
        width = side;
        length = side;
//        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public void setWidth(int side) {
        width = side;
        length = side;
    }

    public void setLength(int side) {
        length = side;
        width = side;
    }
}