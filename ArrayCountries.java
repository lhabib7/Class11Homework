package class11Homework;

public class ArrayCountries {
   // Create 2D array of countries: north america countries, south america countries,
   // europe countries, asian countries, african countries.
   //Then print all values from that array using 2 different loops
   // and calculate how many total countries been stored
   public static void main(String[] args) {
       String [][] country={{"USA","Canada"},
               {"Brazil","Chile ","Colombia "},
               {"Germany ","United Kingdom","France","Italy"},
               {"Philippines","Thailand","Malaysia"},
               {"Egypt","Nigeria","Angola","Morocco"}
       };
         int total=0;
       for (int i = 0; i < country.length; i++) {
           for (int j = 0; j < country[i].length; j++) {
               System.out.print(country[i][j]+" ");
               total++;
           }
           System.out.println();
       }
       System.out.println("The number of countries entred is : "+total);
   }
}
