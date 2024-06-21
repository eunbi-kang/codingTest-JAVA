package LV1;
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        // arr = Arrays.stream(arr).distinct().toArray();
        List<Integer> newArr = new ArrayList<>();
        
        // for(int i=0; i<=arr.length;i++) {
        //     if(arr[i] == arr[i+1]){
        //         continue;
        //         // arr = Arrays.copyOfRange(arr, i+1, arr.length);
        //     } else { 
        //         newArr.add(arr[i]);
        //         // arr = Arrays.copyOfRange(arr, i, arr.length);
        //     }
            
        // }
        int i=0;
        while(true){
            if(i ==arr.length-1){
                newArr.add(arr[i]);
                break;
            }
            if(arr[i]== arr[i+1]){
                i++;
            } else {
                newArr.add(arr[i]);
                i++;
            }
            // System.out.println(newArr);
        }
        
        for(int j=0; j<newArr.size();j++){
            System.out.println(newArr);
        }


        return answer;
    }
}