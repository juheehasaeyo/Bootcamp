package Day4;

import java.util.Scanner;

class Phone {
    String name;
    String tel;
    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    static void search(String[] name, String[] tel) {
        if(name.equals(name)) {
            System.out.println(name + " 의 전화번호는 " + tel);
        } else System.out.println(name + " 이 없습니다.");
    }
}
public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Phone[] p = new Phone[n];

    }
}
