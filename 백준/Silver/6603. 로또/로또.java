import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited;
    static LinkedList<Integer[]> arr = new LinkedList<Integer[]>();
    static int k, count, t; // count -> 몇개를 선택했는지
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        t = 0;
        while(true){
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            if(k == 0)
                break;
            arr.add(new Integer[k]);
            Integer[] tempArr = arr.get(t);
            for (int i = 0; i < k; i++){
                tempArr[i] = Integer.parseInt(st.nextToken());
            }
            t++;
        }
        for(int i = 0; i < arr.size(); i++){
            count = 0;
            visited = new boolean[arr.get(i).length];
            tracking(i, count);
            if (i + 1 != arr.size()) {
                System.out.println();
            }
        }
    }

    public static void tracking(int arrIdx, int idx) {
        if (count == 6)
            System.out.println(sb.delete(sb.length()-1, sb.length()) .toString());
        else if (count < 6) {
            for (int i = idx; i < arr.get(arrIdx).length; i++) {
                if(arr.get(arrIdx).length - i + count < 6)
                    continue;
                if (!visited[i]) { //
                    visited[i] = true;
                    sb.append(arr.get(arrIdx)[i]).append(" ");
                    count++;
                    tracking(arrIdx, i + 1);
                    visited[i] = false;
                }
            }
        }
        count--;
        if(sb.length() == 0)
            return;
        sb.delete(sb.length() - 1, sb.length());
        while(sb.length() != 0 && sb.charAt(sb.length() - 1) != ' ') {
            sb.delete(sb.length() - 1, sb.length());
        }
    }
}

