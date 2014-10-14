//Holland Roza 
//October 10, 2014 
//CSE 002 
//LoopTheLoop java program 

//This program...


import java.util.Scanner; 
public class LoopTheLoop {
        //main method required for every Java program
        public static void main(String[] args){
            Scanner myScanner;
            myScanner = new Scanner (System.in );
            
            System.out.print("Enter an integer between 1 and 15: ");
            if(myScanner.hasNextInt())
            {
                int nStars = myScanner.nextInt();
                if(nStars<16 && nStars>0)
                {
                    String star1 = "*";
                    
                    while(nStars>0)
                    {
                        System.out.println(star1);
                        star1 = star1 + "*";
                        nStars--;
                    }
                }
                else
                {
                    System.out.println("Your int was not in the range [1.15]");
                    return;
                }
            }
            else
            {
                System.out.println("Your int was not in the range [1.15]");
                return;
            }
            
            int nStars = 10;
            while(nStars>0)
            {
                System.out.print("*");
                nStars--;
            }
            
            System.out.println("");
            String star = "*";
            int stars = 10;
            while(stars>0)
            {
                System.out.println(star);
                star=star+"*";
                stars--;
            }
            
    }
}        