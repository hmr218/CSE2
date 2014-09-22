//Holland Roza
//September 23, 2014
//CSE 002
//IncomeTax java program

//This program prompts the user to enter an int that gives the thousands
//of dollars of income and then writes out the amount of tax on the income, 
//given a progressive schedule.

import java.util.Scanner; 
public class IncomeTax{
        //main method required for every Java program
        public static void main(String[] args){
            Scanner myScanner;
            myScanner = new Scanner (System.in );
            
            //declaring variables for tax percent and the total amount of tax
            double tax$ = 0;
            double taxTotal$ = 0;
            
            System.out.print("Enter an int giving the number of thousands- ");
            if (myScanner.hasNextInt())
            {
                int nIncome$ = myScanner.nextInt(); 
                
              if (nIncome$>0) //confirms that number entered is positive
                {
                    if(nIncome$<20)
                    {
                        tax$ = .05; 
                        taxTotal$ = nIncome$*tax$;
                        //assigns tax rate of 5% if income is less than $20,000,
                        //calculates total tax amount
                    }
                    if(nIncome$ >= 20 && nIncome$ < 40)
                    {
                        tax$ = .07;
                        taxTotal$ = nIncome$*tax$;
                        //assigns tax rate of 7% if income is less than $40,000,
                        //calculates total tax amount
                    }
                    if(nIncome$ >= 40 && nIncome$ < 78)
                    {
                        tax$ = .12;
                        taxTotal$ = nIncome$*tax$;
                        //assigns tax rate of 12% if income is less than $78,000,
                        //calculates total tax amount
                    }
                    if(nIncome$ >= 78)
                    {
                        tax$ = .14;
                        taxTotal$ = nIncome$*tax$;
                        //assigns tax rate of 14% if income is greater than $78,000
                        //calculates total tax amount
                    }
                 nIncome$ = nIncome$*1000; //converts income entered to thousands
                 System.out.println("The tax rate on $" + nIncome$ + " is " + tax$*100 + 
                 "%, and the tax is $" + taxTotal$*1000);   
                }
              else
              {
                  System.out.println("You did not enter a positive int");
                  return; //ends program
              }
            }
            else
            {
                System.out.println("You did not enter an int");
                return; //ends program
            }
        }
}