//Holland Roza
//September 16, 2014
//CSE 002
//Root java program
//

//This program prompts the user to enter a double and then prints
//out an estimate of the cube root of the number and the value of 
//this estimate when cubed. 

import java.util.Scanner;
public class Root {
    
    public static void main(String[] args) {
        Scanner myScanner;
            myScanner = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        double number = myScanner.nextDouble();
        double guess = number/3;
        guess = (2*guess*guess*guess+number)/(3*guess*guess);
        guess = (2*guess*guess*guess+number)/(3*guess*guess);
        guess = (2*guess*guess*guess+number)/(3*guess*guess);
        guess = (2*guess*guess*guess+number)/(3*guess*guess);
        guess = (2*guess*guess*guess+number)/(3*guess*guess);
       
        System.out.println("The cube root of the number is: " +guess);
        double answer = guess*guess*guess;
        System.out.println(guess + " * " +guess+ " * " +guess+ " = " +answer);
    }
}