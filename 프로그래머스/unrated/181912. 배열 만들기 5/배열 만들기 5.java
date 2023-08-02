import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();

        for(String str : intStrs){
            int num = Integer.valueOf(str.substring(s, s + l));
            if( num > k ) list.add(num);
        }

        System.out.println(list);

        int[] answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}