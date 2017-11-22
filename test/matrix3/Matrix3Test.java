/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrix3;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eduardo
 */
public class Matrix3Test {
    
    public Matrix3Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class Matrix3.
     */
    @Test
    public void testMain() {
        System.out.println("testMatrix3");
        
        Scanner ler = new Scanner(System.in);
ArrayList<Integer> matrix = new ArrayList<>();
 
    matrix.add(0, 2);
    matrix.add(1, 3);
    matrix.add(2, 1);
    matrix.add(3, 1);
    matrix.add(4, 2);
    matrix.add(5, 4);
    matrix.add(6, 0);
    matrix.add(7, 5);
    matrix.add(8, 1);
    
    int diag1 = matrix.get(0) * matrix.get(4) * matrix.get(8);
    int diag2 = matrix.get(1) * matrix.get(5) * matrix.get(6);
    int diag3 = matrix.get(2) * matrix.get(3) * matrix.get(7);
    int diag4 = matrix.get(2) * matrix.get(4) * matrix.get(6);
    int diag5 = matrix.get(0) * matrix.get(5) * matrix.get(7);
    int diag6 = matrix.get(1) * matrix.get(3) * matrix.get(8);
    
    int soma1 = diag1 + diag2 + diag3;
    int soma2 = diag4 + diag5 + diag6;
    
    int det = soma1 - soma2;
    
    assertEquals(-34, det);
    
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
    
    System.out.printf("\nO determinante da matriz 3x3 é %d\n",det);    
    }
    
}
