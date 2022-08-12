//import java.util.*;
//
//public class Solution {
//    public int[] solution(int []arr) {
//        Queue<Integer> queue = new LinkedList<Integer>();
//
//        for(int i=0; i < arr.length-1; i++){
//            if(arr[i] != arr[i+1]){
//                queue.add(arr[i]);
//            }
//            if(i+1 == arr.length-1){
//                queue.add(arr[i+1]);
//            }
//        }
//
//        int[] answer = new int[queue.size()];
//        int temp = 0;
//        while(!queue.isEmpty()){
//            answer[temp] = queue.poll();
//            temp++;
//        }
//        return answer;
//    }
//}


import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int temp = 10;
        for(int i=0; i < arr.length; i++){
            if(temp != arr[i]){
                temp = arr[i];
                queue.add(arr[i]);
            }
        }

        int[] answer = new int[queue.size()];
        temp = 0;
        while(!queue.isEmpty()){
            answer[temp] = queue.poll();
            temp++;
        }
        return answer;
    }
}
