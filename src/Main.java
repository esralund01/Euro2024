import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Statistics statistics = new Statistics("Euro2024QualifyingRound.csv");
        MatchResultFileReader mrfr = new MatchResultFileReader("Euro2024QualifyingRound.csv");

        System.out.println(mrfr.toString());
    }
}
