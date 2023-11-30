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
        int now = -1;
        StringTokenizer st;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            array[i][0] = Integer.parseInt(st.nextToken());	// 시작
            array[i][1] = Integer.parseInt(st.nextToken());	// 종료
        }

        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1])
                    return o1[0] - o2[0]; // 시작시간이 크면 양수 반환으로 변경됨
                return o1[1] - o2[1];
            }
            // sort 조건 1. 일찍 끝나기    2. 시작이 빠르기
        });

        for(int[] temp: array){
            if(now <= temp[0]){
                now = temp[1];
                answer++;
            }
        }
        System.out.println(answer);
    }
}
