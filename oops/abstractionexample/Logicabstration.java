package oops.abstractionexample;

public class Logicabstration extends Car {

    @Override
    void carRiderName(String Name, int age){
        System.out.println("Rider Name is:" + Name + "also ages "+age);
    }

    @Override
    void carStart(){
        System.out.println("Car a Started...");
    }

    @Override
    void carAccelerate(){
        System.out.println("Car isTop Speed");
    }

    @Override 
    void carBrake(){
        System.out.println("Car is Slow");
    }

    @Override
    void carStop(){
        System.out.println("Car are stoped");
    }
    
}