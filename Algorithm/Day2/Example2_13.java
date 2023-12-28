package Day2;

import java.util.Scanner;

public class Example2_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        int score = sc.nextInt();
        System.out.println("학년을 입력하세요");
        int grade = sc.nextInt();
        if(score >= 80) {
            if(grade == 4) {
                System.out.println("4학년 졸업 예정!");
            } else if(grade <=3 ) {
                System.out.println("4학년까지 화이팅!");
            }
        } else {
            System.out.println("졸업이 힘들 수 있습니다.");
        }
    }
}