import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int term1 = 0,term2 = 1;
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series upto "+ n +":");
        while(term1 <= n){
            System.out.println(term1+"");
            int sum = term1 + term2;
            term1 = term2;
            term2 = sum;
        }
    }
}
