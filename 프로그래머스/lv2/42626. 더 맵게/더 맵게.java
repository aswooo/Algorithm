import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i: scoville)
            queue.add(i);
        while(queue.size() > 1){
            if(queue.peek() >= K )
                return answer;
            else {
                queue.add(queue.poll() + (queue.poll() * 2));
                answer++;
            }
        }
        if(queue.peek() >= K )
            return answer;
        else 
            return -1;
    }
}