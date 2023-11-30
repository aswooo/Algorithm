import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());   // 빌딩의 갯수
        Long answer = 0L;
        Stack<Long> stack = new Stack<>();
        for(int i = 0; i < N; i++){
            Long temp = Long.parseLong(br.readLine());
            while (!stack.isEmpty() && stack.peek() <= temp) {
                stack.pop();
            }
            stack.push(temp);
            answer += stack.size() - 1;

        }
        System.out.println(answer);
    }
}
