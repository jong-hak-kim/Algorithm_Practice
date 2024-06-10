// 정지된 유저 확인
// 유저가 신고한 ID 확인
    // 그 중 정지된 ID 확인

//해쉬맵<유저 ID, 신고 List>
    //순회하며 정지된 유저 수 반환
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Integer> reportMap = new HashMap<>();
        HashMap<String, List<String>> reportUsers = new HashMap<>();

        //신고당한 횟수 계산
        for (String userReportLog : report) {
            String[] log = userReportLog.split(" ");
            String user = log[0];
            String reportUser = log[1];

            if (!reportUsers.containsKey(user)) {
                reportUsers.put(user, new ArrayList<>());
            }

            if (!reportUsers.get(user).contains(reportUser)) {
                reportMap.put(reportUser, reportMap.getOrDefault(reportUser, 0) + 1);
                reportUsers.get(user).add(reportUser);
            }
        }

        List<String> keySet = new ArrayList<>(reportMap.keySet());

        List<String> banUsers = new ArrayList<>();

        //정지당한 유저 구하기
        for (String key : keySet) {
            if (reportMap.get(key) >= k) {
                banUsers.add(key);
            }
        }

        List<Integer> answer = new ArrayList<>();

        for (String id : id_list) {
            List<String> reportUser = reportUsers.get(id);
            int count = 0;
            if (reportUser == null) {
                answer.add(0);
                continue;
            }
            for (String key : banUsers) {
                if (reportUser.contains(key)) {
                    count++;
                }
            }
            answer.add(count);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
        
    }
}