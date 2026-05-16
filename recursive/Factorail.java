package recursive;

public class Factorail {
    static long FactorailProgram(long n){
      if(n==0) return 1;
      return n*FactorailProgram(n-1);
    }

    public static void main(String[] args) {
        long number=5;
        System.out.println("Factorail Number IS:"+ FactorailProgram(number));
    }
}
