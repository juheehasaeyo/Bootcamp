import java.util.Scanner;
// 13866 팀 나누기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int n1 = b - a;
        int n2 = d - c;
        System.out.println(n2 >= n1 ? n2-n1 : n1-n2);
    }
}