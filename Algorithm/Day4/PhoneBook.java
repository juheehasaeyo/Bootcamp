package Day4;

import java.util.Scanner;

class Phone {
    private String name;
    private String tel;
    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    static void search(Phone[] p, String searchName) {
        boolean found = false;
        for (Phone person : p) {
            if (person.name.equals(searchName)) {
                System.out.println(person.name + "의 전화번호는 " + person.tel + " 입니다.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(searchName + "이 없습니다.");
        }
    }
}
public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수 >> ");
        int n = sc.nextInt(); // 인원수
        sc.nextLine();

        Phone[] p = new Phone[n];

        System.out.println("이름과 전화번호 입력 >>");
        for(int i=0; i<n; i++) {
            String name = sc.next();
            String tel = sc.next();
            sc.nextLine();
            p[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다.");
        while (true) {
            System.out.print("검색할 이름 >> ");
            String searchName = sc.next();
            if(searchName.equals("그만")) {
                break;
            }
            Phone.search(p, searchName);
        }
        System.out.println("프로그램 종료.");
    }
}
