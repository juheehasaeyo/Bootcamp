package Day3;

import java.util.Scanner;

public class Example3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("가장 큰 수는 " + max);
    }
}
