//Holland Roza 
//November 18, 2014 
//CSE 002 
//PokerOdds java program 

//This program uses two methods. The method showOneHand() should generate 
//random poker hands, prompting the user if they would like another hand to be 
//generated (it will repeat as long the user desires). The method simulateOdds() 
//should randomly generate 10000 hands and count the number of times that a hand 
//with a pair of a specific rank occurs, along with the number of hands that do
//not have a pair. 


import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  
        public static void main(String [] arg){
            showOneHand();
            simulateOdds();
        }
  
        public static void showOneHand(){
      
        Scanner scan=new Scanner(System.in);
        String answer = "";
        do{
            String club = "Clubs: ";
            String dia = "Diamonds: ";
            String hearts = "Hearts: ";
            String spades = "Spades: ";
      
            int cards[] = new int[52];
            int hand[] = new int[5];
            for(int i = 0; i<5; i++){
                hand[i] = -1;
            }     
            for(int i = 0; i<52; i++){
                cards[i] = i; 
            }
            int lastCard = 51;
            for(int j = 0; j<hand.length; j++){
                int randomCard = (int)(Math.random()*lastCard);
                hand[j] = cards[randomCard];
                cards[randomCard] = cards[lastCard];
                cards[lastCard] = -1;
                lastCard--;
            }
            for(int x = 0; x<hand.length; x++){
                int cardVal = hand[x]%4;
                String value = " ";
          
        
                if(cardVal == 0){
                    value = cardRank(hand[x]);
                    club = club + " " + value;
                }
                if(cardVal == 1){
                    value = cardRank(hand[x]);
                    dia = dia +  " " + value;
                }
                if(cardVal == 2){
                    value = cardRank(hand[x]);
                    hearts = hearts + " "  + value;
                }
                if(cardVal == 3){
                    value = cardRank(hand[x]);
                    spades = spades + " " + value;
                }
            }
            System.out.println(club);
            System.out.println(dia);
            System.out.println(hearts);
            System.out.println(spades);
      
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
        answer=scan.next();
        }while(answer.equals("Y") || answer.equals("y"));
       
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
  
        public static void simulateOdds(){
            int handCards[] = new int[5];
          
            String club = "Clubs: ";
            String dia = "Diamonds: ";
            String hearts = "Hearts: ";
            String spades = "Spades: ";
            int aces = 0;
            int kings = 0;
            int queens = 0;
            int jacks = 0;
            int tens = 0;
            int nines = 0;
            int eights = 0;
            int sevens = 0;
            int sixes = 0;
            int fives = 0;
            int fours = 0;
            int threes = 0;
            int twos = 0;;
            int noPairs = 0;
            
            int cards[] = new int[52];
            int hand[] = new int[5];
      
        for(int i = 0; i<10000; i++){
            for(int h = 0; h<5; h++){
                hand[h] = -1;
            }
            for(int k = 0; k<52; k++){
                cards[k] = k; 
            }
      
            int lastCard = 51;
      
        for(int j = 0; j<hand.length; j++){
            int randomCard = (int)(Math.random()*lastCard);
            hand[j] = cards[randomCard];
            cards[randomCard] = cards[lastCard];
            cards[lastCard] = -1;
            lastCard--;
        }
        //hand 
        for(int x = 0; x<hand.length; x++){
            handCards[x] = hand[x]%13;
        }
          if(handCards[0] == handCards[1] || handCards[0] == handCards[2] 
          || handCards[0] == handCards[3] || handCards[0] == handCards[4]){
      
            switch(handCards[0]){
                case 0:
                    aces++;
                    break;
                case 1:
                    kings++;
                    break;
                case 2:
                    queens++;
                    break;
                case 3:
                    jacks++;
                    break;
                case 4:
                    tens++;
                    break;
                case 5:
                    nines++;
                    break;
                case 6:
                    eights++;
                    break;
                case 7:
                    sevens++;
                    break;
                case 8:
                    sixes++;
                    break;
                case 9:
                    fives++;
                    break;
                case 10:
                    fours++;
                    break;
                case 11:
                    threes++;
                    break;
                case 12:
                    twos++;
                    break;    
            }
          }
          else if(handCards[1] == handCards[2] || handCards[1] == handCards[3] || handCards[1] == handCards[4]){
            switch(handCards[0]){
                case 0:
                    aces++;
                    break;
                case 1:
                    kings++;
                    break;
                case 2:
                    queens++;
                    break;
                case 3:
                    jacks++;
                    break;
                case 4:
                    tens++;
                    break;
                case 5:
                    nines++;
                    break;
                case 6:
                    eights++;
                    break;
                case 7:
                    sevens++;
                    break;
                case 8:
                    sixes++;
                    break;
                case 9:
                    fives++;
                    break;
                case 10:
                    fours++;
                    break;
                case 11:
                    threes++;
                    break;
                case 12:
                    twos++;
                    break;    
            }
          }
          else if(handCards[2] == handCards[3] || handCards[2] == handCards[4]){
            switch(handCards[0]){
                case 0:
                    aces++;
                    break;
                case 1:
                     kings++;
                    break;
                case 2:
                    queens++;
                    break;
                case 3:
                    jacks++;
                    break;
                case 4:
                    tens++;
                    break;
                case 5:
                    nines++;
                    break;
                case 6:
                    eights++;
                    break;
                case 7:
                    sevens++;
                    break;
                case 8:
                    sixes++;
                    break;
                case 9:
                    fives++;
                    break;
                case 10:
                    fours++;
                    break;
                case 11:
                    threes++;
                    break;
                case 12:
                    twos++;
                    break;    
            }
          }
          else if(handCards[3] == handCards[4]){
            switch(handCards[0]){
                case 0:
                    aces++;
                    break;
                case 1:
                    kings++;
                    break;
                case 2:
                    queens++;
                    break;
                case 3:
                    jacks++;
                    break;
                case 4:
                    tens++;
                    break;
                case 5:
                    nines++;
                    break;
                case 6:
                    eights++;
                    break;
                case 7:
                    sevens++;
                    break;
                case 8:
                    sixes++;
                    break;
                case 9:
                    fives++;
                    break;
                case 10:
                    fours++;
                    break;
                case 11:
                    threes++;
                    break;
                case 12:
                    twos++;
                    break;    
            }
          }
          else{
             noPairs++;
          }
        }
        System.out.println("Rank  Freq. of exactly one pair");
        System.out.println("A     " + aces);
        System.out.println("K     " + kings);
        System.out.println("Q     " + queens);
        System.out.println("J     " + jacks);
        System.out.println("10    " + tens);
        System.out.println("9     " + nines);
        System.out.println("8     " + eights);
        System.out.println("7     " + sevens);
        System.out.println("6     " + sixes);
        System.out.println("5     " + fives);
        System.out.println("4     " + fours);
        System.out.println("3     " + threes);
        System.out.println("2     " + twos);
        System.out.println("----------------------------");
        System.out.println("Total of not exactly one pair: " + noPairs);
    }
}