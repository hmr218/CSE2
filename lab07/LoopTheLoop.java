//Holland Roza 
//October 10, 2014 
//CSE 002 
//LoopTheLoop java program 

//This program uses while loops and a break statement to print out stars based 
//on user input. 


import java.util.Scanner; //Scanner necessary for user input
public class LoopTheLoop {
        //main method required for every Java program
        public static void main(String[] args){
            Scanner myScanner;
            myScanner = new Scanner (System.in );
            
            System.out.print("Enter an integer between 1 and 15: "); //prompts user input 
            if(myScanner.hasNextInt()) //checks that input is an integer
            {
                int nStars = myScanner.nextInt();
                
                if(nStars<16 && nStars>0) //checks that input is in the correct range
                {
                    int counter = 1;
                    while(counter<=nStars) //prints the same number of stars as the user input
                    {
                        System.out.print("*");
                        counter++;
                    }
                    System.out.println();
                    String star1 = "*"; //defines variable
                    
                    while(nStars>0) 
                    {
                        System.out.println(star1); //prints remaining output
                        star1 = star1 + "*";
                        nStars--;
                    }
                }
                else
                {
                    System.out.println("Your int was not in the range [1.15]");
                    return; //output if input isn't correct
                }
            }
            else
            {
                System.out.println("Your int was not in the range [1.15]");
                return; //output if input isn't correct
            }
           
    }
}        