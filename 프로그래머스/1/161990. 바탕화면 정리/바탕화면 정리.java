class Solution {
    public int[] solution(String[] wallpaper) {
        
        int lux = -1, luy = -1, rdx = -1, rdy = -1;
        
        for(int i = 0; i < wallpaper.length; i++){
           int x = i;
           int y = wallpaper[i].indexOf("#");
           int yy = wallpaper[i].lastIndexOf("#");
           
           if( wallpaper[i].contains("#") ){
                lux = lux == -1 ? x : Integer.min(lux, x);
                luy = luy == -1 ? y : Integer.min(luy, y);
                rdx = Integer.max(rdx, x+1);
                rdy = Integer.max(rdy, yy+1);
           }
        
        }
        
        int[] answer = {lux, luy, rdx, rdy};
        
        return answer;
    }
}