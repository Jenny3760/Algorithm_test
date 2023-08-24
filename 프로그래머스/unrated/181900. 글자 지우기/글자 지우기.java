import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        Arrays.parallelSort(indices);
        
        for(int i = 0; i < my_string.length(); i++){
            if( Arrays.binarySearch(indices, i) < 0)
                answer += my_string.charAt(i);            
        }
        
        return answer;
    }
}