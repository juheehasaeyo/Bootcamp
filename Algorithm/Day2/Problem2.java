package Day2;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 사각형의 두 모서리 (xl1, yl1)과 (xr1, yr1)을 입력하시오 >>");
        System.out.println("두 번째 사각형의 두 모서리 (xl2, yl2)과 (xr2, yr2)을 입력하시오 >>");
        int xl1 = sc.nextInt();
        int yl1 = sc.nextInt();
        int xr1 = sc.nextInt();
        int yr1 = sc.nextInt();
        int xl2 = sc.nextInt();
        int yl2 = sc.nextInt();
        int xr2 = sc.nextInt();
        int yr2 = sc.nextInt();
        // 겹치는 영역의 넓이 계산
        int width = Math.min(xr1, xr2) - Math.max(xl1, xl2);
        int height = Math.min(yr1, yr2) - Math.max(yl1, yl2);

        // 겹치는 영역이 존재하면 넓이 출력, 없으면 0
        int overlapArea = (width > 0 && height > 0) ? width * height : 0;

        System.out.println("두 사각형이 겹치는 영역의 넓이는 "+ overlapArea + "입니다");
    }
}