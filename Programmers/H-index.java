import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int max  = citations.length;
        Arrays.sort(citations);
        int answer = citations[max-1];
        
        for(int i=0; i<max; i++){
            if(citations[i] >= max-i){
                answer = max-i;
                break;
            }
        }
    return answer;
    }
}