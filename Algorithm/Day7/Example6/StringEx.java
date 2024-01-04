package Day7.Example6;

public class StringEx {
    public static void main(String[] args) {
        String a = new String((" C#"));
        String b = new String((", C++ "));

        System.out.println(a + "의 길이는 " + a.length());
        System.out.println(a.contains("#")); // 문자열 포함되어있으면 true, 아니면 false

        a = a.concat(b); // 문자열 연결
        System.out.println(a);

        a = a.trim(); // 문자열 앞 뒤 공백 제거
        System.out.println(a);

        a = a.replace("C#" , "Java"); // 문자열 대치
        System.out.println(a);

        String[] s = a.split(",");
        for(int i=0; i<s.length; i++) {
            System.out.println("분리된 문자열" + i + ": " + s[i]);
        }
        a = a.substring(5); // 인덱스 5부터 끝까지 substring 리턴
        System.out.println(a);

        char c = a.charAt(2); // 인덱스 2의 문자 리턴
        System.out.println(c);
    }
}
