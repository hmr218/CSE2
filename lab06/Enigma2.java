import java.util.Scanner;
public class Enigma2{
  public static void main(String[] args) {
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 *  The error is a run-time error, because dividing by zero isn't allowed. 
 *  I deleted the code that was dividing the output by zero.
 * 
 * 
 * 
 */
