public class Triangle extends Shape {

    private Point a;
    private Point b;
    private Point c;
    private double lineAB;
    private double lineBC;
    private double lineAC;

    public Triangle(int aX, int aY, int bX, int bY, int cX, int cY) {
        this.a = new Point(aX,aY);
        this.b = new Point(bX,bY);
        this.c = new Point(cX,cY);
        this.lineAB = getLine(a,b);
        this.lineBC = getLine(b,c);
        this.lineAC = getLine(a,c);
    }

    private final double getLine(Point a, Point b){
        return Math.sqrt(Math.pow((b.getX() - a.getX()),2) + Math.pow((b.getY() - a.getY()),2));
    }

    @Override
    public double getPerimetr() {
        return lineAB + lineBC + lineAC;
    }

    @Override
    public double getArea() {
        double p = getPerimetr() / 2;
        return Math.sqrt(p * (p - lineAC) * (p - lineBC) * (p - lineAB));
    }

    @Override
    public String toString() {
        return "Triangle{ Area: " + getArea() +  " Perimetr: " + getPerimetr() + "}";
    }
}
