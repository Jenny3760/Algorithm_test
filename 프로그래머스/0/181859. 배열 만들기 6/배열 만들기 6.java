import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answerList = new ArrayList<>();
        
        int i = 0;
        
        while( i < arr.length ){
            if( answerList.size() == 0 ){
                answerList.add(arr[i++]);
            } else if( answerList.get(answerList.size() - 1) == arr[i] ){
                answerList.remove(answerList.size() - 1);
                i++;
            } else {
                answerList.add(arr[i++]);
            }
        }
        
        if(answerList.size()==0) answerList.add(-1);
        
        return answerList.stream().mapToInt(Integer::intValue).toArray();

    }
}