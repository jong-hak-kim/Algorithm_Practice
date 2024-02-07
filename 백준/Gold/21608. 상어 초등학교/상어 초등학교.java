import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, sum;
    static int[] students, dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
    static int[][] map;
    static Map<Integer, Set<Integer>> preferences;

    // Seat 클래스에 x, y 좌표, 주변 좋아하는 학생 수, 주변 빈칸 수를 필드로 가지도록 한다.
    // 좋아하는 학생은 preferences 이름의 HashMap에 저장
    // 지정한 학생 위치는 map에 저장
    public static void main(String[] args) throws IOException {
        init();

        solution();

        printResult();
    }

    static void init() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        N = Integer.parseInt(bufferedReader.readLine());
        sum = 0;
        map = new int[N][N];
        students = new int[N * N];
        preferences = new HashMap<>();
        for (int i = 0; i < N * N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int student = Integer.parseInt(stringTokenizer.nextToken());
            students[i] = student;
            preferences.put(student, new HashSet<>());
            for (int j = 0; j < 4; j++) {
                preferences.get(student).add(Integer.parseInt(stringTokenizer.nextToken()));
            }
        }
    }

    static void solution() {
        for (int i = 0; i < students.length; i++) {
            Seat seat = findSeat(students[i]);
            map[seat.x][seat.y] = students[i];
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int count = getStudentSum(i, j, map[i][j]);
                if (count > 0) {
                    sum += (int) Math.pow(10, count - 1);
                }
            }
        }
    }

    static void printResult() {
        System.out.println(sum);
    }

    static Seat findSeat(int student) {
        Seat seat = null;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] > 0) {
                    continue;
                }

                Seat cur = new Seat(i, j, getStudentSum(i, j, student), getEmptySum(i, j));

                if (seat == null) {
                    seat = cur;
                    continue;
                }

                if (seat.compareTo(cur) > 0) {
                    seat = cur;
                }
            }
        }
        return seat;
    }

    static int getStudentSum(int x, int y, int student) {
        int count = 0;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
                continue;
            }

            if (preferences.get(student).contains(map[nx][ny])) {
                count++;
            }
        }
        return count;
    }

    static int getEmptySum(int x, int y) {
        int count = 0;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
                continue;
            }

            if (map[nx][ny] == 0) {
                count++;
            }
        }
        return count;
    }

    static class Seat implements Comparable<Seat> {
        int x, y, studentSum, emptySum;

        public Seat(int x, int y, int studentSum, int emptySum) {
            this.x = x;
            this.y = y;
            this.studentSum = studentSum;
            this.emptySum = emptySum;
        }

        @Override
        public int compareTo(Seat other) {
            if (studentSum != other.studentSum) {
                return -(studentSum - other.studentSum);
            }

            if (emptySum != other.emptySum) {
                return -(emptySum - other.emptySum);
            }

            if (x != other.x) {
                return x - other.x;
            }
            return y - other.y;
        }
    }
}