class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        
        for(int i = 0; i < arr.length; i++){
            if( arr.length % 2 == 0 && i % 2 != 0 ) answer[i] += n;
            if( arr.length % 2 != 0 && i % 2 == 0 ) answer[i] += n;
        }
        
        return answer;
    }
}