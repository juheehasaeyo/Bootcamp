package Day3;
// Print gugudan
public class Example3_4 {
    public static void main(String[] args) {
        for(int i=1; i<10; i++) {
            for(int j=1; j<10; j++) {
                System.out.print(i + "*" + j + "=" + i*j);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
