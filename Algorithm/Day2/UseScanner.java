package Day2;
import java.util.Scanner;

public class UseScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String city = sc.next();
        int age = sc.nextInt();
        double weight = sc.nextDouble();
        boolean alone = sc.nextBoolean();
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 입력하시오");
        System.out.println("이름은 "+ name + ", 도시는 "+ city + ", "
                + "나이는 "+ age + ", 체중은 "+ weight + ", 독신여부는"+ alone + "입니다.");
    }

}