import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args) throws IOException {   //프로그램의 시작부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                if(Math.abs(o1) == Math.abs(o2))
                    return o1-o2;
                else
                    return Math.abs(o1) - Math.abs(o2);
            }
        });

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num != 0)
                pq.add(num);
            else {
                if (pq.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(pq.poll());
                }
            }
        }
    }
}
