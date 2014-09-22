//Holland Roza
//September 23, 2014
//CSE 002
//TimePadding java program

//This program prompts the user to enter an integer for the month and then 
//displays the number of days in the month. 

import java.util.Scanner; 
public class TimePadding{
        //main method required for every Java program
        public static void main(String[] args){
            Scanner myScanner;
            myScanner = new Scanner (System.in );
            
            //defines variables
            int hours;
            int minutes;
            int seconds;
            
            System.out.print("Enter the time in seconds (a positive int): ");
            if (myScanner.hasNextInt()) //confirms time entered is an int
            {
                int nSeconds = myScanner.nextInt();
                hours = nSeconds/3600; 
                //defines number of hours passed in the day
                
                int nLeftover = (nSeconds-(hours*3600));
                minutes = (nLeftover)/60;
                //defines number of extra minutes passed in the day
                
                seconds = (nLeftover-(minutes*60)); 
                //defines number of extra seconds passed in the day
                   
                if(minutes<10 && seconds<10)
                {
                    System.out.println("The time is " + hours + ":0" + minutes + ":0" + seconds);
                }
                else if(minutes>=10 && seconds<10)
                {
                    System.out.println("The time is " + hours + ":" + minutes + ":0" + seconds);
                }
                else if(minutes<10 && seconds>=10)
                {
                    System.out.println("The time is " + hours + ":0" + minutes + ":" + seconds);
                }
                else
                {
                System.out.println("The time is " + hours + ":" + minutes + ":" + seconds);
                }
            }
            else
            {
                System.out.println("You must enter a positive integer");
                return; //ends the program if value entered isn't a positive int
            }
        }
}