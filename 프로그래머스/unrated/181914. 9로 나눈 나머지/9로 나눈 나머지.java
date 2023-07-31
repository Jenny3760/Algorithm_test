class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for(int i : number.toCharArray()){
            answer += i - '0';
        }

        answer %= 9;
        
        return answer;
    }
}