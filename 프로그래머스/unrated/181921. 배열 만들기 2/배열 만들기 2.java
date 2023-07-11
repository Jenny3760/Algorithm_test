import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();

        /*
        for(int i = l; i <= r; i++){
            String numStr = Integer.toString(i);
            if( numStr.matches("^[05]*$")){
                list.add(i);
            }
        }
        */
        
        for (int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;

            if (l <= num && num <= r)
                list.add(num);
        }
        
        if( list.size() == 0 ) list.add(-1);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}