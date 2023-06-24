class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multi = 1;
        
        for(int i : num_list){
            sum += i;
            multi *= i;
        }
        
        return multi < sum * sum ? 1 : 0;
    }
}