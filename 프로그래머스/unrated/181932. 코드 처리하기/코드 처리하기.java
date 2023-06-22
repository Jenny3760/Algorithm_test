class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++){
            char c = code.charAt(i);
            
            if( mode == 0 ){
                if( c != '1' ) answer += i % 2 == 0 ? c : "";
                else mode = 1;
            } else {
                if( c != '1' ) answer += i % 2 != 0 ? c : "";
                else mode = 0;
            }
            
        }
        
        return answer == "" ? "EMPTY" : answer;
    }
}