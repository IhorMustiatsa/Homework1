package first;

public class CheckResult {

    int checkResult (Score score, Bet bet) {
        return (score.getFirstTeam() == bet.getFirstTeam()) && (score.getSecondTeam() == bet.getSecondTeam()) ? 2 :
                (((score.getFirstTeam() > score.getSecondTeam()) && bet.getFirstTeam() > bet.getSecondTeam()) ||
                ((score.getFirstTeam() < score.getSecondTeam()) && bet.getFirstTeam() < bet.getSecondTeam()) ? 1 : 0);
    }
}
