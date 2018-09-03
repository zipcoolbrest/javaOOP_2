public class Circle extends Shape {
    private Point center;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.center = new Point(x,y);
        this.radius = radius;
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{Area: " + getArea() +  " Perimetr: " + getPerimetr() + "}";
    }
}
