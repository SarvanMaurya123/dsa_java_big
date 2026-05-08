package oops.abstractionexample;

public class Logicabstration extends Car implements Student{

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

     @Override
    public void studentName(String name, int age){
        System.out.println("Student Name Is:" +name+ "Ages is:" + age);
    }

    @Override
    public void study(){
        System.out.println("Student Study started");
    }

    @Override
    public void notStudy(){
        System.out.println("Student Not currently study");
    }
}
