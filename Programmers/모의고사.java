import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5}; // 5
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5}; // 8
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10
        
        int countA = 0;
        int countB = 0;
        int countC = 0;
            
        for(int i = 0; i < answers.length; i++){
            if(a[i%5] == answers[i])
                countA++;
            if(b[i%8] == answers[i])
                countB++;
            if(c[i%10] == answers[i])
                countC++;
        }
        List<Integer> answer = new ArrayList<Integer>();
        int max = Math.max(countC, Math.max(countA, countB));
        if(max == countA)
            answer.add(1);
        if(max == countB)
            answer.add(2);
        if(max == countC)
            answer.add(3);
        
        int arrListSize = answer.size();
        int[] arr = new int[arrListSize];
        for(int i = 0; i < arrListSize; i++){
            arr[i] = answer.get(i);
        }
        return arr;
    }
}