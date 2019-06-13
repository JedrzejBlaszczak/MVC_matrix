package lab5;

public class MatrixView {
    public void printMenu(){
        System.out.println("");
        System.out.println("\t MENU");
        System.out.println("");
        System.out.println("(1) - Wprowadz macierze wejsciowe.");
        System.out.println("(2) - Transponuj macierze wejsciowe.");
        System.out.println("(3) - Pomnoz macierze wejsciowe.");
        System.out.println("(4) - Transponuj macierz wynikowa.");
        System.out.println("(5) - Wyswietl macierze wejsciowe.");
        System.out.println("(6) - Wyswietl macierz wynikowa.");
        System.out.println("(7) - Zakoncz.");
        System.out.print("\t\t\t\tWybor: ");
    }
    public void printMatrix(String stringMatrix){
        System.out.println(stringMatrix);
    }
}
