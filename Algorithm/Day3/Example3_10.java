package Day3;
// 2arr
public class Example3_10 {
    public static void main(String[] args) {
        double[][] score = { {3.5, 3.8}, // 1학년 1,2학기
                            {2.4, 3.3}, // 2-1,2
                            {3.3, 3.6}, // 3-1,2
                            {3.8, 4.1} }; // 4-1,2
        double sum = 0;
        for(int i=0; i< score.length; i++) {
            for(int j=0; j<score[i].length; j++) {
                sum += score[i][j];
            }
        }
        int n = score.length;
        int m = score[0].length;
        System.out.println("4년 전체 평점 평균은 " + sum/(n*m));
    }
}
