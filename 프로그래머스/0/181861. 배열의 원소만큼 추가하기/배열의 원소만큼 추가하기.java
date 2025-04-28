import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
                // int len = 0;
        
        // for(int num : arr){
        //     len += num;
        // }

        int len = Arrays.stream(arr).sum();
        
        int[] answer = new int[len];

        int j = 0;
        
        for(int i = 0; i < arr.length; i++){
            int index = 0;    
            while( arr[i] > index++ ){
                answer[j++] = arr[i];
            }
        }
        
        return answer;
    }
}