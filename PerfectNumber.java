import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= num /2){
            if(num% i == 0){
                sum += i;
            }
            i++;
        }
        if(sum == num){
            System.out.println("it is perfect number");
        } else{
            System.out.println("it is not perfect number");

        }
    }
}
