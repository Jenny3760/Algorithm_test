import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        List<Integer> list = new ArrayList<>();

        for(int i : arr){
            if( !Arrays.stream(delete_list).boxed().collect(Collectors.toList()).contains(i) )
                list.add(i);
        }

        int [] answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}