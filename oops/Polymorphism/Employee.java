package oops.Polymorphism;


// There are two types of Polymorphism:
// 1. Compile Time Polymorphism (Method Overloading)
// 2. Run Time Polymorphism (Method Overriding)

// Methods that cannot be overridden:
// 1. static methods
// 2. final methods
// 3. private methods



/*
   Variables/fields do not support polymorphism in Java.

   Field access depends on the reference type, not the object type.

   A a = new B();

   Here:
   - Reference type = A
   - Object type = B

   So:
   a.x -> accesses variable x from class A

   Output:
   10

   Fields are hidden, not overridden.

   class A {
    int x = 10;
}

class B extends A {
    int x = 20;
}
public class Main {
    public static void main(String[] args) {
         A a = new B();

        System.out.println(a.x);
    }
}
*/


class A{
    static void Fun(){
        System.out.println("Hello Fun");
    }

}

class B extends A{
    static void Fun(){
        System.out.println("Hello Fun2");
    }
}


class X{
    private void Fun(){
        System.out.println("Hello Private");
    }
}

class Y extends X{
    private void Fun(){
        System.out.println("Hello Fun");
    }
}

