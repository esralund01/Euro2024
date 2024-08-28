import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        MatchResultFileReader mrfr = new MatchResultFileReader("Euro2024QualifyingRound.csv");
        Statistics statistics = new Statistics("Euro2024QualifyingRound.csv");
        mrfr.readFile();

        System.out.println(mrfr.toString());

        System.out.println(statistics.getGoalScorers());
    }
}
