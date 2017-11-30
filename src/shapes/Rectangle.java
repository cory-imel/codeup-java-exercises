package shapes;

class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    public void setWidth(int side) {
        width = side;
    }

    public void setLength(int side) {
        length = side;
    }
}