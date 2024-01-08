package Day9;

import java.util.HashMap;
import java.util.Scanner;

class Student {
    String name;
    double score;
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }
}
public class ScholarshipStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Student> map = new HashMap<>();
        for (int i=0; i<5; i++) {
            System.out.print("이름과 학점 >> ");
            String name = sc.next();
            double score = sc.nextDouble();
            map.put(name, new Student(name, score));
        }
        System.out.print("장학생 선발 학점 기준 입력: ");
        double standard = sc.nextDouble();
        System.out.print("장학생 명단: ");
        for(Student student: map.values()) {
            if (standard <= student.score) {
                System.out.print(student.name + " ");
            }
        }
        System.out.println("가(이) 고득점");
    }
}
