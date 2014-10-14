//Holland Roza
//October 14, 2014
//CSE 002
//HW06- Roulette java program

//This program models a roulette game by counting how many times the user wins  
//or loses in 1000 games of roulette, using the random number generator and 
//while loops.

 
public class Roulette{

        //main method required for every Java program
        public static void main(String[] args){
           
           int totalWinnings=0; //money you earn
           int zeroMoney = 0; //counts the number of times you lose all your money
           int secondCount = 0; 
           int profit = 0; //counts the number of times you win 3 or more times out of 100
           
           while(secondCount<1000) {
           
            int money =100; //start with $100
            int firstCount = 0;
            int guessNum = (int)((Math.random()*37)+0); //generate a random number each time
            
           while(firstCount < 100){
            int rouletteNum = (int)((Math.random()*37)+0); //generate a random number to test every time
            if(guessNum == rouletteNum) 
            {
                money += 36; //
                totalWinnings += 36; //total money increases 
            }
            else
            {
                money--; //total money goes down $1
                totalWinnings--; //total winnings goes down $1
            }
            
            firstCount++; //increments the first counter
            
            }
            if(money == 0) { 
                zeroMoney++; //times you lose all your money
            }
            if(money>100) 
            {
               profit++; //times you earn a profit
            }
            secondCount++; //increments the second counter 
           }
           
          System.out.println("Your total winnings are $" +totalWinnings+".");
          System.out.println("You lost everything a total of " +zeroMoney+ " times.");
          System.out.println("You walked away with a profit in one session of 100 spins of the wheel " +profit+ " times.");
        }
}