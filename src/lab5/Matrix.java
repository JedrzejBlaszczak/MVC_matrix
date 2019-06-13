package lab5;

import java.util.Scanner;

class Matrix {
    private int tab[][];

    public int getElement(int x, int y){
        return tab[x][y];
    }

    public int[][] getMatrix(){
        return tab;
    }

    public void setNewTab(int[][] newTab){
        tab = newTab;
    }

    public Matrix(){

    }

    public Matrix(int x, int y){
        tab = new int[x][y];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<x ; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Podaj element " + i + "." + j + " macierzy: ");
                tab[i][j] = scan.nextInt();
            }
        }
    }
}
