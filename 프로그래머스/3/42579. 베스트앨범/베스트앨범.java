// 노래 재생이 많이 된 장르 계산
// 장르 내에서 가장 많이 재생된 노래 2곡 나열
    // 재생 횟수 같으면 인덱스 낮은 노래 먼저 수록

// 해쉬맵<장르, 재생 수> genreCount
// 해쉬맵<장르, 배열[인덱스, 재생 수]> songs
// 장르별 재생 수를 계산한 genreCount 해쉬맵을 내림차순 정렬한다.
// 많은 재생 수 장르 순서대로 꺼내어 songs 해쉬맵을 내림차순으로 정렬하여 각 장르별 최대 2곡 answer에 저장
    //이렇게 하면 재생 수 많은 장르에 있는 노래 우선으로 저장된다.
    //순서가 있게 정렬을 하게 되면 같은 노래들은 기존 순서대로 따라가게 되는 stable sort를 하게 된다.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;


class Solution {
    public int[] solution(String[] genres, int[] plays) {
 HashMap<String, Integer> genreCount = new HashMap<>();
        HashMap<String, ArrayList<int[]>> songs = new HashMap<>();

        // 장르별 재생횟수 많은 순 계산
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            if (!genreCount.containsKey(genre)) {
                genreCount.put(genre, 0);
                songs.put(genre, new ArrayList<>());
            }

            genreCount.put(genre, genreCount.get(genre) + play);
            songs.get(genre).add(new int[]{i, play});
        }

        List<Integer> answer = new ArrayList<>();

        List<String> keySet = new ArrayList<>(genreCount.keySet());

        keySet.sort((o1, o2) -> genreCount.get(o2).compareTo(genreCount.get(o1)));

        for (String key : keySet) {
            songs.get(key).sort((o1, o2) -> o2[1] - o1[1]);
            if (songs.get(key).size() > 1) {
                for (int i = 0; i < 2; i++) {
                    answer.add(songs.get(key).get(i)[0]);
                }
            } else {
                answer.add(songs.get(key).get(0)[0]);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}