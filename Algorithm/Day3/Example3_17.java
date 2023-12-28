package Day3;

import java.util.InputMismatchException;
import java.util.Scanner;

// Use try-catch InputMismatchException
public class Example3_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요");
        int n = 0, sum = 0;
        for(int i=0; i<3; i++) {
            try {
                n = sc.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요");
                sc.next(); // 입력 스트림 비우기
                i--; // 인덱스가 증가하지 않도록
                continue; // 다음 루프
            }
            sum += n;
        }
        System.out.println("합은 " + sum);
    }
}
