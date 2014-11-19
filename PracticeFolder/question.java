import java.util.Scanner; 
public class question
{
  
  public static void main( String args[] ){
    Scanner s = new Scanner (System.in);
    
    System.out.print("Num: ");
    int value = s.nextInt();
    int output = -1;
    String w = "output: ";
    
    if(value == 1)
    {
        output = 2;
        System.out.println(w + output);
    }
    else if(value == 2)
    {
        output = 4;
        System.out.println(w + output);
    }
    else if(value == 3)
    {
        output = 6;
        System.out.println(w + output);
    }
    else
    {
        System.out.println("out of range");
    }
  }
}