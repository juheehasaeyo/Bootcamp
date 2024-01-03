package Day6;

import java.util.HashMap;
import java.util.Map;

abstract class PairMap {
    protected String KeyArray[]; // key 들을 저장하는 배열
    protected String valueArray[]; // value 들을 저장하는 배열
    abstract String get(String key); // key 값을 가진 value 리턴, 없으면 null 리턴
    abstract void put(String key, String value); // key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정
    abstract String delete(String key); // key 값을 가진 아이템 (value와 함께) 삭제, 삭제된 value 값 리턴
    abstract int length(); // 현재 저장된 아이템의 개수 리턴
}
class Dictionary extends PairMap {
    private Map<String, String> map;
    public Dictionary() {
        map = new HashMap<>();
    }
    public String get(String key) {
        return map.get(key);
    }
    public void put(String key, String value) {
        map.put(key, value);
    }
    public String delete(String key) {
        return map.remove(key);
    }
    public int length() {
        return map.size();
    }
}
public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary();
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정
        System.out.println("이재문의 값은 "+dic.get("이재문"));
        System.out.println("황기태의 값은 "+dic.get("황기태"));
        dic.delete("황기태"); // 황기태 아이템 삭제
        System.out.println("황기태의 값은 "+dic.get("황기태")); //삭제된 아이템 접근
    }
}
