class Solution {
    public int solution(String binomial) {
        String[] bino = binomial.split(" ");
        
        int a = Integer.parseInt(bino[0]);
        int b = Integer.parseInt(bino[2]);
        
        switch(bino[1]){
            case "+" :
                return a + b;
            case "-" : 
                return a - b;
            case "*" : 
                return a * b;
        }
        
        return 0;
    }
}