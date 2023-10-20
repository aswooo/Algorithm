import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args) throws IOException {   //프로그램의 시작부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pos = new PriorityQueue(Comparator.naturalOrder());
        PriorityQueue<Integer> neg = new PriorityQueue(Comparator.reverseOrder());

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num < 0){ // 음수일 경우
                neg.add(num);
            }
            else if(num > 0){   //  양수일 경우
                pos.add(num);
            }
            else {   // 0일 경우
                if (neg.isEmpty() && pos.isEmpty()) {
                    System.out.println("0");
                } else if (neg.isEmpty()) {
                    System.out.println(pos.poll());
                } else if (pos.isEmpty()){
                    System.out.println(neg.poll());
                } else if (neg.peek() * -1 <= pos.peek()) {
                    System.out.println(neg.poll());
                } else {
                    System.out.println(pos.poll());
                }
            }
        }
    }
}
