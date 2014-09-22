//Holland Roza
//September 23, 2014
//CSE 002
//Month java program

//This program prompts the user to enter an integer for the month and then 
//displays the number of days in the month. 

import java.util.Scanner; 
public class Month{
        //main method required for every Java program
        public static void main(String[] args){
            Scanner myScanner;
            myScanner = new Scanner (System.in );
            System.out.print("Enter an int giving the number of the month (1-12):" );
            if (myScanner.hasNextInt()) //confirms number entered is an integer
            {
                int nMonth = myScanner.nextInt();
              if (nMonth<12 && nMonth>0) //checks that the number entered corresponds with a month
                {
                    if(nMonth==1 || nMonth==3 || nMonth==5 || nMonth==7 || nMonth==8 || nMonth==10 || nMonth==12) 
                    //months that have 31 days
                    {
                        System.out.println("The month has 31 days");
                    }
                    else if(nMonth==4 || nMonth==6 || nMonth==9 ||nMonth==11)
                    //months that have 30 days
                    {
                        System.out.println("The month has 30 days");
                    }
                    else if(nMonth==2) //february
                    {
                        System.out.print("Enter an int giving the year: "); //checks for leap year
                        int year = myScanner.nextInt();
                        if(year%4 == 0) 
                        {
                        System.out.println("The month has 29 days"); //prints number of days for leap year 
                        }
                        else
                        {
                            System.out.println("The month has 28 days"); //prints number of days for normal year
                        }
                    }
                }
                else
                {
                    System.out.println("You did not enter an int between 1 and 12"); 
                    //user must enter a number that corresponds to a month
                    return; //ends the program
                }
            }
            else
             {
                System.out.println("You did not enter an int"); //user must enter an integer
                return; //terminates the program
             } 
        }
    }    