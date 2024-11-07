/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication29;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int num, potencia;
        
        
        int resu =1;
        
  System.out.println("Introduce el numero: ");
  num= captu.nextInt();
      
        potencia= captu.nextInt();
     
  for (int i=1; i <=3; i++)  {
  resu = resu * num;
  }
  System.out.println("El resultado es:" + resu);
  }
    
}
