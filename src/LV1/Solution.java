package LV1;
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        arr = Arrays.stream(arr).distinct().toArray();
        List<Integer> newArr = new ArrayList<>();

        for(int i=0; i<arr.length;i++) {
            if(arr[i] == arr[i+1]){
                arr[i+1] = arr[i];
                newArr.add(arr[i+1]);
                // arr = Arrays.copyOfRange(arr, i+1, arr.length);
                
            } else { 
                newArr.add(arr[i]);
                // arr = Arrays.copyOfRange(arr, i, arr.length);
            }
            System.out.println(newArr);
        }
       

        return answer;
    }
}