import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        
        Stack<Integer> stack = new Stack<>();

        int i = 0;
        while( i < arr.length ){
            if( stack.size() == 0 ) stack.add(arr[i++]);
            else if( stack.peek() < arr[i] ) stack.add(arr[i++]);
            else stack.pop();
        }
        
        return stack.stream().mapToInt(j -> j).toArray();
        
        /*
        List<Integer> list = new ArrayList<>();
        
        int i = 0;
        
        while( i < arr.length ){
            if( list.size() == 0 ) list.add(arr[i++]);
            else if( list.get(list.size()-1) < arr[i] ) list.add(arr[i++]);
            else list.remove(list.size()-1);
        }
        
        return list.stream().mapToInt(j -> j).toArray();
        */
    }
}