import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Statistics {

    private List<MatchResult> matchResults;

    public Statistics(String filename) throws FileNotFoundException {

    }

    public Set<String> getGoalScorers() {
        Set<String> goalScorers = new HashSet<>();
        return goalScorers;
    }

    public Map<String, Integer> getGoalScorersWithTotals() {


        return null;
    }

    public int getNumberOfGoals(String goalScorer) {
        int numberOfGoals = 0;
        for (MatchResult matchResult : matchResults) {
            for(String scorer : matchResult.getGoalScorers()){
                if(scorer.equalsIgnoreCase(goalScorer)){
                    numberOfGoals++;
                }
            }
        }
        return numberOfGoals;

    }
}
