package oops.abstractionexample;

// abstract class implements here
abstract class Car{
    abstract void carRiderName(String Name, int age);
    abstract void carStart();
    abstract void carStop();
    abstract void carAccelerate();
    abstract void carBrake();
}

// interface class implemnts here
interface  Student{
    public void studentName(String name, int age);
    public void study();
    public void notStudy();
}

