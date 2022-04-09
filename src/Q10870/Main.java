package Q10870;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        System.out.println(FIBO(N));
    }

    static int FIBO(int n) {
        if ( n == 0 ) return 0;
        if ( n == 1 ) return 1;
        return FIBO(n - 1 ) + FIBO( n - 2 );
    }
}
