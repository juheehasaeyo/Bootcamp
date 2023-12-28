package Day3;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 몇 개?");
        int n = sc.nextInt();
        int[] random = new int[n];
        for(int i=0; i<n; i++) {
            // 1~100까지의 랜덤 숫자 생성
            random[i] = (int) (Math.random()*100 + 1);
            System.out.print(random[i] + " ");
        }
    }
}
