//Holland Roza 
//September 26, 2014 
//CSE 002 
//RandomGames java program 

//This program uses the Scanner class to obtain from the user one of 
//three choices for a game of chance: (1) Roulette; (2) Craps; or (3) Picking a
//card from a deck of playing cards. The only game that is currently implemented
//is Roulette. 
import java.util.Scanner; 
public class RandomGames {
        //main method required for every Java program
        public static void main(String[] args){
            Scanner myScanner;
            myScanner = new Scanner (System.in );
            
            int numRoulette;
            System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
            String input = myScanner.next();
            
            if (input.length() == 1) //checks for single digit
            {
                if(input.equals("R") || input.equals("r") || input.equals("C") || 
                input.equals("c") || input.equals("P") || input.equals("p"))
                {
                    switch(input) //enters switch statement
                    {
                	case "R": //user wants to play Roulette
                	    	numRoulette = (int)(Math.random() * 38+1);
	                        switch(numRoulette)
	                        {
	                            case 38: System.out.println(" Roulette: 00");
	                            break; //prints 00 if it's case 38
	                        }
	                     	System.out.println("Roulette: " +numRoulette); 
	                     	break;
                	case "r": //user wants to play Roulette    
	                     	numRoulette = (int)(Math.random() * 38+1);
	                        switch(numRoulette)
	                        {
	                            case 38: System.out.println(" Roulette: 00");
	                            break;
	                        }
	                     	System.out.println("Roulette: " +numRoulette); 
	                     	break;
	                     	
                	case "C": //craps not implemented yet
                	    System.out.println("Craps option is yet to be implemented.");
                	   break;
                	    
                	case "c":
                	    System.out.println("Craps option is yet to be implemented.");
                	   break;
                	   
                	case "P": //pick a card not implemented yet
                	    System.out.println("Picking a card not yet implemented.");
                	    break;
                	    
                	case "p":
                	    System.out.println("Picking a card not yet implemented.");
                	   break;
                    }
                }    
                	    
             else
            {
                System.out.println("'"+input+"' is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
                //output if user doesn't enter one of the correct letters
                return; //ends program
            }
        } 
            else
            {
                 System.out.println("You did not enter a single character");
                 //output if user doesn't enter a single letter
                 return; //ends program
            }
    }
}