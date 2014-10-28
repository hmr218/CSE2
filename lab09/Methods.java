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
            
            //public static int getInt(int x){
                
               // while(!(scan.hasNextInt())){
                   // System.out.println("You did not enter an int, try again: ");
                 //   x = scan.nextInt();
               // }
               // if(scan.hasNextInt())
                //{
                  //x = scan.nextInt();   
                //}
            }    
            public static int larger(int first, second){
                int big, medium;
                
                if(first>=second)
                {
                    first = big;
                    second = medium;
                }
                else if(first<second)
                {
                    first = medium;
                    second = big;
                }
                return big;
            }
            public static int ascending(int first, second, third){
                if(first>=second)
                {
                    if(second>=third){
                        return "true";
                    }
                    else{
                        return "false";
                    }
                }
                else
                {
                    return "false";
                }
            }
    }
}