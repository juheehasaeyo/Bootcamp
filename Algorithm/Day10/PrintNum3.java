package Day10;

import java.util.Scanner;

public class PrintNum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("202111569 조주희");
        while (true) {
            System.out.print("입력>> ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            } else {
                int[] random = new int[n];
                for(int i=0; i<n; i++) {
                    // 랜덤 숫자 생성
                    random[i] = (int) (Math.random() * n);
                    System.out.print(random[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
