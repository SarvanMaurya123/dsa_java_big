package array;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    static void findLeaders(int arr[]) {
        ArrayList<Integer> leaders = new ArrayList<>();

        int max = arr[arr.length - 1];
        leaders.add(max);

        for(int i=arr.length-2; i>=0;i--){
          if(arr[i]>=max){
            max=arr[i];
            leaders.add(arr[i]);
          }
        }

        Collections.reverse(leaders);

        System.out.println("Leaders"+leaders);
    }
        

    public static void main(String[] args) {

        int arr[] = {16, 17, 4, 3, 5, 2};

        findLeaders(arr);
    
    }
}
