package Day4.Example4;

public class Circle2 {
    int radius;
    public Circle2(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * 3.14;
    }
    public static void main(String[] args) {
        Circle2[] c2 = new Circle2[5];
        for(int i=1; i<c2.length; i++) {
            c2[i] = new Circle2(i);
            System.out.println(c2[i].getArea());
        }
    }
}
