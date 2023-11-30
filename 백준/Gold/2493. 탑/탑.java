import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        Stack<Long[]> stack = new Stack<>();
        Long[] index = {Long.parseLong(st.nextToken()), 1L};
        stack.push(index);
        System.out.print("0 ");
        for(Long i = 2L; i <= N; i++){
            index = new Long[]{Long.parseLong(st.nextToken()), i};
            while (stack.peek()[0] < index[0]) {      // peek한 애가 못받을 경우
                stack.pop();
                if (stack.isEmpty()) {
                    sb.append("0 ");
                    break;
                }
            }
            if (!stack.isEmpty()) {
                if (stack.peek()[0] > index[0]) {
                    sb.append(stack.peek()[1] + " ");
                }
            }
            stack.push(index);
        }
        System.out.println(sb.toString());
    }
}
