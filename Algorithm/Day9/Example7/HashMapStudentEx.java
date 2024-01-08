package Day9.Example7;

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
        map.put("황기태", new Student(1, "010-111-1111"));
        map.put("이내민", new Student(2, "010-222-2222"));
        map.put("지은탁", new Student(3, "010-333-3333"));
        while (true) {
            System.out.print("검색할 이름은? ");
            String name = sc.next();
            if(name.equals("exit")) {
                System.out.println("검색을 종료합니다.");
                break;
            }
            Student student = map.get(name);
            if(student == null) {
                System.out.println(name + "은(는) 없는 사람입니다.");
            } else System.out.println("id: " + student.id + ", 전화: " + student.tel);
        }
    }
}