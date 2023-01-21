package class11Homework;

public class sumNumbers {
   //Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

   public static void main(String[] args) {
       int [][] numbers={{12,34,56},
                        {67,11,3},
                      {7,15,100},
              };
      int sum=0;
       for (int i = 0; i <numbers.length ; i++) {
           for (int j = 0; j <numbers[i].length ; j++) {
               sum=sum+numbers[i][j];
           }
           }
       System.out.println("The sum of all numbers is : "+sum);
       }
   }

