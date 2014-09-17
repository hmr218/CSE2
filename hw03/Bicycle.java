//Holland Roza
//September 16, 2014
//CSE 002
//Bicycle java program
//

//This program prompts the user for 2 digits, the number of counts
//on a cyclometer and the number of seconds during which the counts
//occured, and then prints out the distance traveled and average
//miles per hour.

import java.util.Scanner;
public class Bicycle {
    
    public static void main(String[] args) {
        Scanner myScanner;
            myScanner = new Scanner (System.in );
        double wheelDiameter=27.0, PI=3.14159, feetPerMile=5280, 
        inchesPerFoot=12, secondsPerMinute=60;
        System.out.print("Enter the number of seconds: ");
        int nSecs = myScanner.nextInt();
        System.out.print("Enter the number of counts: ");
        int nCounts = myScanner.nextInt();
        
        double nMins = nSecs/secondsPerMinute;
        double distance = wheelDiameter*PI*nCounts;
        
        distance/=inchesPerFoot*feetPerMile;
        
        distance = distance*100;
        distance = (int) distance;
        distance = distance/100.0;
        
        
        double nHours=nMins/60;
        double mph=distance/nHours;
        
        mph = mph*100;
        mph = (int) mph;
        mph = mph/100;
        
        System.out.println("The distance was " +distance+ " miles and took " 
        +nMins+ " minutes." );
        System.out.println("The average mph was " +mph);
    } 
}