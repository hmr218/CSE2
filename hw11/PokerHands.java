//Holland Roza 
//November 30, 2014 
//CSE 002 
//PokerHands java program 

//This program prompts the user to enter a five card poker hand, prints out 
//the hand, and then prints out the rank of the hand, e.g. “Straight.”

import java.util.Scanner;
public class PokerHands{ //main class
        //main method required for every Java program
        public static void main(String []s){ 
        
        int[] cards = new int[5];
        cards();
        showOneHand(cards);
        
        }
        
        public static void cards(){
        Scanner scan=new Scanner(System.in);
        
        String club = "Clubs: ";
        String dia = "Diamonds: ";
        String hearts = "Hearts: ";
        String spades = "Spades: ";
        
        int cards[] = new int[52];
        int hand[] = new int[5];
        for(int i = 0; i<5; i++){
            hand[i] = i;
        }     
        for(int i = 0; i<52; i++){
            cards[i] = i; 
        }
        int frequency[] = new int[13];
        
        
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");
        String answer = scan.next();
        while(answer.equals("y") || answer.equals("Y")){
            
            for(int i = 0; i<5; i++)
            {
                System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
                String inputSuit = scan.next();
                if(inputSuit.equals("c") || inputSuit.equals("d") || inputSuit.equals("h") || inputSuit.equals("s"))
                {
                    System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', '9', '8', '7', '6', '5', '4', '3', '2'- ");
                    String inputRank = scan.next();
                    if(inputRank.equals("a") || inputRank.equals("k") || inputRank.equals("q") || inputRank.equals("j") ||
                    inputRank.equals("10") || inputRank.equals("9") || inputRank.equals("8") || inputRank.equals("7") ||
                    inputRank.equals("6") || inputRank.equals("5") || inputRank.equals("4") || inputRank.equals("3") || 
                    inputRank.equals("2"))
                    {
                        System.out.println(inputSuit + " " + inputRank);
                    }
                    else
                    {
                        System.out.println("You did not enter a valid reponse");
                    }
                }
                else
                {
                    System.out.println("You did not enter a valid reponse");
                }
            
            }
        }
        }
        
        
            
            
            
        
        public static void showOneHand(int hand[]){
	        String suit[]={"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};
	        String face[]={
                "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	            "4 ","3 ","2 "};
	        String out="";
	        for(int s=0;s<4;s++){
  	            out+=suit[s];
  	            for(int rank=0;rank<13;rank++){
    	            for(int card=0;card<5;card++){
     	                if(hand[card]/13==s && hand[card]%13==rank){
      	                    out+=face[rank];
  	                        out+='\n';
     	                }
    	            }
  	            }
	        }
	        System.out.println(out);
        }
        public static String cardRank(int card){
            int cardValue = card%13;
            String cardNumber = " ";
      
            switch(cardValue){
                case 0:
                    cardNumber = "Ace";
                    break;
                case 1:
                    cardNumber = "King";
                    break;
                case 2:
                    cardNumber = "Queen";
                    break;
                case 3:
                    cardNumber = "Jack";
                    break;
                case 4:
                    cardNumber = "10";
                    break;
                case 5:
                    cardNumber = "9";
                    break;
                case 6:
                    cardNumber = "8";
                    break;
                case 7:
                    cardNumber = "7";
                    break;
                case 8:
                    cardNumber = "6";
                    break;
                case 9:
                    cardNumber = "5";
                    break;
                case 10:
                    cardNumber = "4";
                    break;
                case 11:
                    cardNumber = "3";
                    break;
                case 12:
                    cardNumber = "2";
                    break;
            } 
        return cardNumber;
        }

}