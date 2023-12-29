package Day4;

import java.util.Scanner;

class Day {
    private String work;
    public void set(String work) {
        this.work = work;
    }
    public String get() {
        return work;
    }
    public void show() {
        if (work == null) {
            System.out.println("없습니다.");
        } else System.out.println(work + "입니다.");
    }
}
public class MonthSchedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이번달 스케줄 관리 프로그램");

        System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
        int num = sc.nextInt();
        System.out.println("날짜(1~30)? ");
        int day = sc.nextInt();
        System.out.println("할일(빈칸없이입력)? ");
        String work = sc.next();

    }
}
