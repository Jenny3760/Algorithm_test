import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        
        List<Integer> list = new ArrayList<>();
        
        int i = 0;
        
        while( i < arr.length ){
            if( list.size() == 0 ) list.add(arr[i++]);
            else if( list.get(list.size()-1) < arr[i] ) list.add(arr[i++]);
            else list.remove(list.size()-1);
        }
        
        System.out.println(list.toString());
        return list.stream().mapToInt(j -> j).toArray();
    }
}