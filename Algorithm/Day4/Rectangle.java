package Day4;

public class Rectangle {
    int x, y, width, height;
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public int square() {
        return width * height;
    }
    void show() {
        System.out.println("("+x+", "+y+")에서 크기가 "+width+"x"+height+"인 사각형");
    }
    Boolean contains(Rectangle r) {
        return true;
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);
        r.show();
        System.out.println("s의 면적은 " + s.square());
        if (t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if (t.contains(s)) System.out.println("t는 s을 포함합니다.");
    }
}
