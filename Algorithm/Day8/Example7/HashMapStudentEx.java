package Day8.Example7;

import java.util.HashMap;
import java.util.Scanner;

class Student {
    int id;
    String tel;
    public Student(int id, String tel) {
        this.id = id;
        this.tel = tel;
    }
}
public class HashMapStudentEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Student> map = new HashMap<>();
        //3명의 학생 저장
        map.put("황기태", new Student(1, "010-111-1111"));
        map.put("이재문", new Student(2, "010-222-2222"));
        map.put("김나연", new Student(3, "010-333-3333"));

        while (true) {
            System.out.print("검색할 이름? ");
            String name = sc.next();
            if(name.equals("exit")) {
                break;
            }
            Student student = map.get(name);
            if(student == null) {
                System.out.println(name + "은 없는 사람입니다.");
            } else System.out.println("id: " + student.id + ", 전화: " + student.tel);
        }
    }
}
