// 메시지 해쉬맵 [명령어 / 메시지 내용]
// 해쉬맵 [아이디 / 닉네임]
// record 하나씩 분리
// 명령어 분리

// Enter와 Change 경우 (명령어 길이로 확인)
    // Enter와 Change 명령어인 항목은 해쉬맵에 put

// record 다시 순회하면서 메시지 해쉬맵에 맞는 메시지를 리스트에 저장

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> msg = new HashMap<>();
        msg.put("Enter", "님이 들어왔습니다.");
        msg.put("Leave", "님이 나갔습니다.");
            
        HashMap<String, String> users = new HashMap<>();
        for (String cmds : record) {
            String[] cmd = cmds.split(" ");

            if (cmd.length == 3){
                users.put(cmd[1], cmd[2]);
            }
        }

        ArrayList<String> result = new ArrayList<>();

        for (String cmds : record) {
            String[] cmd = cmds.split(" ");

            if(msg.containsKey(cmd[0])){
                result.add(users.get(cmd[1]) + msg.get(cmd[0]));
            }
        }

        return result.toArray(new String[0]);
    }
}