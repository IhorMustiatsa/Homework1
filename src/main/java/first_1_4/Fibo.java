package first_1_4;

public class Fibo {
    private int first = 1;
    private int second = 1;
    private int next;

    public void fibo(int n) {
        System.out.print(first + " " + second + " ");
        for (int i = 3; i <= n; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        System.out.println();
    }
}
