/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String[] args) {
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   
   x = x/100;
   double y = 1-x;
   
      System.out.println("The proportion remaining is " +y);
   }
}

/* Error report: 
 *    (The errors that occured were that the code only worked for a select few
 *     inputs that the programmer had written code for. I rewrote the code 
 *     more generally so that the input was converted to a decimal less than 1
 *     and then made a new variable to reprsent the proportion remaining, 
 *    and printed that out.)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * 
 * 
 * 
 * 
 */
