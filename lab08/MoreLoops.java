//Holland Roza
//October 17, 2014
//CSE 002
//lab08- MoreLoops java program

//This program...

import java.util.Scanner; //scanner needed for user input
public class MoreLoops{

        //main method required for every Java program
        public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
            int n;

            //System.out.print("Enter an int- ");
            //while(!scan.hasNextInt()){
            //scan.next(); //get rid of the junk entered by user
            //System.out.print("You did not enter an int; try again- ");
            //}
            //COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A
            //DO-WHILE LOOP
   
                System.out.print("Enter an int- ");
                n=0;
                do{
                    scan.next();
                    System.out.print("You did not enter an int; try again; ");
                    scan.next();
                }while(!scan.hasNextInt());
                   
            }while(scan.hasNextInt());
            n=scan.nextInt(); 
            
            //for(int j=0;j<n && j<40;j++){
                //for(int k=0;k<j+1;k++){
                    //System.out.print('*');
                //}
            //System.out.println();
            //}
            //COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH
            //WHILE STATEMENTS
            
            int j=0;
            int k=0;
            while(j<n && j<40){
                while(k<j+1){
                    System.out.print('*');
                    k++;
                }
                System.out.println();
                j++;
            }

      
        int k=4;

        //do{
            //System.out.println("k="+k);
            //k++;
        //}
         //while(k<4);
         
        //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
        //WITH A WHILE LOOP 
        while(k<4){
            System.out.println("k="+k);
            k++;
        } 

    }
    //COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE USING
    // ONLY FOR LOOPS AND IF STATEMENTS. BEFORE DOING SO, TRY
    //RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G.,
    //   -5, 1, 20, 5, ETC.
    //IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY
    //SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
    }

        }
        
