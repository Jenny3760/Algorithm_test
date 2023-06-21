class Solution {
    public int solution(int a, int b) {
        String stra = String.valueOf(a);
        String strb = String.valueOf(b);
        
        int ab = Integer.parseInt(stra + strb);
        int ba = Integer.parseInt(strb + stra);
    
        return ab > ba ? ab : ba;
    }
}