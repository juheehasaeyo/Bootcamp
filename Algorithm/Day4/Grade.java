package Day4;

import java.util.Scanner;

public class Grade {
    int math;
    int sci;
    int eng;
    public Grade(int math, int sci, int eng) {
        this.math = math;
        this.sci = sci;
        this.eng = eng;
    }
    public int average() {
        return (math + sci + eng) / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
        int math = sc.nextInt();
        int sci = sc.nextInt();
        int eng = sc.nextInt();
        Grade me = new Grade(math, sci, eng);
        System.out.println("평균은 " + me.average() + " 입니다.");
    }

}
