import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];

        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());

        Collections.sort(list);

        List<Integer> list2 = new ArrayList<>(list.subList(0,5));

        answer = list2.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}