package Day8.Example7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<String>();
        for(int i=0; i<4; i++) {
            System.out.print("이름을 입력하세요 >> ");
            String str = sc.next();
            al.add(str);
        }
        // ArrayList에 들어 있는 모든 이름 출력
        for(int i=0; i<al.size(); i++) {
            String name = al.get(i);
            System.out.print(name +" ");
        }
        int longestname = 0;
        for(int i=1; i<al.size(); i++) {
            if(al.get(longestname).length() < al.get(i).length()) {
                longestname = i;
            }
        }
        System.out.println("\n가장 긴 이름은 : " + al.get(longestname));
    }
}
