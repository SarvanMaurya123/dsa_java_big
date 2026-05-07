package oops;

import java.util.Scanner;

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

public class classandobjects {
    
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("..........Enetr the  Students info......");
    
    System.out.println("Enter the id:");
    int id= sc.nextInt();
    
    System.out.println("Enter the mobile:");
    long mobile=sc.nextInt();
    sc.nextLine(); // clear buffer

    System.out.println("Enter then Name:");
    String name=sc.nextLine();

    System.out.println("Enter the email:");
    String email=sc.nextLine();

    System.out.println("Enter the address:");
    String address= sc.nextLine();

    System.out.println("Enter the marks:");
    float marks=sc.nextFloat();
    
    Student student= new Student(id, mobile, name, email, address, marks);


   System.out.println(".........Output the code............");

   System.out.println("Student id is:"+ student.id);
   System.out.println("Student mobile Numbere is:"+student.mobile);
   System.out.println("Student name is:"+student.name);
   System.out.println("Student email is:"+ student.email);
   System.out.println("Student address is:"+student.address);
   System.out.println("Student marks is:"+student.marks);

   sc.close();
    }
}
 