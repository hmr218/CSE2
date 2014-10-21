//Holland Roza
//October 19, 2014
//CSE 002
//hw07- NumberStack java program

//This program forces the user to enter an integer between 
//1 and 9, inclusive, and then prints out displays that depend on the value 
//entered and look like the following: 

import java.util.Scanner; //scanner needed for user input
public class NumberStack{

        //main method required for every Java program
        public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 9: ");
        if(scan.hasNextInt())
        {
        int input = scan.nextInt();
        if(input>0 && input<10)
        {
        System.out.println("Using for loops: ");
           for(int j=1;j<=input;j++){
               
                for(int k=1;k<=j;k++){
                    
                    for(int z=input;z>j;z--){
                        System.out.print(" ");
                    }
                    
                    for(int x=1;x<=(2*j)-1;x++){
                    System.out.print(j);
                    }
                  System.out.println();    
                }
                
                for(int z=input;z>j;z--){
                        System.out.print(" ");
                    }
                
                for(int y=1;y<=(2*j)-1;y++){
                    System.out.print("-");
                }
                System.out.println();
           }
        
        System.out.println("Using while loops: ");
            int j = 1;

                while(j<=input){
                  
                    int k = 1;                  
                    while(k<=j){
                        
                         int z = input;
                        while(z>j){
                            System.out.print(" ");
                            z--;
                        }
                         int x = 1;
                        while(x<=(2*j)-1){
                            System.out.print(j);
                            x++;
                        }
                        System.out.println();
                        k++;
                    }
                    int z = input;
                    while(z>j){
                            System.out.print(" ");
                            z--;
                        }
                         int y = 1;
                     while(y<=(2*j)-1){
                         y++;
                         System.out.print("-");
                     }
                     System.out.println();
                j++;     
               }   
            
        System.out.println("Using do-while loops: ");
                   
                j = 1;

                do{
                  
                    int k = 1;                  
                    do{
                        
                         int z = input;
                        do{
                            System.out.print(" ");
                            z--;
                        }while(z>j);
                         int x = 1;
                        do{
                            System.out.print(j);
                            x++;
                        }while(x<=(2*j)-1);
                        System.out.println();
                        k++;
                    }while(k<=j);
                    int z = input;
                    do{
                            System.out.print(" ");
                            z--;
                        }while(z>j);
                         int y = 1;
                     while(y<=(2*j)-1){
                         y++;
                         System.out.print("-");
                     }
                     System.out.println();
                j++;     
               }while(j<=input);   
            
            }
            else
            {
                System.out.println("You did not enter an integer between 1 and 9");
            }
        }
            else
            {
                System.out.println("You did not enter an integer");
            }
        }
    }