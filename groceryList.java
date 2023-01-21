package class11Homework;

public class groceryList {
   // Using 2D array create a grocery list.Inside you should have an array of veggies,fruits,
   //  dairy and sweets. Retrieve all values from that array using 2 different loops

   public static void main(String[] args) {
       String [][] grocery={{"eggplant","tomato","potato","Onion"},
               {"apples ","oranges ","peaches ","strawberries","bananas "},
               {"Milk ","Cream","yogurt","ice cream"},
               {"Cakes","Muffins","Cookies","Brownies"}};
       for (int i = 0; i <grocery.length ; i++) {
           for (int j = 0; j <grocery[i].length ; j++) {
               System.out.print(grocery[i][j]+", ");
           }
           System.out.println();
           }
       }
   }

