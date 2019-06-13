package lab5;
import java.util.Scanner;


public class MatrixModel {

    private Matrix A;
    private Matrix B;
    private Matrix C;

    public Matrix getMatrix(char M){
        if(M=='A') return A;
        if(M=='B') return B;
        if(M=='C') return C;
        else{
            return null;
        }
    }
    public void setAB(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj ilosc wierszy macierzy A: ");
        int wA = scan.nextInt();
        System.out.print("Podaj ilosc kolumn macierzy A: ");
        int kA = scan.nextInt();
        System.out.print("Podaj ilosc wierszy macierzy B: ");
        int wB = scan.nextInt();
        System.out.print("Podaj ilosc kolumn macierzy B: ");
        int kB = scan.nextInt();

        A = new Matrix(wA, kA);
        B = new Matrix(wB, kB);
    }

    public String matrixToString(char M){
        Matrix temp;
        String stringOfMatrix = "";
        if(M == 'A') {
            temp = A;
        }
        else if(M == 'B'){
            temp = B;
        }
        else if(M == 'C'){
            temp = C;
        }
        else {
            System.err.println("Nie ma takiej macierzy!");
            return "ERROR";
        }

        for (int i = 0; i < temp.getMatrix().length; i++) {
            stringOfMatrix+="[";
            for (int j = 0; j < temp.getMatrix()[0].length; j++) {
                stringOfMatrix+=temp.getElement(i, j);
                stringOfMatrix+=", ";
            }
            stringOfMatrix+="]\n";
        }
        return stringOfMatrix;
    }
    public void transpose(char M){
        Matrix temp;
        String stringOfMatrix = "";
        if(M == 'A') {
            temp = A;
        }
        else if(M == 'B'){
            temp = B;
        }
        else if(M == 'C'){
            temp = C;
        }
        else {
            System.out.println("ERROR NIE MA TAKIEJ");
            return;
        }
        int tempTab[][] = new int[temp.getMatrix()[0].length][temp.getMatrix().length];

        for (int i = 0; i < temp.getMatrix().length; i++) {
            for (int j = 0; j < temp.getMatrix()[0].length; j++) {
                tempTab[j][i] = temp.getElement(i, j);
            }
        }
        if(M == 'A') {
            A.setNewTab(tempTab);
        }
        else if(M == 'B'){
            B.setNewTab(tempTab);
        }
        else if(M == 'C'){
            C.setNewTab(tempTab);
        }
    }

    public void multiply(){
        int m = A.getMatrix().length;
        int n = A.getMatrix()[0].length;
        int p = B.getMatrix().length;
        int q = B.getMatrix()[0].length;
        int[][] tempTab = new int[m][q];
        C = new Matrix();

        if(n!=p){
            System.err.println("ERROR: WYMIARY MACIERZY NIE ZGADZAJA SIE");
            return;
        }

        int tempSum = 0;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < q; j++)
            {
                for (int k = 0; k < p; k++)
                {
                    tempSum = tempSum + A.getElement(i, k) * B.getElement(k, j);
                }
                tempTab[i][j] = tempSum;
                tempSum = 0;
            }
        }
        C.setNewTab(tempTab);
    }
}
