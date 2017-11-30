package shapes;

public abstract class Quadrilateral extends Shape {
    protected int width;
    protected int length;

    public Quadrilateral(){

    }

    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getWidth() {

        return width;
    }

    public int getLength() {

        return length;
    }

    public abstract void setWidth(int input);

    public abstract void setLength(int input);


}
