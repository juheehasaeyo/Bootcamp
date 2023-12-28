package Day3;
// Print sum(+)
import java.util.Scanner;

public class Example3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("정수 5개를 입력하시오");
        for(int i=0; i<5; i++) {
            int n = sc.nextInt();
            if(n < 0) {
                continue;
            } else {
                sum += n;
            }
        }
        System.out.println("양수의 합은 " + sum);
    }
}
