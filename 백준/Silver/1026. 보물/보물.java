import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 입력의 개수
        int[][] array = new int[2][N];
        int answer = 0;
        StringTokenizer st;

        for(int j = 0; j <2; j++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int i = 0; i < N; i++) {
                array[j][i] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(array[0]);
        Arrays.sort(array[1]);
        for(int i = 0; i < N; i++) {
            answer += (array[0][i] * array[1][N-i-1]);
        }

        System.out.println(answer);
    }
}
