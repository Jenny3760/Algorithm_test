import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = Math.min(a, Math.min(b, Math.min(c, d)));
        int p, q, r;

        int[] nums = new int[7];

        nums[a] += 1;
        nums[b] += 1;
        nums[c] += 1;
        nums[d] += 1;

        for(int i = 1; i < nums.length; i++){
            if( nums[i] == 4 ) answer = 1111 * i;
            else if( nums[i] == 3 ){
                p = i;
                q = findIndex(nums,1).get(0);
                answer = (int) Math.pow((10 * p + q),2);
            } else if( nums[i] == 2 ){
                if( findIndex(nums, 2).size() == 1 ){
                    List<Integer> list = findIndex(nums, 1);
                    q = list.get(0);
                    r = list.get(1);
                    answer = q * r;
                } else {
                    p = i;
                    q = findIndex(nums,2).get(0);
                    answer = (p + q) * Math.abs(p-q);
                }
            }
        }
        
        return answer;
    }
    
    public static List<Integer> findIndex(int[] nums, int num){

        List<Integer> indexs = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if( nums[i] == num ) indexs.add(i);
        }

        return indexs;
    }

}