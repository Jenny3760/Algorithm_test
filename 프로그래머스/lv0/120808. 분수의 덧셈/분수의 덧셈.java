class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer3 = 0, denom3 = 0;
        
        int lcm = (denom1 * denom2) / getGCD(denom1, denom2);
        
        numer3 = numer1 * (lcm/denom1) + numer2 * (lcm/denom2);
        denom3 = lcm;

        int gcd = getGCD(numer3, denom3);
        
        numer3 = numer3 / gcd;
        denom3 = denom3 / gcd;
        
        int[] answer = {numer3, denom3};
        return answer;
    }
    
    public static int getGCD(int a, int b){
        if( a % b == 0 ) return b;
        return getGCD(b, a % b);
    }
}