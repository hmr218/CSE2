//Holland Roza 
//November 21, 2014 
//CSE 002 
//RaggedArrays java program 

//This program...


public class RaggedArrays{
    public static void main(String [] arg){
        
        int[][] ragged = new int[5][];
        
        for(int i = 0; i<5; i++){
            ragged[i] = new int[i*3+5];
        }
        
        for(int i = 0; i<ragged.length; i++){
            for(int j = 0; j<ragged[i].length; j++){
                ragged[i][j] = (int)(Math.random()*39);
            }
        }
        
        System.out.println("The array before sorting");
        for(int i = 0; i<5; i++){
            for(int j = 0; j<(i*3+5); j++){
                System.out.print(ragged[i][j] + " ");
            }
            System.out.println();
        }
        
        sort(ragged);
        System.out.println();
        
        System.out.println("The array after sorting");
         for(int i = 0; i<5; i++){
            for(int j = 0; j<(i*3+5); j++){
                System.out.print(ragged[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void sort (int [][] ragged){

        //Sorting the row of the 2D ragged array in ascending order
        for(int row = 0; row < 5; row++){
            for(int column = 0; column < (row*3+5); column++){
                 for(int column2 = column + 1; column2 < (row*3+5); column2++){
                   if(ragged[row][column2]<ragged[row][column]){

                        int temp=ragged[row][column];
                        ragged[row][column] = ragged[row][column2];
                        ragged[row][column2]=temp;
                    }
                }
            }
        }
    }
}