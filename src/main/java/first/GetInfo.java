package first;

import java.util.Scanner;

public class GetInfo {
    private int scoreFirst;
    private int scoreSecond;
    private int betFirst;
    private int betSecond;

    public void getInfo() {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        String s;
        System.out.println("please enter score of first team");

        while (n < 0) {
            s = scanner.nextLine();
            try {
                n = Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("enter integer");

            }
        }

        scoreFirst = n;
        System.out.println("please enter score of second team");
        n = -1;
        while (n < 0) {
            s = scanner.nextLine();
            try {
                n = Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("enter integer");

            }
        }
        scoreSecond = n;
        System.out.println("please enter bet of first team");
        n = -1;
        while (n < 0) {
            s = scanner.nextLine();
            try {
                n = Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("enter integer");

            }
        }
        betFirst = n;
        System.out.println("please enter bet of second team");
        n = -1;
        while (n < 0) {
            s = scanner.nextLine();
            try {
                n = Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("enter integer");

            }
        }
        betSecond = n;
    }

    public void setInfo(Score score, Bet bet, GetInfo getInfo) {
        score.setFirstTeam(getInfo.getScoreFirst());
        score.setSecondTeam(getInfo.getScoreSecond());
        bet.setFirstTeam(getInfo.getBetFirst());
        bet.setSecondTeam(getInfo.getBetSecond());
    }

    public int getScoreFirst() {
        return scoreFirst;
    }

    public int getScoreSecond() {
        return scoreSecond;
    }

    public int getBetFirst() {
        return betFirst;
    }

    public int getBetSecond() {
        return betSecond;
    }
}
