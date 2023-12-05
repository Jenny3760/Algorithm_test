import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("a", " ").replaceAll("b", " ").replaceAll("c", " ").trim();
    
        if( "".equals(myStr) ){
            String[] answer = {"EMPTY"};
            return answer;
        }
        
        return myStr.split("[ ]+");
    }
}