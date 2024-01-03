package Day6.Example5;

class A {
    public A() {
        System.out.println("A"); }
    public A(int x) {
        System.out.println("A: " + x); }
}
class B extends A {
    public B() {
        super(100); }
    public B(int x) {
        System.out.println("B: " + x); }
}
public class Example {
    public static void main(String[] args) {
        B b1 = new B( );
        B b2 = new B(11);
    }
}
