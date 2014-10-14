/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String[] args) {
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
        System.out.println(n + " " + k);
         break;
      default: 
      out+=40;
          n/=3;
          k-=7;
          System.out.println("n= "+n + " k= " + k);
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
      System.out.println("n= "+n + " k= " + k);
    }
    if(n*n>k){
      n=42;
      out+=n+k;
      System.out.println("n= "+n + " k= " + k);
    }
    else {
      n=45;
      out+=n+k;
      System.out.println("n= "+n + " k= " + k);
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        System.out.println("n= "+n + " k= " + k);
        break;
      case 97:
        n-=14;
        k-=2;
        System.out.println("n= "+n + " k= " + k);
        break;
      case 98:
        n/=5;
        k/=9;
       System.out.println("n= "+n + " k= " + k);
       break;
      default:
        n-=3;
        k-=5;
       System.out.println("n= "+n + " k= " + k);
    }
     out+=1/n + 1/k;   
    System.out.println("out= "+out);
  }
}

/*
 * The problem here was a run time error, because dividing by zero isn't allowed. 
 * By entering system.out.println statements, I was able to locate the point 
 * in the code where n or k became zero, and fixed that code so it was no
 * longer trying to divide by zero and would run correctly.s
 * 
 */
