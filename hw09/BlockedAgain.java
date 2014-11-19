//Holland Roza 
//November 4, 2014 
//CSE 002 
//BlockedAgain java program 

//This program gives practice designing a nested sequence of method calls that 
//divide a larger problem into subproblems. This program uses a series of 
//methods to generate "blocks" of numbers based on user input. 


import java.util.Scanner;
public class BlockedAgain{ //main class
    public static void main(String []s){ //main method required for every java program
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
    }
	public static int getInt() //get int method to retrieve int from the user
	{
	    boolean intCheck; 
	    int rangeCheckOK;
	    Scanner scan1 = new Scanner(System.in);
	    System.out.print("Enter a number between 1 and 9, inclusive: "); //prompts user input
        int input = checkRange(scan1);
        return input;
    }// end of get int method

	public static int checkInt(Scanner scan1) //check int method to check if input is an integer
	{
	   int var = 0;
	   while(!(scan1.hasNextInt()))
	   {
	        System.out.print("You did not enter an integer, try again: ");
	        scan1.next();
	   }
	   var = scan1.nextInt();
	   return var;
	} //end of check int method
	public static int checkRange(Scanner scan1) //check range method to check if input is in the correct range
	{
	 int input1 = checkInt(scan1);
	       while(input1<=0 || input1>=10) //checks if input is in the range
            {
                System.out.print("You did not enter an integer between 1 and 9, try again: ");
                input1 = checkInt(scan1);
            }
            return input1;
	}//end of check range method
	public static void allBlocks(int x) //all blocks method calls the block method for variable x
	{
	    block(x);
	}//end of all blocks
	public static void block(int input2)//block method calls line method
	{
	    int first = 0;
	    
	    for(first=1;first<=input2;first++)
	    {
	       line(first, input2);
        }
	}   
	public static void line(int second, int nextInput)//line method prints spaces and dashes
	{
        int j = second;
        int spaces = 0;
        
        for(int k=0;k<j;k++)
        {
            int m;
            
	        for(spaces=nextInput-j;spaces>0;spaces--)
	        {
	            System.out.print(" "); //prints spaces
            }
                for(m=(2*j)-1;m>0;m--)
                {
                    System.out.print(j); //prints dashes
                }
            System.out.println();
        }
        spaces=0;
        for(spaces=nextInput-j;spaces>0;spaces--)
        {
            System.out.print(" ");
        }
        for(int i=(2*j)-1; i>0; i--)
        {
            System.out.print("-");
        }
        System.out.println();
      }//end of method
}	        