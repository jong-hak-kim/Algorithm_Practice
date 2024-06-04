// 해쉬맵 [아이디 / 닉네임]
// record 하나씩 분리
// 명령어 분리

// Enter 명령어인 항목은 해쉬맵에 입력
// Change 명령어라면 해쉬맵 닉네임 변경

// record 다시 순회하면서 명렁어와 아이디만 확인 후 결과 출력 

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> users = new HashMap<>();
        for (String logs : record) {
            String[] log = logs.split(" ");


            String command = log[0];
            if (command.equals("Leave")) {
                continue;
            }
            String userId = log[1];
            String nickname = log[2];

            if (command.equals("Enter")) {
                users.put(userId, nickname);
            } else if (command.equals("Change")) {
                users.put(userId, nickname);
            }
        }

        List<String> results = new ArrayList<>();

        for (String logs : record) {
            String[] log = logs.split(" ");

            String command = log[0];
            String userId = log[1];

            if (command.equals("Enter")) {
                results.add(users.get(userId) + "님이 들어왔습니다.");
            } else if (command.equals("Leave")) {
                results.add(users.get(userId) + "님이 나갔습니다.");
            }
        }

        return results.toArray(String[]::new);
    }
}