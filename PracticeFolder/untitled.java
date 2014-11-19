import java.util.Scanner; 
public class untitled
{
  
  public static void main( String args[] ){
    Scanner s = new Scanner (System.in);
    
    System.out.println("num:");
    int val = s.nextInt();
    int output = -1;
    
    switch(val){
    case 1:
      output = 2;
      break;
    
    case 2:
      output = 4;
      break;
    case 3:
      output = 6;
      break;
    default:
      break;
      
    }
    String w = "output: ";
switch(output) {
    case -1:
        w = "out of range";
        break;
    default:
        w += output;
        break;  
}
System.out.println(w);

}
      
    
}



  
  

