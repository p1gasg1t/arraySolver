package org.example;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int contador = 0;
        ArrayList<Integer> nmrs = new ArrayList<Integer>(Arrays.asList(1,2,4,5,7,8));

        for (int n = 1; n <= 9; n++) {
            if (nmrs.contains(n)){
                contador++;
            } else {
                nmrs.add(contador++,n);
            }
        }

        for (int n : nmrs){
            if (n == 4 || n == 7) {
                System.out.print("\n");
            }
            System.out.print(n + " ");
        }
    }
}