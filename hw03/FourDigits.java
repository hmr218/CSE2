//Holland Roza
//September 16, 2014
//CSE 002
//FourDigits java program
//

//This program prompts the user to enter a double and
//then prints out the first four digits to the right
//of the decimal point. 

import java.util.Scanner;
public class FourDigits {
    
    public static void main(String[] args){
        Scanner myScanner;
            myScanner = new Scanner (System.in);
            System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
            double x = myScanner.nextDouble();
            
            
            int number = (int)(x*10000);
            
            int number1 = number%10;
            number= number/10;
            
            int number2 = number%10;
            number= number/10;
            
            int number3 = number%10;
            number= number/10;
            
            int number4 = number%10;
            number= number/10;
            
            System.out.println("The four digits are: " +number4+number3+number2+number1);
    }
}