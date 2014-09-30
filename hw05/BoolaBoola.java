//Holland Roza
//September 26, 2014
//CSE 002
//HW05-BoolaBoola java program

//This program has three boolean variables to each of which the value of true 
//or false is randomly assigned. Then, at random, it combines the three variables 
//with random choices of && and || and stores the result. The program then 
//presents the expression to the user and asks the user to state the result of
//the expression.

import java.util.Scanner; 
public class BoolaBoola{

        //main method required for every Java program
        public static void main(String[] args){
            Scanner myScanner;
            myScanner = new Scanner (System.in );
            
            //System.out.println(getRandomBoolean());
           
            int Boola1 = (int)(Math.random()*2);
            int Boola2 = (int)(Math.random()*2);
            int Boola3 = (int)(Math.random()*2);
            //defines random integers
            
            //assign random boolean values 
            
            int operatorBol1 = (int)(Math.random()*2);
            int operatorBol2 = (int)(Math.random()*2);
            
        String operator1 = "";
            //uses switch statement to randomly assign "and" or "or" statements
            //to the string 
            switch(operatorBol1){
                case 0:
                    operator1 = "&&";
                    break;
                case 1:
                    operator1 = "||";
                    break;
            }
            
        String operator2 = "";
        //uses switch statement to randomly assign "and" or "or" statements
        //to the string 
            switch(operatorBol2){
                case 0:
                    operator2 = "&&";
                    break;
                case 1:
                    operator2 = "||";
                    break;
            }
            
        String booleanString1 = "";
        //uses switch statement to randomly assign "true" or "false" statements
        //to the string 
            switch(Boola1){
                case 0:
                    booleanString1 = "true";
                    break;
                case 1:
                    booleanString1 = "false";
                    break;
            }
            
        String booleanString2 = "";
        //uses switch statement to randomly assign "true" or "false" statements
        //to the string 
            switch(Boola2){
                case 0:
                    booleanString2 = "true";
                    break;
                case 1:
                    booleanString2 = "false";
                    break;
            }
            
        String booleanString3 = "";
        //uses switch statement to randomly assign "true" or "false" statements
        //to the string 
            switch(Boola1){
                case 0:
                    booleanString3 = "true";
                    break;
                case 1:
                    booleanString3 = "false";
                    break;
            }
           
           //asking the user below
           System.out.println("Does " + booleanString1 + operator1 + booleanString2 + operator2 + booleanString3+ " have the value true(t/T) or false(f/F)? ");
           String userInput = myScanner.next();
           
    /*if(userInput.equals("f") || userInput.equals("F") || userInput.equals("t") || userInput.equals("T"))
    {
           
           String actualAnswer = "";
           
           if((operatorBol1 = 1) && (operatorBol2 = 1))
           {
             if(booleanString1 = true && booleanString2 = true && booleanString3 = true)
             {
                actualAnswer = true;
              }
              else
              {
                actualAnswer = false;
              }
             }
           if((operatorBol1 = 0) && (operatorBol2 = 0))
           {
              if(booleanString1 = true || booleanString2 = true || booleanString3 = true) 
              {
                  actualAnswer = true;
              }
              else
              {
                  actualAnswer = false;
              }
           }
           if((operatorBol1 = 1) && (operatorBol2 = 0))
           {
               if(booleanString1 = true && booleanString2 = true || booleanString3)
               {
                   actualAnswer = true;
               }
               else
               {
                   actualAnswer = false;
               }
           }
           if((operatorBol1 = 0) && (operatorBol2 = 1))
           {
               if(booleanString1 = true || booleanString2 = true && booleanString3)
               {
                   actualAnswer = true;
               }
               else
               {
                   actualAnswer = false; 
               }
           }
           if(actualAnswer == false)
           {
               System.out.println("Wrong, try again");
           }
           else
           {
               System.out.println("Correct");
           }
    } 
    else
    {
        System.out.println("Wrong, try again");
    }*/

           //do your if statements to figure out what actual answer is (doing the math yourself)
           
           //compare real answer to what user inputted
           
           //print out if user was right or wrong
            
        }
}        