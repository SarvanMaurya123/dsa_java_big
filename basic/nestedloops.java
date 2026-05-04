package basic;

public class nestedloops {

   public static void main(String[] args) {
      int n=5;
      int m=10;
      int count=0;

      for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            System.out.println("Hello"+ count++);
        }
      }
   }
}