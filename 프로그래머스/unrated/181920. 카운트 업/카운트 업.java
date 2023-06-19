import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        
        int index = 0;
        for(int i = start; i <= end; i++){
            answer[index++] = i;
        }
        
        //return answer;
        
        return IntStream.rangeClosed(start, end).toArray();
        
    }
}