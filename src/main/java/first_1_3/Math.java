package first_1_3;

public class Math {
    public int square (int n){
        return n*n;
    }
    public int cub (int n){
        return n*n*n;
    }
    public int exponent (int n, int exponent){
        int a = n;
        for (int k = 0; k< exponent-1; k++){
            a=a*n;
        }
       return a;
    }
}
