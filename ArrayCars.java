package class11Homework;

public class ArrayCars {
   // Create 2D array of cars : american, german, korean, italian.
   // Then retrieve all values from that array using 2 different loops
   public static void main(String[] args) {
       String [][] cars={{"Ford","Dodge","Lincoln"},
               {"Mercedes","Volkswagen ","Audi "},
               {"Hyundai ","Kia","Genesis"},
               {"Fiat","Alfa Romeo","Maserati"}};

       for (int i = 0; i < cars.length; i++) {
           for (int j = 0; j < cars[i].length; j++) {
               System.out.print(cars[i][j]+" ");
           }
           System.out.println();
       }
   }
}
