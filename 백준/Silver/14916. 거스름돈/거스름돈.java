import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N == 1 || N == 3)
            System.out.println(-1);
        else if ((N % 5) % 2 == 0)   // 5로 나눈 나머지가 짝수일 경우
            System.out.println((N / 5) + ((N % 5) / 2));
        else
            System.out.println(((N / 5) + ((N % 5 + 5) / 2)) - 1);
    }
}
