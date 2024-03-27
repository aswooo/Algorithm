import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());   // 과목수
        int m = Integer.parseInt(st.nextToken());   // 마일리지수
        int[] needs = new int[n];
        int answer = 0;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int p = Integer.parseInt(st.nextToken());   // 신청 인원 수
            int l = Integer.parseInt(st.nextToken());   // 수강 가능 인원
            st = new StringTokenizer(br.readLine(), " ");
            Integer[] arr = new Integer[p];
            for(int j = 0; j < p; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr, Collections.reverseOrder());
            if(p >= l)
                needs[i] = arr[l-1];
            else
                needs[i] = 1;
        }
        Arrays.sort(needs);
        for(int t: needs){
            m -= t;
            if(m < 0){
                break;
            }
            answer++;
        }

        System.out.println(answer);
    }
}