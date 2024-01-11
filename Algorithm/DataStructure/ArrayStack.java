package DataStructure;

public class ArrayStack<E> implements StackInterface<E> {
    private E[] stack;
    private int topIndex;
    private static final int DEFAULT_CAPACITY = 64;
    private final E ERROR = null;
    public ArrayStack() {
        stack = (E[]) new Object[DEFAULT_CAPACITY];
        // stack = new E[DEFAULT_CAPACITY];
        topIndex = -1;
    }
    public ArrayStack(int n) {
        stack = (E[]) new Object[n];
        // stack = new E[n];
        topIndex = -1;
    }
    public void push(E newItem) {
        if (isFull()) { /* 에러 처리 */}
        else stack[++topIndex] = newItem;
    }
    public E pop() {
        if (isEmpty()) return ERROR;
        else return stack[topIndex--];
    }
    public E top() {
        if (isEmpty()) return ERROR;
        else return stack[topIndex];
    }
    public boolean isEmpty() {
        return (topIndex < 0);
    }
    public boolean isFull() {
        return (topIndex == stack.length-1);
    }
    public void popAll() {
        stack = (E[]) new Object[stack.length];
        topIndex = -1;
    }
    private void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= topIndex; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ArrayStack<Integer> s = new ArrayStack<>(10);
        s.push(300);
        s.push(200);
        s.push(100);
        s.pop();
        s.print();
    }
}
