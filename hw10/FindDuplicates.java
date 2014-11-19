//Holland Roza 
//November 18, 2014 
//CSE 002 
//FindDuplicates java program 

//This program has two methods besides the main. hasDups() returns true if and
//only if there is at least one repeated entry in an array entered by the user, 
//and exactlyOneDup() returns true if and only if there is exactly one repeated
//entry in the array.


import java.util.Scanner;
public class FindDuplicates{ //main class
        //main method required for every Java program
        public static void main(String []s){ 
            Scanner scan=new Scanner(System.in);
    
            int num[]=new int[10]; //initialize array of 10 integers
            String answer="";
            do{
                System.out.print("Enter 10 ints- "); //takes input from the user 
                for(int j=0;j<10;j++){
                    num[j]=scan.nextInt(); //inserts user input into the num array
                }
                String out="The array ";
                out+=listArray(num); //return a string of the form "{2, 3, -9}"   
                if(hasDups(num)){
                    out+="has ";
                }
                else{
                    out+="does not have ";
                }
                out+="duplicates.";
                System.out.println(out);
                out="The array ";
                out+=listArray(num);    
                if(exactlyOneDup(num)){
                    out+="has ";
                }
                else{
                    out+="does not have ";
                }
                out+="exactly one duplicate.";
                System.out.println(out);
                
                System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); 
                //Asks user if they want to continue testing arrays or quit
                answer=scan.next();
            }while(answer.equals("Y") || answer.equals("y"));
        }
        public static String listArray(int num[]){ 
        //method to print out the array with spaces
            String out="{";
            for(int j=0;j<num.length;j++){
                if(j>0){
                    out+=", ";
                }
                out+=num[j];
            }
            out+="} ";
            return out;
        }
        public static boolean hasDups(int[] array){
        //method to check if the array has any duplicates at all
            boolean duplicates=false; //duplicates is false at first
            for(int i=0;i<array.length;i++){
                for(int k=i+1;k<array.length;k++){
                    if(k!=i && array[k] == array[i])
                    {
                        duplicates=true; //duplicates becomes true
                    }
                }   
            }
            return duplicates;
        }
        public static boolean exactlyOneDup(int[] array){
            //method to check if the array has exactly one duplicate
            int counter = 0;
            boolean duplicates = false;
            for(int i=0;i<array.length;i++){
                for(int k=i+1;k<array.length;k++){
                    if(k!=i && array[k] == array[i]){
                        duplicates = true;
                        counter++;
                    }
                }
            }
            if(counter>1 || counter == 0){ //only returns true if counter is 1
                duplicates = false;
            }
        return duplicates;
        }
}