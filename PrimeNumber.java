import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num, i, count = 0;
        num = sc.nextInt();
        for(i=2; i<num; i++){
            if(num%1 == 0){
                count++;
                break;
            }
        }
        if(count == 0)
            System.out.println("It is prime number");
        else
            System.out.println("it is not prime number");
    }

}
