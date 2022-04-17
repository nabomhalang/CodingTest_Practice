package CodingTest.신고결과받기;

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashSet<String> reportSet = new HashSet<String>();
        for(String r : report) reportSet.add(r);

        HashMap<String, ArrayList<String>> notiHash = new HashMap();
        for(String r : reportSet) {
            int blankidx = r.indexOf(" ");
            String reporter = r.substring(0, blankidx);
            String reporty = r.substring(blankidx+1);

            ArrayList<String> reporterList = notiHash.getOrDefault(reporty, null);
            if (reporterList == null) reporterList = new ArrayList<>();

            reporterList.add(reporter);
            notiHash.put(reporty, reporterList);

        }

        HashMap<String, Integer> reporterHash = new HashMap<>();
        for(ArrayList<String> notifyList : notiHash.values()) {
            if(notifyList.size() >= k)
                for(String reporter : notifyList)
                    reporterHash.put(reporter, reporterHash.getOrDefault(reporter, 0) + 1);
        }

        for(int i = 0; i < id_list.length; i++)
            answer[i] = reporterHash.getOrDefault(id_list[i], 0);

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] id_list = {"muzi", "apeach", "frodo", "apeach"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        solution.solution(id_list, report, k);
    }
}
