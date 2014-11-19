//Holland Roza 
//November 7, 2014 
//CSE 002 
//Arrays java program 

//This program uses arrays to hold 10 ints inputed by the user, and stores 
//them in an array called userInput.


import java.util.Scanner;
public class Arrays{
    public static void main(String []  arg){
    Scanner myScanner = new Scanner(System.in);

    
    final int NUM_INPUTS = 10;
    int[] userInput; //declaration
    userInput = new int[NUM_INPUTS];
    
    System.out.print("Enter 10 integers: ");
    
    for(int i = 0; i<NUM_INPUTS; i++)
    {
        userInput[i] = myScanner.nextInt();
    }

    int min = userInput[0];
	int max = userInput[0];
 
	for (int i = 1; i <= userInput.length - 1; i++) {
		if (max < userInput[i]) {
			max = userInput[i];
		}
 
		if (min > userInput[i]) {
			min = userInput[i];
		}
	}
	System.out.println("The lowest entry is: " + min);
	System.out.println("The highest entry is: " + max);
	
	
    int sum = 0;
    

    for (int i = 0; i < userInput.length; i++)
    {
        sum = sum + userInput[i];
    }   
    
    System.out.println("The sum is: "+ sum);
    
    
    int[] userInput2; //declaration
    userInput2 = new int[NUM_INPUTS];
    
    for(int x = 0, y = 9; x<=9; x++, y--)
    {
       userInput2[x] = userInput[y];
       
    }
    for(int i = 0; i<=9; i++)
    {
        System.out.println(userInput[i] + " " + userInput2[i]);
    }
    
    }
}    
