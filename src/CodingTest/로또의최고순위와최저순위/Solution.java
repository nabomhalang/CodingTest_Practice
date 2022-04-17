package CodingTest.로또의최고순위와최저순위;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int match = 0;
        int zero = 0;

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for ( int lotto : lottos ) {
            if ( Arrays.binarySearch(win_nums, lotto) >= 0 ) match++;
            if(lotto == 0) zero++;
        }
        answer[1] = Math.min(7-match, 6);

        answer[0] = Math.min(7-(match + zero), 6);

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] lottos = { 44, 1, 0, 0, 31, 25 };
        int[] win_nums = { 31, 10, 45, 1, 6, 19 };
        System.out.println(sol.solution(lottos, win_nums));
    }
}
