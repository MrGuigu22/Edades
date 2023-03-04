/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.edades;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class Edades {
    
    public static void main(String[] args) {
       float juan;
       Scanner entrada = new Scanner(System.in);
       juan = entrada.nextInt();
       float ana = (juan/3)*4;
       float alberto = (juan/3)*2;
       float mama = (juan + alberto + ana);
       System.out.println("juan tiene " + juan + " años");
       System.out.println("ana tiene " + ana + " años");
       System.out.println("alberto tiene " + alberto + " años");
       System.out.println("la madre tiene " + mama + " años");
    }
}
