package Day8.Example7;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> dic = new HashMap<>();
        // 3개의 (key, value)값을 dic에 저장
        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");
        // 영어 단어를 입력받고 한글 단어 검색
        while (true) {
            System.out.print("찾고 싶은 단어는? ");
            String eng = sc.next();
            if(eng.equals("exit")) {
                System.out.println("종료");
                break;
            }
            // 해시맵에서 "키" eng의 "값" kor 검색
            String kor = dic.get(eng);
            if(kor == null) {
                System.out.println(eng + "는 없는 단어입니다.");
            } else System.out.println(kor);
        }
        sc.close();
    }
}
