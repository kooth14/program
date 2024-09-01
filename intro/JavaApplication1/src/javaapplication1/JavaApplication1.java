/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaApplication1;
import java.util.*;
/**
 *
 * @author Sistemas33
 */
public class JavaApplication1 {
    
    static int i;
    static int j;
    static int k;
    static int aux;
    static Scanner rm = new Scanner(System.in);
    static int[] n = new int[10];
    
    static void array(){
         System.out.println("Array original:");
            for (i = 0; i < 10; i++) {
                 n[i] = (int)(Math.random() * 10);
                 System.out.print(n[i] + " ");
    }
    }
    
    static void primo(){
       
    for (i = 0; i < 10; i++) {
      
      j = i;
      while ((n[j++] % 3 != 0) && (j < 10));
      
      if (j < 10) {
        for (k = j - 1; k > i; k--) {
          aux = n[k];
          n[k] = n[k - 1];
          n[k - 1] = aux;
        }
      }
    }

    System.out.println("\nArray con los primos al principio:");
    for (i = 0; i < 10; i++) {
      System.out.print(n[i] + " ");
    }
  
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        array();
        primo();
    }
}
