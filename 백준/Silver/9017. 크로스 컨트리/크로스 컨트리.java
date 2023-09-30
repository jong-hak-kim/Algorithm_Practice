import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();
        int T = Integer.parseInt(bufferedreader.readLine());
        int teamCount = 0;

        for (int i = 0; i < T; i++) {
            HashSet<Integer> hashSet = new HashSet<>();
            int score = 1;
            int N = Integer.parseInt(bufferedreader.readLine());
            stringTokenizer = new StringTokenizer(bufferedreader.readLine());
            int[][] teamScore = new int[N][2];

            for (int j = 0; j < teamScore.length; j++) {
                int team = Integer.parseInt(stringTokenizer.nextToken());
                teamScore[j][0] = team;
                hashSet.add(team);
            }
            Iterator<Integer> iterator = hashSet.iterator();
            int[][] totalScore = new int[hashSet.size()][2];

            // 팀 6명 여부 확인;
            while (iterator.hasNext()) {
                int team = iterator.next();
                int count = 0;

                totalScore[teamCount][0] = team;
                teamCount++;
                for (int j = 0; j < teamScore.length; j++) {
                    if (teamScore[j][0] == team) {
                        count++;
                    }
                }
                if (count < 6) {
                    for (int j = 0; j < teamScore.length; j++) {
                        if (teamScore[j][0] == team) {
                            teamScore[j][1] = 300;
                        }
                    }
                }
            }
            teamCount = 0;
            // 6명 아닌 팀 제외하고 점수 등록
            for (int j = 0; j < teamScore.length; j++) {
                if (teamScore[j][1] == 300) {
                    continue;
                }
                teamScore[j][1] = score;
                score++;
            }

            // 점수 합계 계산
            for (int j = 0; j < totalScore.length; j++) {
                int count = 0;
                for (int j2 = 0; j2 < teamScore.length; j2++) {
                    if ((totalScore[j][0] == teamScore[j2][0]) && teamScore[j2][1] != 300) {
                        totalScore[j][1] += teamScore[j2][1];
                        count++;
                    }
                    if (count == 4) {
                        break;
                    }
                }
            }
            Arrays.sort(totalScore, (e1, e2) -> {
                if (e1[1] == e2[1]) {
                    int e1Count = 0;
                    int e2Count = 0;
                    for (int j = 0; j < teamScore.length; j++) {
                        if (teamScore[j][0] == e1[0]) {
                            e1Count++;
                            if (e1Count == 5) {
                                e1Count = teamScore[j][1];
                            }
                        } else if (teamScore[j][0] == e2[0]) {
                            e2Count++;
                            if (e2Count == 5) {
                                e2Count = teamScore[j][1];
                            }
                        }

                    }
                    return e1Count - e2Count;

                }
                return e1[1] - e2[1];
            });

            int resultTeam = 0;
            for (int j = 0; j < totalScore.length; j++) {
                if (totalScore[j][1] != 0) {
                    resultTeam = totalScore[j][0];
                    break;
                }
            }
            stringBuilder.append(resultTeam + "\n");

        }

        System.out.println(stringBuilder);
    }

}