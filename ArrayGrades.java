package class11Homework;

public class ArrayGrades {
   // Create a 2D array(shorter way) in which first array will consist of 4 names and second array
    // will contain grades.Then your program should print name of the students that has A and B grade
   public static void main(String[] args) {
       String[] names={"Nassim","Lhabib","Naima","Hiba"};
       char[] grade={'A','D','C','B'};
       for (int i = 0; i <names.length ; i++) {
           if (grade[i]=='A'||grade[i]=='B' ){
               System.out.println(names[i]);
           }
       }
   }
}
