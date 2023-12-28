package Day2;

import java.util.Scanner;

public class Example2_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 0;
        System.out.println("어떤 과일 드릴까요?");
        String fruit = sc.next();
        switch (fruit) {
            case "mango":
                price = 1500;
                break;
            case "apple":
            case "banana":
                price = 500;
                break;
            case "orange":
                price = 100;
                break;
            default:
                System.out.println("메뉴에 없습니다.");
        }
        if (price != 0) {
            System.out.println(fruit + "는 " + price + "원입니다.");
        }
    }
}
