public class Square extends Shape {

    private Point zeroPoint;
    private int height;

    public Square(int x, int y, int height) {
        this.zeroPoint = new Point(x,y);
        this.height = height;
    }

    public Square() {
    }

    @Override
    public double getPerimetr() {
        return height * 4;
    }

    @Override
    public double getArea() {
        return height * height;
    }

    @Override
    public String toString() {
        return "Square{Area: " + getArea() +  " Perimetr: " + getPerimetr() + "}";
    }
}
