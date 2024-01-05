package Day8.Example6;

public class MathEx {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        double a = 3.14;
        System.out.println(Math.ceil(a)); // 올림
        System.out.println(Math.floor(a)); // 내림
        System.out.println(Math.sqrt(9)); // 제곱근
        System.out.println(Math.exp(2)); // e의 2승
        System.out.println(Math.round(3.14));

        System.out.print("이번주 행운의 번호는 ");
        for(int i=0; i<5; i++) {
            System.out.print((int)(Math.random()*45 + 1) + " ");
        }
    }
}