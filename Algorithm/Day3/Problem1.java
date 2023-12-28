package Day3;

import java.util.Scanner;
/*
소문자 알파벳 하나를 입력하시오 >> e
        abcde
        abcd
        abc
        ab
        a
*/
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
        String str = sc.next();
        char ch = str.charAt(0); // 문자열의 첫 번째 문자를 ch에 저장
        for (char ch2 = 'a'; ch2 <= ch; ch2++) {
            for (char printChar = ch2; printChar <= ch; printChar++) {
                System.out.print(printChar);
            }
            System.out.println();
        }
    }
}