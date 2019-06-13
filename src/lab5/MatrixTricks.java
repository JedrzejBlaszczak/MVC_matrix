package lab5;

public class MatrixTricks {
    public static void main(String[] args) {
        MatrixModel model = new MatrixModel();
        MatrixView view = new MatrixView();
        MatrixController controller = new MatrixController(model, view);

       while(true){
           controller.menu();
       }
    }
}
