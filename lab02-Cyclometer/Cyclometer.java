////////////////////////////////////////////////////////
//Holland Roza
//September 5, 2014
//CSE 002
//Cyclometer Java Program
//

//A bicycle cyclometer records two kinds of data, the time elapsed in seconds, and the number of rotations
//of the front wheel during that time. This program will (a) print the number of minutes for each trip; 
//(b) print the number of counts for each trip; (c) print the distance of each trip in miles; and (d)
//print the distance for the two trips combined. 
//
public class Cyclometer{
    //main method required for every java program
    public static void main(String[] args) {
        
        int secsTrip1=480; //The number of seconds for the first trip
        int secsTrip2=3220; //The number of seconds for the second trip
        int countsTrip1=1561; //The number of counts for the first trip 
        int countsTrip2=9037; //The number of counts for the second trip
        
        double wheelDiameter= 27.0; //Diameter of the wheel on the cyclometer
        double PI= 3.14159; //Value of pi
        double feetPerMile=5280; //The number of feet per mile
        double inchesPerFoot=12; //The number of inches per foot
        double secondsPerMinute=60; //The number of seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; 
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+ " counts.");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+ " counts.");
        
        //To calculate Trip 1, divide the number of seconds in the trip by the number of seconds per minute. To calculate
        //the number of counts in trip 1, print the variable countsTrip1. Do the same to calculate Trip 2. 
        distanceTrip1=(countsTrip1*wheelDiameter*PI)/(inchesPerFoot*feetPerMile);
        //Above gives distance in inches
        //For each count, a rotation of the wheel travels the diameter in inches times PI)
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //gives distance in miles of trip 2
        totalDistance=distanceTrip1 + distanceTrip2; //gives the total distance traveled
        //Print the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles.");
        System.out.println("Trip 2 was "+distanceTrip2+" miles.");
        System.out.println("The total distance was "+totalDistance+" miles.");
        
        
    } //end of main method
} //end of class