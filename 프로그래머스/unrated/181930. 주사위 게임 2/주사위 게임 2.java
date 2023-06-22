class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int abc = a + b + c;
        int abc2 = (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        int abc3 = (int)(Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));
        
        if( a == b && b == c ) answer = abc * abc2 * abc3;
        else if( a == b && b != c ) answer = abc * abc2;
        else if( a == c && b != c ) answer = abc * abc2;
        else if( b == c && a != c ) answer = abc * abc2;
        else answer = abc;
        

        
        return answer;
    }
}