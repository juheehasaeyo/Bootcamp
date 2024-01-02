package Day4;

import java.util.Scanner;

class Day {
    private String work;
    private int day;
    public Day(int day) {
        this.day = day;
    }
    public void set(String work) {
        this.work = work;
    }
    public String get() {
        return work;
    }
    public void show() {
        if (work == null) {
            System.out.println("없습니다.");
        } else System.out.println(day + "일의 할일은 " + work + "입니다.");
    }
}
public class MonthSchedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이번달 스케줄 관리 프로그램");
        Day[] days = new Day[30];
        while(true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
            int num = sc.nextInt();

            if (num == 1) {
                System.out.print("날짜(1~30)? ");
                int day = sc.nextInt();
                sc.nextLine(); // 개행 문자 제거
                System.out.print("할일(빈칸없이입력)? ");
                String work = sc.next();
                days[day-1] = new Day(day);
                days[day-1].set(work);
            } else if (num == 2) {
                System.out.print("날짜(1~30)? ");
                int day = sc.nextInt();
                sc.nextLine(); // 개행 문자 제거
                days[day-1].show();
            } else if (num == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else System.out.println("올바른 메뉴를 입력하시오");
            System.out.println();
        }
    }
}
