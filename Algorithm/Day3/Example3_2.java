package Day3;

import java.util.Scanner;

public class Example3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, cnt = 0;
        while (true) {
            int n = sc.nextInt();
            if(n == -1) {
                break;
            }
            sum += n;
            cnt++;
        }
        System.out.println(sum/cnt);
    }
}