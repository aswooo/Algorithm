import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int answer = n - lost.length;
        for(int i = 0; i < lost.length; i++){
            int temp = lost[i];
            for(int j = 0; j < reserve.length; j++)
                if(temp == reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
        }
        for(int i = 0; i < lost.length; i++){
            int low = lost[i] - 1;
            int high = lost[i] + 1;
            for(int j = 0; j < reserve.length; j++){
                if(reserve[j] == low){
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
                else if (reserve[j] == high) {
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
            }
        }
        for(int i: lost)
            if(i == -1)
                answer++;
        return answer ;
    }
}