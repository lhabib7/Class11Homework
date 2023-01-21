package class11Homework;

public class phone {

        //1) Create a Class “Phone”. Create 3 Objects of it:
        // iPhone, Pixel, Samsung with specific  attributes and behaviors.
        String brand, color;
    int camera;

    //Constructor initialized
    public phone(String brand, String color, int camera){
       this.brand = brand;
        this.color = color;
        this.camera = camera;
    }
    public static void main(String args[]){

//Object created
        phone mobile1 = new phone("iPhone","Gold",8);
        phone mobile2 = new phone("Samsung","White",13);
        phone mobile3 = new phone("Pixel","Black",10);

//Smartphone details displayed for each user
        System.out.println( mobile1.brand +" "+ mobile1.color + " color smartphone  "+ mobile1.camera+ "MP"+ " camera");
        System.out.println( mobile2.brand +" "+ mobile2.color + " color smartphone  "+ mobile2.camera+ "MP"+ " camera");
        System.out.println( mobile3.brand +" "+ mobile3.color + " color smartphone  "+ mobile3.camera+ "MP"+ " camera");

    }}



