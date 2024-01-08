package Day9.Example7;

public class GenericMethodExample {
    // T가 타입 매개 변수인 제네릭 메소드
    public static <T> GStack<T> reverse(GStack<T> a) {
        GStack<T> s = new GStack<>();
        while (true) {
            T tmp;
            tmp = a.pop(); // 원래 스택에서 요소 하나를 꺼냄
            if(tmp == null) { // 스택이 비었으면 break;
                break;
            } else s.push(tmp);
        }
        return s;
    }
    public static void main(String[] args) {
        GStack<Double> gs = new GStack<>();
        for(int i=0; i<5; i++) {
            gs.push(Double.valueOf(i));
        }
        gs = reverse(gs);
        for(int i=0; i<5; i++) {
            System.out.println(gs.pop());
        }
    }
}