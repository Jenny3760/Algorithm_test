import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] temp = my_string.split(" ");

        int num = (int) Arrays.stream(temp).filter(e -> e.equals("")).count();
        String[] answer = new String[ temp.length - num ];

        int index = 0;
        for(String str : temp){
            if( !str.equals("") ) answer[index++] = str;
        }
        
        return answer;
    }
}