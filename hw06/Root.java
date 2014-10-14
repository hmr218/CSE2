//Holland Roza
//October 14, 2014
//CSE 002
//HW06- Root java program

//This program prompts the user for double greater than zero and then 
//uses the bisection method to find the square root of input
//entered by the user.

import java.util.Scanner; //scanner needed for user input
public class Root{

        //main method required for every Java program
        public static void main(String[] args){
            Scanner myScanner; 
            myScanner = new Scanner (System.in );
        
        System.out.print("Enter a double greater than zero: "); //prompts user to enter a double
        double x = myScanner.nextDouble();
        double low = 0; //defines necessary variables
        double high = 1+x;
        double middle = 0;
        
        while((high-low)>0.0000001*(1+x)){ //enters while loop to find the root of the user input
         middle = ((low+high)/2); //begins to find the root of the value entered
        
        if((middle*middle)>x) //
        {
            high = middle; //assigns high value to middle
        }
        else
        {
            low = middle; //assigns low value to middle
        }
        }
        
        System.out.println("Interval: ["+ low + ", " + high + "]"); //prints the interval: low to high
        System.out.println("The square root is: " + middle);//prints the square root of user input
    }
}        