import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < commands.length; i++){
            int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(arr);
            temp.add(arr[commands[i][2]-1]);
        }
        int[] answer = new int[commands.length];
        for(int i = 0; i < temp.size(); i++){
            answer[i] = temp.get(i);
        }
        return answer;
    }
}