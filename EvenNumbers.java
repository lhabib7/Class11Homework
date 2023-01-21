package class11Homework;

public class EvenNumbers {
   //Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
    // Develop a program which will identify/print the even numbers only.

   public static void main(String[] args) {
       int [][] numbers={{12,34,56,25},
                        {67,11,3,18},
                      {7,15,100,44},
              };

       for (int i = 0; i <numbers.length ; i++) {
           for (int j = 0; j <numbers[i].length ; j++) {
               if (numbers[i][j]%2==0){
                   System.out.println(numbers[i][j]);
               }
           }
           }
       }
   }

