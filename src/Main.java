public class Main {

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void main(String[] args) {
	// write your code here
        Circle circle = new Circle(2,2, 2);
        Square square = new Square(0,0,2);
        Triangle triangle = new Triangle(1,1, -1,2, 2,3 );

        Blackboard blackboard = new Blackboard();

        blackboard.setShape(1, triangle);
        blackboard.setShape(2, square);
        blackboard.setShape(3, circle);


        System.out.println(blackboard.toString());

        blackboard.delShape(1);

        System.out.println(blackboard.toString());
    }
}
