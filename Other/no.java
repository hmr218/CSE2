public class no
{
    public static void main(String args[])
    {
        int x[]={3, 12, 15, 6, 0, 0, 0, 0, 0};
        System.out.println.print(x[]);   
    }
        public static void print(int x[]){

        if(x[0]>x.length-1){

            System.out.println(

               "Error, x[0] exceeds x.length-1");

        }

        else {

            System.out.print("{");

            for(int j=1;j<x[0]+1;j++){

                if(j>1){

                    System.out.print(", ");

                }

                System.out.print(x[j]);

            }

            System.out.println("}");

        }

    }
    
}