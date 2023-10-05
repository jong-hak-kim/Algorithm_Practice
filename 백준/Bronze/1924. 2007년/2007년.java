import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        String[] weeks = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
        int x = Integer.parseInt(stringTokenizer.nextToken());
        int y = Integer.parseInt(stringTokenizer.nextToken());
        LocalDate date = LocalDate.of(2007, x, y);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfWeekNumber = dayOfWeek.getValue();
        System.out.println(weeks[dayOfWeekNumber - 1]);

    }
}