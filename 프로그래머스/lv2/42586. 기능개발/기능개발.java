import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;


class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> progress = new LinkedList<Integer>();
        Queue<Integer> speed = new LinkedList<Integer>();
        for(int i = 0; i < progresses.length; i++){
            progress.add(progresses[i]);
            speed.add(speeds[i]);
        } // 큐
        while(!progress.isEmpty()) {
            int count = 0;
            while (!progress.isEmpty() && progress.peek() >= 100){
                progress.poll();
                speed.poll();
                count++;
            }
            if(count != 0)
                answer.add(count);
            for (int i = 0; i < progress.size(); i++) {
                int num = speed.poll();
                progress.add(progress.poll() + num);
                speed.add(num);
            }
        }
        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}