package class11Homework;

public class DigitalClock {
   // create a digital clock
   //You code should print time starting 00:00 and ending 23:59.
   public static void main(String[] args) {
       for (int h = 0;h<24 ; h++) {
           for (int m = 0; m <60 ; m++) {
               for (int s = 0; s <60 ; s++) {
                   System.out.println( h+" :"+m+" :"+s);
               }

           }

       }

   }
}
