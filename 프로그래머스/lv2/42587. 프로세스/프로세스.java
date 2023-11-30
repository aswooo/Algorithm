import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue queue = new LinkedList<Integer>();
        int answer = 0;
        for(int i: priorities)
            queue.add(i);
        Arrays.sort(priorities);
        for (int i = priorities.length - 1; i >= 0; i--) {
            if(queue.peek().equals(priorities[i])){
                queue.poll();
                answer++;
                if(location-- == 0)
                    return answer;
            }
            else{
                queue.add(queue.poll());
                if(location != 0)
                    location--;
                else
                    location = queue.size()-1;
                i++;
            }

        }
        return answer;
    }
}