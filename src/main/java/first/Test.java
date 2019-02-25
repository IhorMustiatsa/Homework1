package first;

public class Test {
    public static void main(String[] args) {
        Score score= new Score();
        Bet bet = new Bet();
        GetInfo getInfo = new GetInfo();
        getInfo.getInfo();
        getInfo.setInfo(score, bet, getInfo);
        CheckResult checkResult = new CheckResult();
        System.out.println(checkResult.checkResult(score, bet));

    }
}
