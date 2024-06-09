// 노래 재생이 많이 된 장르
// 장르 내에서 가장 많이 재생된 노래 나열
    // 재생 횟수 같으면 인덱스 낮은 노래 먼저 수록

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

        Stream<Map.Entry<String, Integer>> sortedGenre = genreCount.entrySet().stream()
                .sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));

        sortedGenre.forEach(entry -> {
            Stream<int[]> sortedSongs = songs.get(entry.getKey()).stream().sorted((o1, o2) -> Integer.compare(o2[1], o1[1]))
                    .limit(2);
            sortedSongs.forEach(song -> answer.add(song[0]));
        });


        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}