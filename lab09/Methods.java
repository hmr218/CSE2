//Holland Roza 
//October 24, 2014 
//CSE 002 
//Methods java program 

//This program...


import java.util.Scanner; //Scanner necessary for user input
public class Methods {
        //main method required for every Java program
        public static void main(String[] args){
            Scanner scan;
            scan = new Scanner (System.in );

            int a,b,c;
            System.out.println("Enter three ints");
            a=getInt(scan);
            b=getInt(scan);
            c=getInt(scan);
            System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
            System.out.println("The larger of "+a+", "+b+", and "+c+
                       " is "+larger(a,larger(b,c)));
            System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                       ", and "+c+" are in ascending order");
            
               
            }  //end of main
             public static int getInt(Scanner scan){
                 System.out.print("Enter an int: ");
                
                int x = 0;
                while(!(scan.hasNextInt())){
                    
                   System.out.print("You did not enter an int, try again: ");
                   scan.next();
                }
             
               if(scan.hasNextInt())
                {
                  x = scan.nextInt();   
                }
                return x;
             }
            public static int larger(int first, int second){
                
                
                if(first>second)
                {
                    return first;
                }
                return second;
               
            }
            public static boolean ascending(int first, int second, int third){
                if(first < second)
                {
                    if(second < third){
                        return true;
                    }
                }
                return false;
            }
    
}