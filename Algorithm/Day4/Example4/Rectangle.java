package Day4.Example4;

import java.util.Scanner;

public class Rectangle {
    int width;
    int height;
    public int getArea() {
        return width * height;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" >>");
        Rectangle r = new Rectangle();
        r.width = sc.nextInt();
        r.height = sc.nextInt();
        System.out.println("사각형의 면적은 " + r.getArea());
    }
}
