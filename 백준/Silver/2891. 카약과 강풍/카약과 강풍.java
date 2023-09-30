import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int[] team = new int[Integer.parseInt(st.nextToken()) + 2];
        int broken = Integer.parseInt(st.nextToken());
        int remain = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < broken; i++){
            team[Integer.parseInt(st.nextToken())] -= 1;
        }
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < remain; i++){
            team[Integer.parseInt(st.nextToken())] += 1;
        }

        for(int i = 1; i < team.length - 1; i++ ){
            if(team[i] == -1){
                if(team[i-1] == 1){
                    team[i-1] -= 1;
                    team[i] += 1;
                }
                else if(team[i+1] == 1){
                    team[i+1] -= 1;
                    team[i] += 1;
                }
            }
        }
        for(int temp: team)
            if(temp == -1)
                answer++;

        System.out.println(answer);
    }
}
