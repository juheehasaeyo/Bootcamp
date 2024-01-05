package Day8;

import java.util.Scanner;
import java.util.Vector;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        System.out.println("정수(-1이 입력될 때까지) >> ");
        while (true) {
            int n = sc.nextInt();
            if(n == -1) {
                break;
            }
            Vector<Integer> v = new Vector<>();
            v.add(n);
            for(int i=0; i<v.size(); i++) {
                int temp = n;
                if(temp > max) {
                    max = temp;
                }
            }
        }
        System.out.println("가장 큰 수는 " + max);
    }
}