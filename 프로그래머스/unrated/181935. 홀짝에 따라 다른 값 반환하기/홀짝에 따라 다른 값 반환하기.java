class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 0; i <= n; i+=2){
            answer += n % 2 == 0 ? i * i : (i+1);
        }
        
        return answer;
    }
}