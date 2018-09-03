import java.util.Arrays;

public class Blackboard {
    private Shape [][] board;

    public Blackboard() {
        this.board = new Shape[2][2];
    }

    public void setShape(int partOfBoard, Shape shape){
        switch (partOfBoard){
            case 1:
                    addShape(0,0, shape);
                    break;
            case 2:
                    addShape(0,1, shape);
                    break;
            case 3:
                    addShape(1,0, shape);
                    break;
            case 4:
                    addShape(1,1, shape);
                    break;
        }
    }

    private final void addShape(int posX, int posY, Shape shape){
        if(board[posX][posY] == null){
            board[posX][posY] = shape;
            System.out.println("фигура добавлена");
        }else {
            System.out.println("ячейка занята. удалите фигру чтобы поместить новую.");
        }
    }

    public void delShape(int partOfBoard){
        switch (partOfBoard){
            case 1:
                removeShape(0,0);
                break;
            case 2:
                removeShape(0,1);
                break;
            case 3:
                removeShape(1,0);
                break;
            case 4:
                removeShape(1,1);
                break;
        }
    }

    private final void removeShape(int posX, int posY){
        if(board[posX][posY] != null){
            board[posX][posY] = null;
            System.out.println("фигура удалена");
        }else {
            System.out.println("ячейка пуста.");
        }
    }

    private double getGeneralArea(){
        double area = 0;
        for (int i = 0; i < 2 ; i++) {
            for (int j = 0; j < 2; j++) {
                if(board[i][j] != null) {
                    area += board[i][j].getArea();
                }
            }
        }
        return area;
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < 2 ; i++) {
            for (int j = 0; j < 2; j++) {
                if(board[i][j] != null) {
                    string += board[i][j].toString();
                }
            }
        }
        return String.format("Blackboard{board=%s}\n General Area is %s", string, getGeneralArea());
    }
}
