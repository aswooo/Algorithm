import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 입력의 개수
        int[][] array = new int[N][2];
        int answer = 0;
        StringTokenizer st;

        for(int j = 0; j < N; j++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int i = 0; i < 2; i++) {
                array[j][i] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0])
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });
        int start = array[0][0];
        int end = array[0][1];
        for(int[] temp: array) {
            if(start > temp[0])
                start = temp[0];
            else if (end < temp[0]) {
                answer += end - start;
                start = temp[0];
                end = temp[1];
            }
            else if(end < temp[1])
                end = temp[1];
        }
        answer += end - start;

        System.out.println(answer);
    }
}
