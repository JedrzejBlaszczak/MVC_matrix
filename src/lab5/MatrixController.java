package lab5;

import java.util.Scanner;

public class MatrixController {
    private MatrixModel model;
    private MatrixView view;

    public MatrixController(MatrixModel newModel, MatrixView newView){
        this.model = newModel;
        this.view = newView;
    }

    public void enterAB(){
           model.setAB();
    }

    public void transposeAB(){
        try{
            model.transpose('A');
            model.transpose('B');
        }
        catch(java.lang.NullPointerException e){
            System.err.println("Nie zdefiniowano macierzy wejsciowych   "  +e);
        }
    }

    public void multiplyAB(){
        try {
            model.multiply();
        }
        catch(java.lang.NullPointerException e){
            System.err.println("Nie zdefiniowano macierzy wejsciowych   "  +e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Niezgodne wymiary macierzy wejsciowych   "  +e);
        }
    }

    public void transposeC(){
        try {
            model.transpose('C');
        }
        catch(java.lang.NullPointerException e){
            System.err.println("Macierz wynikowa nie istnieje    " +e);
        }
    }

    public void printAB(){
        view.printMatrix(model.matrixToString('A'));
        view.printMatrix(model.matrixToString('B'));
    }

    public void printC(){
        view.printMatrix(model.matrixToString('C'));
    }

    public void menu(){
        int action = 0;
        view.printMenu();
        Scanner scan = new Scanner(System.in);
        action = scan.nextInt();

        switch(action) {
            case 1:
                enterAB();
                break;
            case 2:
                transposeAB();
                break;
            case 3:
                multiplyAB();
                break;
            case 4:
                transposeC();
                break;
            case 5:
                printAB();
                break;
            case 6:
                printC();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.err.println("Wybrano niezdefiniowana akcje!");
                break;
        }
    }
}
