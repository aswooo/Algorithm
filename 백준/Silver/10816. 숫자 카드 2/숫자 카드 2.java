import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());   // 카드의 갯수
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        Long[] numbers = new Long[N];
        for(int i = 0; i < N; i++)
            numbers[i] = Long.parseLong(st.nextToken());
        int M = Integer.parseInt(br.readLine());   // 찾고자 하는 수
        Long[] finsNum = new Long[M];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++)
            finsNum[i] = Long.parseLong(st.nextToken());
        Arrays.sort(numbers);
        for(long num: finsNum){
            int index = Arrays.binarySearch(numbers, num);
            if(index >= 0)    //  해당 수의 카드가 있을 경우
                sb.append(upperBound(numbers, num) - lowerBound(numbers, num) + 1);
            else
                sb.append("0");
            sb.append(" ");
        }
        System.out.println(sb.deleteCharAt(sb.length()-1).toString());
    }
    static int lowerBound(Long[] arr, long target) {
        int start = 0;
        int end = arr.length; // start 가 마지막 인덱스 직전까지 체크되어야한다.

        while (start < end) {
            int mid = (start + end) / 2;

            if (target <= arr[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int upperBound(Long[] arr, long target) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;

            if (target >= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start - 1;
    }
}
