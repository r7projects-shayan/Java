import java.util.*;


//_ Polymorphism means many forms

//- it happens when many functions have the same name inside a class

class Person{

    String name;
    int age;


//_ function overloading
    public void printinfo(String name){

        System.out.println(name);
    }

    public void printinfo(int age){
        System.out.println(age);
    }

    public void printinfo(String name, int age){
    
        System.out.println(name + " "+ age);
    
    }
    
}

public class Polymorphism{

    public static void main(String [] args){

    }
}