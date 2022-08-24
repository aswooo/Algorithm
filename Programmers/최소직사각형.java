class Solution {
    public int solution(int[][] sizes) {
        
        int length = 0;
        int width = 0;
        for(int[] temp: sizes){
            if(length < Math.max(temp[0], temp[1])){
                length = Math.max(temp[0], temp[1]);
            }
            // length = Math.max(length, Math.max(temp[0], temp[1]))
            if(width < Math.min(temp[0], temp[1])){
                width = Math.min(temp[0], temp[1]);
            }
            // width = Math.max(width, Math.max(temp[0], temp[1]))
        }
        int answer = length * width;
        return answer;
    }
}