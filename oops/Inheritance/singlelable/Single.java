package oops.Inheritance.singlelable;

public class Single {
     int id;
     String name;
     int age;
     int rollnumber;
}

class Students extends Single{
    public void Student(int id, String name, int age, int rollnumber){
      this.id=id;
      this.name=name;
      this.age=age;
      this.rollnumber=rollnumber;
    }
}
