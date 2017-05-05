/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dumbcalculator;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class DumbCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);
        
        double firstNum, secondNum, thirdNum;
        
        System.out.print("what is your first number? ");
        firstNum = keyboard.nextDouble();
        
        System.out.print("what is your second number? ");
        secondNum = keyboard.nextDouble();
        
        System.out.print("what is your third number? ");
        thirdNum = keyboard.nextDouble();
        
        System.out.println((firstNum + secondNum + thirdNum ) / 2);
        
    }
    
}
