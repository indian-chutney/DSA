import java.util.Arrays;

public class FibonacciDynamic {
    public static int MAX = 100;
    public static int[] dp = new int[MAX];
    
    public static int fibDynamic(int n){
        if(dp[n] != -1) return dp[n];
        if(n == 0)  return 0;
        if(n == 1)  return 1;

        dp[n] = fibDynamic(n - 1) + fibDynamic(n - 2);

        return dp[n];
    }

    public static void main(String argS[]){
        Arrays.fill(dp, -1);

        int inp = 10;
        
        System.out.println("Fibonacci of "+ inp + " is: " + fibDynamic(inp));
    }
}
