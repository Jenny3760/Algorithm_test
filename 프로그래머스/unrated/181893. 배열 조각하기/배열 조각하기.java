import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        /*
        for(int i = 0; i < query.length; i++){
            if( i % 2 == 0 ){ // 짝수이면
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            } else { // 홀수이면
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
        */
        
        int start = 0;
        int end = query.length-1;
        
        for(int i = 0; i < query.length; i++){
            if( i % 2 == 0 ){ // 짝수이면
                end = start + query[i] + 1;
            } else { // 홀수이면
                start += query[i];
            }
        }
        
        return Arrays.copyOfRange(arr, start, end);
        
    }
}