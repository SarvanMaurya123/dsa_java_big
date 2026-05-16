package basic;

public class Factorial {

    public long FactorialNumber(){
        int num=5;
        long fact= 1;

        for(int i=1; i<=num; i++){
            fact *=i;
        }
        System.out.println("Factorail:"+fact);
        return fact;
    }

    public static void main(String[] args) {
       
      Factorial fact= new Factorial();
      fact.FactorialNumber();
    }
}