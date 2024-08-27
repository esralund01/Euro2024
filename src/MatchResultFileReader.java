import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MatchResultFileReader {
    private Scanner scanner;
    List<MatchResult> matchResultList = new ArrayList<>();

    public MatchResultFileReader(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        scanner = new Scanner(file);
    }

    public List<MatchResult> readFile() {
        String csvMatchResult;
        String[] tokens;
        String delimiterMatch = ";";
        String delimiterGoalScorer = ",";
        List<String> goalScorerList = new ArrayList<>();


        while (scanner.hasNextLine()) {
            csvMatchResult = scanner.nextLine();
            tokens = csvMatchResult.split(delimiterMatch);
            String teams = tokens[0];

            goalScorerList = new ArrayList<>();
            if (tokens.length > 1) {
                String[] goalScorers = tokens[1].split(delimiterGoalScorer);
                goalScorerList = Arrays.asList(goalScorers);

            }

            matchResultList.add(new MatchResult(teams, goalScorerList));

        }
        return matchResultList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(MatchResult matchResult : matchResultList){
            result.append(matchResult.toString()).append("\n");
        }
        return result.toString();

    }

}
