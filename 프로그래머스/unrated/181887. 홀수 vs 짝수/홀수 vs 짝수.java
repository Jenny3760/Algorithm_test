class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int even = 0; // 짝수의 합
        int odd = 0; // 홀수의 합
        
        for(int i = 0; i < num_list.length; i++){
            if( i % 2 == 0 ) even += num_list[i];
            else odd += num_list[i];
        }
        
        return even > odd ? even : odd ;
    }
}