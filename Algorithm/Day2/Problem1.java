package Day2;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수로 된 돈 액수를 입력하세요: ");
        int money = sc.nextInt();

        int fiftyThousandWon = money / 50000;
        money %= 50000;

        int tenThousandWon = money / 10000;
        money %= 10000;

        int ThousandWon = money / 1000;
        money %= 1000;

        int oneHundredWon = money / 100;
        money %= 100;

        int fiftyWon = money / 50;
        money %= 50;

        int tenWon = money / 10;
        money %= 10;

        int oneWon = money;

        System.out.println("오만원권: " + fiftyThousandWon + "매");
        System.out.println("만원권: " + tenThousandWon + "매");
        System.out.println("천원권: " + ThousandWon + "매");
        System.out.println("100원 동전: " + oneHundredWon + "개");
        System.out.println("50원 동전: " + fiftyWon + "개");
        System.out.println("10원 동전: " + tenWon + "개");
        System.out.println("1원 동전: " + oneWon + "개");
    }
}