package Day7;

import java.util.Scanner;
// 텍스트를 입력받아 알파벳에 대한 히스토그램 만들기
// 대소문자는 같게 처리, 한 줄씩 읽어서 처리, 세미콜론은 입력 종료
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26]; // 알파벳 배열
        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
        while (true) {
            String str = sc.nextLine();
            if(str.equals(";")) {
                break;
            }
            // 모든 str을 소문자로 변경한 후 로직
            str = str.toLowerCase();
            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                // 주어진 문자 ch가 알파벳인지의 여부를 판별
                if (Character.isLetter(ch)) {
                    int n = ch - 'a';
                    arr[n]++;
                }
            }
        }
        System.out.println("히스토그램을 그립니다.");
        for(char ch='A'; ch<='Z'; ch++) {
            int n = ch - 'A';
            System.out.print(ch);
            for(int i=0; i<arr[n]; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}