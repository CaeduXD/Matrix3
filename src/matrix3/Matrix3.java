/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix3;

/**
 *
 * @author Carlos e Marcelo
 */

import java.util.ArrayList;
import java.util.Scanner;


public class Matrix3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner ler = new Scanner(System.in);
ArrayList<Integer> matrix = new ArrayList<>();
 
    for (int i=0; i<3; i++) {
      System.out.printf("Informe os elementos %da. linha:\n", (i+1));
      for (int j=0; j<3; j++) {
        System.out.printf("m[%d][%d] = ", i, j);
        matrix.add(ler.nextInt());
      }
      System.out.printf("\n");
    }
 
    System.out.printf("\n");
    int h = 0;
    for (int i=0; i<3; i++) {
      System.out.printf("%da. linha: ", (i+1));
      for (int j=0; j<3; j++) {
        System.out.printf("%d ", matrix.get(h));
        h++;
      }
      System.out.printf("\n");
    }    
    
    int diag1 = matrix.get(0) * matrix.get(4) * matrix.get(8);
    int diag2 = matrix.get(1) * matrix.get(5) * matrix.get(6);
    int diag3 = matrix.get(2) * matrix.get(3) * matrix.get(7);
    int diag4 = matrix.get(2) * matrix.get(4) * matrix.get(6);
    int diag5 = matrix.get(0) * matrix.get(5) * matrix.get(7);
    int diag6 = matrix.get(1) * matrix.get(3) * matrix.get(8);
    
    int soma1 = diag1 + diag2 + diag3;
    int soma2 = diag4 + diag5 + diag6;
    
    int det = soma1 - soma2;
    
    System.out.printf("\nO determinante da matriz 3x3 é %d\n",det);
    
  }
}