//Holland Roza
//September 23, 2014
//CSE 002
//CourseNumber java program

//This program during which a course is offered at Lehigh is 
//given by a 6 digit number. The first four digits give the year, 
//and the last two digits give the semester: 10 spring, 20 summer 1, 
//30 summer 2, and 40 fall.

import java.util.Scanner; 
public class CourseNumber{
        //main method required for every Java program
        public static void main(String[] args){
            Scanner myScanner;
            myScanner = new Scanner (System.in );
            
            //defines variables
            int number1;
            int year;
            int number2;
            int semester;
            String course = "";
            
            System.out.print("Enter a six digit number giving the course semester: ");
            int number = myScanner.nextInt();
            if (number>186509 && number<201441) 
            //confirms number entered is a legitimate year
            {
               number1 = number/100; 
               year = (int)number1; //makes year an integer, 
               //cutting off the last 2 digits of nuber entered
               number2 = year*100;
               semester = number-number2; //defines semester as last 2 digits
               //of the number entered
               
                if(semester == 10) //defines the course String variable
                {
                    course = "Spring";
                }
                if(semester == 20)
                {
                    course = "Summer 1";
                }
                if(semester == 30)
                {
                    course = "Summer 2";
                }
                if(semester == 40)
                {
                    course = "Fall";
                }
                if(semester == 10 || semester == 20 || semester == 30 || semester == 40)
                {
                    System.out.println("The course was offered in the " + course + " semester of " + year);
                }
                else
                {
                    System.out.println(semester + " is not a legitimate semester");
                    return; //ends the program if semester entered isn't 10,20,30 or 40
                }
            }
            else
            {
                System.out.println("The number was outside the range [186510,201440]");
                return; //ends the program
            }
        }
}    