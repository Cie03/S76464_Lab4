/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import java.util.Scanner;

public class Lab4e1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer");
        int num1 = input.nextInt();
        System.out.println("Enter second integer");
        int num2 = input.nextInt();
        int square1 = num1*num1;
        int square2 = num2*num2;
        int sumSquare = square1+square2;
        int diffSquare = square1-square2;
        
        System.out.println("square1 " +num1+ "is:" +square1);
        System.out.println("square2 " +num2+ "is:" +square2);
        System.out.println("sumSquare is:"+ sumSquare);
        System.out.println("diffSquare is:" +diffSquare);
                
        
    }
}
