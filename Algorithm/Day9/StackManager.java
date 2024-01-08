package Day9;

interface IStack<T> {
    T pop();
    boolean push(T ob);
}
class MyStack<T> implements IStack<T> {


}
public class StackManager {
    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack();
        for(int i=0; i<10; i++) {
            stack.push(i);
        }
        while (true) {
            Integer n = stack.pop();
            if(n == null) {
                break;
            }
            System.out.print(n + " ");
        }
    }
}
