//Holland Roza
//September 26, 2014
//CSE 002
//HW05-BurgerKing java program

//This program prompts the user to enter a choice of a burger, a soda, or 
//fries. Then the program prompts the users for details of their choices. 

import java.util.Scanner; 
public class BurgerKing{
        //main method required for every Java program
        public static void main(String[] args){
            Scanner myScanner;
            myScanner = new Scanner (System.in );
            
            //prompts the user for what they want to order
            System.out.println("Enter a letter to indicate a choice of");
            System.out.println("Burger (B or b)");
            System.out.println("Soda (S or s)");
            System.out.print("Fries (F or f): ");
            String input1 = myScanner.next();
            if(input1.length()==1) //tests that input is correct length
            {
                if(input1.equals("B") || input1.equals("b") || input1.equals("S") || 
                input1.equals("s") || input1.equals("F") || input1.equals("f"))
                //tests that input is one of the correct letters
                {
            switch(input1) 
            {
                case"B":
                case"b":
                     System.out.println("Enter A or a for 'all the fixins'");
                     System.out.println("C or c for cheese");
                     System.out.print("N or n for none of the above: ");
                     String input2 = myScanner.next(); //further questions about burger
                     
                     switch(input2)
                     {
                     case"A":
                     case"a":
                        System.out.println("You ordered a burger with all the fixins");
                        break;
                    case"C":
                    case"c":
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case"N":
                    case"n":
                        System.out.println("You ordered just a burger");
                        break;
                     }
                     return;
                case"S":
                case"s":
                    System.out.println("Enter P or p for Pepsi");
                    System.out.println("C or c for Coke");
                    System.out.print("M or m for Mountain Dew: ");
                    String input3 = myScanner.next(); //further questions about soda
                    
                    switch(input3)
                    {
                     case"P":
                     case"p":
                        System.out.println("You ordered a Pepsi");
                        break;
                    case"C":
                    case"c":
                        System.out.println("You ordered a Coke");
                        break;
                    case"M":
                    case"m":
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    }
                    return;
                case"F":
                case"f":
                    System.out.print("Do you want a large of small order of fries (l, L, s, or S): ");
                    String input4 = myScanner.next(); //further questions about fries
                    
                     switch(input4)
                     {
                         case"l":
                         case"L":
                             System.out.println("You ordered large fries");
                             break;
                        case"s":
                        case"S":
                            System.out.println("You ordered small fries");
                            break;
                     }
                     return;
                }
                }
                    else
                    {
                        System.out.println("You did not enter any of B, b, S, s, F, or f");
                        return; //output if user input is wrong
                    }
            }
            else
            {
                System.out.println("You did not enter a single character");
                return; //output if user input is wrong
            }
        }
}