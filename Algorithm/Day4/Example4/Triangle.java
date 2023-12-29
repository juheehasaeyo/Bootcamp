package Day4.Example4;

import java.util.Scanner;

public class Triangle {
    int width, height;
    public Triangle() {

    }
    public int getArea() {
        return width * height * 1/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" >>");
        Triangle t = new Triangle();
        t.width = sc.nextInt();
        t.height = sc.nextInt();
        System.out.println("삼각형의 넓이는 " + t.getArea());
    }
}
