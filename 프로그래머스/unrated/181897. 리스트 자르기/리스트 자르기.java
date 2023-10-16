import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        int start = 0;
        int end = 0;
        int idx = 1;

        List<Integer> list = new ArrayList<>();

        if( n == 1 ){
            start = 0;
            end = b;
        } else if( n == 2 ){
            start = a;
            end = num_list.length-1;
        } else if( n == 3 ) {
            start = a;
            end = b;
        } else if( n == 4 ){
            start = a;
            end = b;
            idx = c;
        }

        for( int i = start; i <= end; i += idx){
            list.add(num_list[i]);
        }

        int[] answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}