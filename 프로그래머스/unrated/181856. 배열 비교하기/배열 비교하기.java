import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if( arr1.length != arr2.length )
            return arr1.length > arr2.length ? 1 : -1;
        else {
            int num1 = Arrays.stream(arr1).sum();
            int num2 = Arrays.stream(arr2).sum();
            
            answer = num1 == num2 ? 0 : num1 > num2 ? 1 : -1;
        }
        
        return answer;
    }
}