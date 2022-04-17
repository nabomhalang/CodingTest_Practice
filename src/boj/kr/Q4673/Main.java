package boj.kr.Q4673;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean check[] = new boolean[10001];

        for (int i = 0; i < 10001; i++) {
            int n = SELF(i);
            if ( n < 10001 ) check[n] = true;
        }

        for (int i = 1; i < 10001; i++) {
            if (check[i] != true) bw.write(i + "\n");
        }
        bw.close();
    }

    private static int SELF(int n) {
        int total = n;
        while ( n != 0 ) {
            total += ( n % 10 );
            n /= 10;
        }
        return total;
    }
}
