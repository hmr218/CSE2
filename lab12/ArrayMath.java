//Holland Roza 
//November 14, 2014 
//CSE 002 
//ArrayMath java program 

//This program...


import java.util.Scanner;
public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));
  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static boolean equals(double x[], double y[])
  {

    if(x.length == y.length)
    {
      for(int i = 0; i<x.length; i++)
      {
        if(!(x[i] == y[i]))
        {
          return false;
        }
        else
        {
          return true;
        }
      }
    }
    return false;
  }
  
  public static double[] addArrays(double x[], double y[])
  {
    int newLength = 0;
    
    if(x.length > y.length){
      newLength = x.length;
    }
    else{
      newLength = y.length;
    }
    
    double[] finalArray = new double[newLength];
    
    for(int i = 0; i <finalArray.length; i++)
    {
      if(i>(x.length-1)){
        finalArray[i] = y[i];
      }
    
    else if(i>(y.length-1)){
      finalArray[i] = x[i];
    }
    else{
      finalArray[i] = x[i] + y[i];
    }
    }
    return finalArray;
  
  }
  
  
}