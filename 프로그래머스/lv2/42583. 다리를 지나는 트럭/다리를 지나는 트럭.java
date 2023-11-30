import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
                int answer = 0;
        Queue<Integer> bridge = new LinkedList<>();
        int currentWeight = 0;

        for(int i = 0; i < bridge_length; i++){
            bridge.offer(0);
        }

        for(int i = 0; i < truck_weights.length;){
            if(currentWeight + truck_weights[i] > weight){ // 꽉 참
                answer++;
                currentWeight -= bridge.peek();
                if(bridge.poll() != 0 && currentWeight + truck_weights[i] <= weight){
                    bridge.offer(truck_weights[i]);
                    currentWeight += truck_weights[i];
                    i++;
                }
                else
                    bridge.offer(0);
            }
            else{
                answer++;
                currentWeight -= bridge.poll();
                bridge.offer(truck_weights[i]);
                currentWeight += truck_weights[i];
                i++;
            }
        }
        return answer + bridge_length;
    }
}