import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();

        for(int i = l; i <= r; i++){
            String numStr = Integer.toString(i);
            if( numStr.matches("^[05]*$")){
                list.add(i);
            }
        }

        if( list.size() == 0 ) list.add(-1);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}