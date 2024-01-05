package Day8;

import java.util.HashMap;
import java.util.Scanner;

class Search {
    String country;
    int num;
    public Search(String country, int num) {
        this.country = country;
        this.num = num;
    }
}
public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Search> map = new HashMap<>();
        System.out.println("나라 이름과 인구를 입력하세요. (예: Korea 5000)");

        while (true) {
            System.out.print("나라 이름, 인구 >> ");
            String name = sc.next();
            if(name.equals("그만")) {
                break;
            }
            int population = sc.nextInt();
            map.put(name, new Search(name, population));
        }
        while (true) {
            System.out.print("인구 검색 >> ");
            String name = sc.next();
            if(name.equals("그만")) {
                break;
            }
            Search search = map.get(name);
            if(search == null) {
                System.out.println(name + " 나라는 없습니다.");
            } else System.out.println(search.country + "의 인구는 " + search.num);
        }
    }
}
