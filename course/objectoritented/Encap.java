import java.util.*;

class Car{
    int number= 100;
    static int num2 = 1000; //- this can now be accessed globally without creating any object of it in mainfunction
    String name = "Mercedes";
    public void func(){
        System.out.println(this.name);
    }

}

class Encap{

    public static void main(String[] args){

        Car c = new Car();

        System.out.println(c.number);

    
        c.func();

        System.out.println(Car.num2); //-accessing globally the num2 variable without creating an object of the class Car. so static is required here
    }
}

//- static keyword is needed to access globally any datatype