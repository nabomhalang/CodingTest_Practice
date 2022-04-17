package boj.kr.Q2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            int R = Integer.parseInt(str[0]);
            String S = str[1];

            for (int j = 0; j < S.length(); j++) {
                for(int a = 0; a < R; a++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
