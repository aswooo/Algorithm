import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String[] temp : clothes){
            map.put(temp[1], map.getOrDefault(temp[1], 0) + 1);
        }
        int one = 0;
        for(Integer t : map.values()){
            answer *= t+1;
        }
        return answer-1;
    }
}