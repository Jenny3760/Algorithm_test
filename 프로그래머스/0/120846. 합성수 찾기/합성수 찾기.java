class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 4; i <= n; i++){
            if( findCompositeNum(i) ){
                answer++;
            }
        }
        
        return answer;
    }
    
    public boolean findCompositeNum(int num){
        int cnt = 0;
        for(int i = 1; i <= num; i++){
            if( num % i == 0 ) cnt++;
        }
        return cnt >= 3;
    }
}