class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int)Math.ceil(my_str.length() / (double)n)];
        
        int startIdx = 0;
        
        for(int i = 0; i < answer.length; i++){
            startIdx = n * i;    
            
            answer[i] = i == answer.length-1? 
                my_str.substring(startIdx) : my_str.substring( startIdx, startIdx + n );
        }
        
        return answer;
    }
}