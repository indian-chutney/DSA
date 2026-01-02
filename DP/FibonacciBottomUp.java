public class FibonacciBottomUp {
    public static int MAX_SAVE = 3;
    public static int[] fibB = new int[MAX_SAVE];

    public static int fib(int n){
        fibB[0] = 0;
        fibB[1] = 1;

        for(int i = 2; i <= n; i++){
            fibB[i % MAX_SAVE] = fibB[(i - 1) % MAX_SAVE] + fibB[(i - 2) % MAX_SAVE];
        }

        return fibB[n % MAX_SAVE];
    }

    public static void main(String argS[]){
        int n = 10;
        System.out.println("Fibonacci value of " + n + " is: " + fib(n));
    }
}
