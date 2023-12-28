package Day3;
// use ForEach
public class Example3_9 {
    enum Week {월, 화, 수, 목, 금, 토, 일}
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        int sum = 0;
        // for-each에서 k는 n[0], n[1], ..., n[4]로 반복
        for(int k : n) {
            System.out.print(k + " ");
            sum += k;
        }
        System.out.println("합은 " + sum);
        String[] fruit = {"사과", "배", "오렌지", "바나나", "딸기"};
        for(String f : fruit) {
            System.out.print(f + " ");
        }
        System.out.println();
        for(Week day : Week.values()) {
            System.out.print(day + "요일 ");
        }
        System.out.println();
    }
}
