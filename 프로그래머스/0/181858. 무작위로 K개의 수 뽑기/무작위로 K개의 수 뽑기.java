import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        
        for(int a : arr) {
            if( !list.contains(a) && list.size() < k ){
                list.add(a);
            }
        }

        while( list.size() < k ){
            list.add(-1);
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}