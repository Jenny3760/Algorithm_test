import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int start = list.indexOf(2);
        int end = list.lastIndexOf(2);
        
        int[] answer = new int[end-start+1];

        int index = 0;
        
        if( start == -1 ){
            answer[index] = -1;
        } else {
            for(int i = start; i <= end; i++){
                answer[index++] = arr[i];
            }
        }
        
        return answer;
    }
}