//Holland Roza 
//September 19, 2014 
//CSE 002 
//BigMacAgain java program 

//This program uses the Scanner class to obtain from users how many Big Macs 
//they want and whether they want an order of fries. It then prints out the 
//total cost of the meal.

import java.util.Scanner; 
public class BigMacAgain {
        //main method required for every Java program
        public static void main(String[] args){
            Scanner myScanner;
            myScanner = new Scanner (System.in );
            
            System.out.print("Enter the number of Big Macs: ");
            if (myScanner.hasNextInt())
            {
                int nBigMacs = myScanner.nextInt();
              if (nBigMacs>0)
                {
                double costBigMacs$ = 2.22*nBigMacs;
                System.out.println("You ordered " + nBigMacs + " for a cost of " + nBigMacs + "x2.22= " + costBigMacs$);
                System.out.print("Do you want an order of fries (Y/y/N/n)? ");
                String answer = myScanner.next();
            
                if (answer.equals("Y") || answer.equals("y"))
            { 
                double fries$ = 2.15;
                System.out.println("You ordered fries at a cost of $2.15");
                double totalCost$ = fries$+costBigMacs$;
                System.out.println("The total cost of the meal is $" + totalCost$);
                
            }
            else if(answer.equals("n") || answer.equals("N"))
            {
                System.out.println("The total cost of the meal is $" + costBigMacs$);
                
            }
            else{
                System.out.println("You did not enter one of 'y', 'Y', 'N', 'n' ");
                return;} //leaves the program, i.e. the program terminates
                }
                else
                {
                    System.out.println("You did not enter an int > 0");
                return;
                    
                } //leaves the program
            }
            else{
                System.out.println("You did not enter an int");
                return;} //leaves the program, i.e. the program terminates
        }//end of main method    
}//end of class