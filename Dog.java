package class11Homework;

public class Dog {
    //Create a Dog Class and create 3 different objects of it:
// Husky, Bulldog, Labrador  with specific  attributes and behaviors.
    String brand, color;
    int age;

    //Constructor initialized
    public Dog(String brand, String color, int age){
        this.brand = brand;
        this.color = color;
        this.age = age;
    }
    public static void main(String args[]){


        Dog mobile1 = new Dog("Husky","black",8);
        Dog mobile2 = new Dog("Bulldog","White",4);
        Dog mobile3 = new Dog("Labrador","grey",6);


        System.out.println( mobile1.brand +" "+ mobile1.color + " dog "+ mobile1.age+" years old");
        System.out.println( mobile2.brand +" "+ mobile2.color + " dog  "+ mobile2.age+" years old");
        System.out.println( mobile3.brand +" "+ mobile3.color + " dog  "+ mobile3.age+  " years old");

    }}

