import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] myStrings = myString.split("x", -1);
    
        int[] answer = new int[myStrings.length];
        
        for(int i = 0; i < myStrings.length; i++){
            answer[i] = myStrings[i].length();
        }
        
        return answer;
    }
}