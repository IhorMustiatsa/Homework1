package first_1_4;

public class Factorial {
    public int factorial (int f){
        int result = 1;
        for (int n = 1; n <=f; n ++){
            result = result*n;
        }
        return result;
    }
}
