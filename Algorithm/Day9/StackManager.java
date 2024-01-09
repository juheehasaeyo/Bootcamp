package Day9;

import java.util.Vector;

interface IStack<T> {
    T pop();
    boolean push(T ob);
}
class MyStack<T> implements IStack<T> {
    Vector<T> stack;
    public MyStack() {
        stack = new Vector<>();
    }
    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    @Override
    public boolean push(T ob) {
        return stack.add(ob);
    }
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