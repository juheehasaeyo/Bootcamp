package Day9.Example7;

class GStack<T> {
    int tos;
    T[] stck;
    public GStack() {
        tos = 0;
        stck = (T[]) new Object[10];
    }
    public void push(T item) {
        if(tos == 10) {
            return;
        }
        stck[tos] = item;
        tos++;
    }
    public T pop() {
        if(tos == 0) {
            return null;
        }
        tos--;
        return stck[tos];
    }
}
public class MyStack {
    public static void main(String[] args) {
        GStack<String> stringGStack = new GStack<>();
        stringGStack.push("Seoul");
        stringGStack.push("Busan");
        stringGStack.push("USA");

        for(int i=0; i<3; i++) {
            System.out.println(stringGStack.pop());
        }
        GStack<Integer> intStack = new GStack<>();
        intStack.push(1);
        intStack.push(3);
        intStack.push(5);

        for(int i=0; i<3; i++) {
            System.out.println(intStack.pop());
        }
    }
}