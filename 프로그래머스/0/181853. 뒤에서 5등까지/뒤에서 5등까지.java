import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];

        Arrays.sort(num_list);
        
        for(int i = 0; i < 5; i++){
            answer[i] = num_list[i];
        }
        
        /*
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());

        Collections.sort(list);

        List<Integer> list2 = new ArrayList<>(list.subList(0,5));

        answer = list2.stream().mapToInt(i->i).toArray();
        */
        
        return answer;
    }
}