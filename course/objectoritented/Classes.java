import java.util.*;
//_ This is how to define a class
//- the class can have many objects


    class Student{
    String name;
    int age;
    String department;
}


//_ This is how to define class with methods- methods are functions that are defined in a class

class Person{
    int age; 
    String name;

    double salary;

    //- this is a method, function inside class

    public void displayperson(){
        System.out.println("Name: "+this.name+"\nAge: "+this.age+"\nSalary: "+this.salary);
    }
}


public class Classes{

    public static void main(String [] args){

        Student s1 = new Student(); //* non parameterized 

        s1.name = "Student 1"; //- dot notation to access objects
        s1.age = 20;

        System.out.println(s1.age);


//- creating a new object with the person class 

Person p1 = new Person();
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name: ");

String name = sc.nextLine();

p1.name = name;

System.out.println("Enter your age: ");

int age = sc.nextInt();

p1.age = age;

System.out.println("Enter your salary: ");

double salary = sc.nextDouble();

p1.salary = salary;




p1.displayperson();





    }
}