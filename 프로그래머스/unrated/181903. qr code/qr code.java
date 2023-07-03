class Solution {
    public String solution(int q, int r, String code) {
       // String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < code.length(); i++){
           // if( i % q == r ) answer += code.charAt(i);    
            if( i % q == r ) sb.append(code.charAt(i));
        }
        
       // return answer;
        return sb.toString();
    }
}