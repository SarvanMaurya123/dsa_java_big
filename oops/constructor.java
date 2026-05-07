package oops;



// this is best example of constractor
//also constractor not returned anythings
class Student{
    int id; 
    long mobile;
    String name;
    String email;
    String address;
    float marks;

    //thaking parameter the student
    public Student(
        int id,
        long mobile,
        String name,
        String email,
        String address,
        float marks
 ){
    // this is Constructor:
    this.id=id;
    this.mobile=mobile;
    this.name=name;
    this.email=email;
    this.address=address;
    this.marks=marks;

 }
}
public class constructor {

    public static void main(String[] args) {

        Student s1 = new Student(
        1,
        9876543210L,
        "Rahul",
        "rahul@gmail.com",
        "Mumbai",
        85.5f
);

System.out.println(s1.id+s1.mobile+s1.name+s1.address+s1.email+s1.marks);
  
    }


}