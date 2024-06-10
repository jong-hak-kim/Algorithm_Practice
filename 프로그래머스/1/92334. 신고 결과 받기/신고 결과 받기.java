//해쉬맵<신고당한 유저 ID, 신고한 유저들>
    //순회하며 정지당한 유저는 결과 해쉬맵 저장
    //저장 안된 유저들은 0으로 저장
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;


class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        HashMap<String, Integer> count = new HashMap<>();

        //신고당한 횟수 계산
        for (String userReportLog : report) {
            String[] log = userReportLog.split(" ");
            String user = log[0];
            String reportUser = log[1];

            if (!reportMap.containsKey(reportUser)) {
                reportMap.put(reportUser, new HashSet<>());
            }

            reportMap.get(reportUser).add(user);
        }

        for (Map.Entry<String, HashSet<String>> entry : reportMap.entrySet()) {
            if (entry.getValue().size() >= k) {
                for (String userId : entry.getValue()) {
                    count.put(userId, count.getOrDefault(userId, 0) + 1);
                }
            }
        }

        int[] answer = new int[id_list.length];

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = count.getOrDefault(id_list[i], 0);
        }

        return answer;
        
    }
}