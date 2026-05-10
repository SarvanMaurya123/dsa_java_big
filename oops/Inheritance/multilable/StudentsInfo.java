package oops.Inheritance.multilable;

public class StudentsInfo{
    int id;
    String name;
    String email;
    float marks;
}
class StudentsData extends StudentsInfo{

   public  StudentsData(
      int id,
      String name,
      String email,
      float marks
    ){
        this.id=id;
        this.name=name;
        this.email=email;
        this.marks=marks;
    }
}

class StudentPrint extends StudentsData{
    public StudentPrint(
            int id,
            String name,
            String email,
            float marks
    ){
        super(id,name,email,marks);
    }

    public void printInfo() {

        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Marks: " + marks);
    }


}
