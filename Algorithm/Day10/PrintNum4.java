package Day10;

import java.util.Scanner;

public class PrintNum4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("202111569 조주희");

        while (true) {
            System.out.print("입력>> ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            else {
                int[] random = new int[n];
                for(int i=0; i<n; i++) {
                    random[i] = (int) (Math.random() * n);
                    System.out.print(random[i] + " ");

                }
                System.out.println();
                int[] cnt = new int[n];
                for(int i=0; i<n; i++) {
                    // 랜덤 숫자의 발생 빈도 계산
                    cnt[random[i]]++;
                }
                for(int i=0; i<n; i++) {
                    System.out.print(i + "(" + cnt[i] + ") ");
                }
                System.out.println();
            }
        }
    }
}