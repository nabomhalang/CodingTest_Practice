package CodingTest.신규아이디추천;

class Solution {
    public String solution(String new_id) {
        String answer = "";

        // case 1
        new_id = new_id.toLowerCase();

        // case 2
        for ( int i = 0; i < new_id.length(); i++ ) {
            char ch = new_id.charAt(i);
            if(Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == '-' || ch == '_' || ch == '.') answer += ch;
        }

        // case 3
        while (answer.indexOf("..") != -1) answer = answer.replace("..", ".");

        // case 4
        if (!answer.isEmpty() && answer.charAt(0) == '.') answer = answer.substring(1);
        if (!answer.isEmpty() && answer.charAt(answer.length() - 1) == '.') answer = answer.substring(0, answer.length() - 1 );

        // case 5
        if (answer.isEmpty()) answer = "a";

        // case 6
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
            if ( answer.charAt(answer.length() - 1) == '.') answer = answer.substring(0, answer.length() - 1);
        }

        // case 7
        while (answer.length() < 3) answer += answer.charAt(answer.length() - 1);

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("...!@BaT#*..y.abcdefghijklm"));
    }
}