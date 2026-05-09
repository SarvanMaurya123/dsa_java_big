package oops.Inheritance.singlelable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Students s1=new Students();
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the Id:");
        int id=sc.nextInt();

        sc.nextLine();
        System.out.println("Enter the Name:");
       String name= sc.nextLine();

        System.out.println("Enter the age:");
       int age= sc.nextInt();

        System.out.println("Enter the RollNumber:");
       int rollnumber= sc.nextInt();

       s1.Student(id, name, age, rollnumber);

       System.out.println("Id:"+id);
       System.out.println("Name:"+name);
       System.out.println("Age:"+age);
       System.out.println("RollNumber:"+rollnumber);


        sc.close();
    }
}
