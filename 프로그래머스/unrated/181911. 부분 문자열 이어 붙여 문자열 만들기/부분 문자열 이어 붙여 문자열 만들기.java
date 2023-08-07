class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        for(int i = 0; i < my_strings.length; i++){
            String str = my_strings[i];
            int[] part = parts[i];
            int s = part[0];
            int e = part[1];

            answer += str.substring(s,e+1);
        }
        
        return answer;
    }
}