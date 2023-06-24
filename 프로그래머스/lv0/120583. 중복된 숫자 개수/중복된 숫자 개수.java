import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int i : array){
            answer += i == n ? 1 : 0;
        }
        
        //return answer;
        // 스트림 사용 연습 
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }
}