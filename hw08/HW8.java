//Holland Roza 
//October 28, 2014 
//CSE 002 
//Methods java program 

//This program...


import java.util.Scanner;
public class HW8{
        public static void main(String []arg){
	        char input;
	        Scanner scan=new Scanner(System.in);
	        
	        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	       
	        input=getInput(scan,"Cc");
	        System.out.println("You entered '"+input+"'");
	        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	        
	        input=getInput(scan,"yYnN",5); //give up after 5 attempts
	        
	        if(input!=' ')
	        {
   	            System.out.println("You entered '"+input+"'");
	        }
	        
	        input=getInput(scan,"Choose a digit.","0123456789");
	        System.out.println("You entered '"+input+"'");
        }      
        public static char getInput(Scanner scan1, String input1)
        {
            String userInput;
            while(true)
            {
                if(scan1.hasNext())
                {
                    userInput = scan1.next();
                    if(userInput.length()==1)
                    {
                        if((userInput.charAt(0) == input1.charAt(0)) || (userInput.charAt(0) == input1.charAt(1)))
                        {
                            return userInput.charAt(0);
                        }
                        else
                        {
                            userInput = scan1.next();
                            System.out.print("You did not enter a character from the list 'Cc'; try again- ");
                        }
                    }
                    else
                    {
                        userInput = scan1.next();
                        System.out.print("You should enter exactly one character; try again- ");
                    }
                }
                else
                {
                    userInput = scan1.next();
                    System.out.print("You did not enter a string; try again- ");
                }
            }
        }
        public static char getInput(Scanner scan2, String input2, int num1)
        {
           char x = 0;
           String userInput1 = scan2.next();
           
                if((userInput1.charAt(0) == input2.charAt(0)) || (userInput1.charAt(0) == input2.charAt(1)))
                {
                    return userInput1.charAt(0);
                  
                }
                else if((userInput1.charAt(0) == input2.charAt(2)) || (userInput1.charAt(0) == input2.charAt(3)))
                {
                    return userInput1.charAt(0);
                }
                else{
                    int counter = 0;
                    while(counter<5)
                    {
                            System.out.print("You did not enter a character from the list 'yYnN'; try again- ");
                            userInput1 = scan2.next(); 
                            if((userInput1.charAt(0) == input2.charAt(0)) || (userInput1.charAt(0) == input2.charAt(1)) 
                            || (userInput1.charAt(0) == input2.charAt(2)) || (userInput1.charAt(0) == input2.charAt(3)))
                            {
                                return userInput1.charAt(0);
                            }
                            else
                            {
                                counter++;
                            }
                    }    
                    System.out.println("You failed after 5 tries.");
                    return x;
                }
        }
        public static char getInput(Scanner scan3, String input3, String input4)
        {
            char x = 0;
            
            System.out.println(input3);
            System.out.print("Enter one of " + input4.charAt(0) + ", " + input4.charAt(1) + ", " +input4.charAt(2) + ", " 
            +input4.charAt(3) + ", " +input4.charAt(4) + ", " +input4.charAt(5) + ", " +input4.charAt(6) + ", " 
            +input4.charAt(7) + ", " +input4.charAt(8) + ", " +input4.charAt(9) + " - ");
            String userInput2 = scan3.next();
            
                if(userInput2.length()==1)
                {
                    if(userInput2.charAt(0) == input4.charAt(0) || userInput2.charAt(0) == input4.charAt(1)
                    || userInput2.charAt(0) == input4.charAt(2) || userInput2.charAt(0) == input4.charAt(3) 
                    || userInput2.charAt(0) == input4.charAt(4) || userInput2.charAt(0) == input4.charAt(5) 
                    || userInput2.charAt(0) == input4.charAt(6) || userInput2.charAt(0) == input4.charAt(7) 
                    || userInput2.charAt(0) == input4.charAt(8) || userInput2.charAt(0) == input4.charAt(9))
                    {
                        return userInput2.charAt(0);
                    }
                    else
                    {
                        System.out.println("You did not enter an acceptable character.");
                        return x;
                    }
                }
                else
                {
                    System.out.println("Enter exactly one character.");
                    return x;
                }
        }
}