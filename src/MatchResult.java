import java.util.List;

public class MatchResult {
    private String teams;
    private List<String> goalScorers;

    public MatchResult(String teams, List<String> goalScorers) {
        this.goalScorers = goalScorers;
        this.teams = teams;
    }

    public List<String> getGoalScorers() {
        return goalScorers;
    }

    public String getTeams() {
        return teams;
    }

    @Override
    public String toString(){
        return "GoalScorer: " + goalScorers;
    }
}
