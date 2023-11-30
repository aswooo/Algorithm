import java.util.ArrayList;

public class Main {

    static boolean[] answer = new boolean[325];
    static boolean[] visited = new boolean[325];
    static int count = 0;
    static int sum = 0;
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        int start = 1;
        int end = 9999;
        int N = 10000;
        answer = new boolean[N];
        visited = new boolean[N];

        for(int i = 1; i <= end; i++){
            if(happyNum(i)){
                count++;
                sum += i;
            }
        }

        sb.append(start).append(" ~ ").append(end).append(" 범위의 행복 수는 ").append(count).append("개이고 총합은 ").append(sum).append("입니다.");
        System.out.println(sb.toString());
        System.out.println(sum * count);
    }

    public static boolean happyNum(int i){
        int num = i;
        ArrayList<Integer> temp = new ArrayList<>();
        while(!visited[num]){ // 나온적 없는 숫자
            visited[num] = true;
            temp.add(num);
            if(num == 1) // 행복 수인지
                break;
            i = num;
            num = 0;
            while(i > 0) {
                num += (int) Math.pow(i % 10, 2);
                i /= 10;
            } // 각 자리 수 제곱의 합
        }
        if(answer[num] || num == 1){
            setNum(temp, true);
            return true;
        } // 행복 수일 경우
        else {
            setNum(temp, false);
            return false;
        } // 행복 수가 아닐 경우


    }

    public static void setNum(ArrayList<Integer> arrayList, boolean bool){
        for(int i: arrayList){
            answer[i] = bool;
        }
    } // 방문했던 수가 행복수인지 아닌지
}



