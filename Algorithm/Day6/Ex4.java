package Day6;

class Point2 {
    private int x, y;
    public Point2() {

    }
    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
class PositivePoint extends Point2 {
    public PositivePoint() {

    }
    public PositivePoint(int x, int y) {
        super(x, y);
        super.move(x, y);
    }
    public String toString() {
        return "(" + getX() + "," + getY() + ")의 점";
    }
}
public class Ex4 {
    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");
        p.move(-5, 5);
        System.out.println(p.toString() + "입니다.");
        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");
    }
}
