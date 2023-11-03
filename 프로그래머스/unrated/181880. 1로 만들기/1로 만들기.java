class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int num : num_list){
            while(true){
                if( num == 1 ) break;
                answer++;
                if( num % 2 == 0 ) num /= 2;
                else if( num % 2 != 0 ) num = (num - 1)/2;
            }
        }
        return answer;
    }
}