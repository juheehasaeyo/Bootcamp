package Day9.Example7;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
    static void printList(LinkedList<String> I) {
        Iterator<String> iterator = I.iterator();
        String e, seperator;
        while (iterator.hasNext()) {
            e = iterator.next();
            if(iterator.hasNext()) {
                seperator = "-> ";
            } else {
                seperator = "\n";
                System.out.print(e + seperator);;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("트랜스포머");
        myList.add("스타워즈");
        myList.add(0, "아바타");
        myList.add(2, "터미네이터");

        Collections.sort(myList);
        printList(myList);
        // 요소의 순서를 반대로
        Collections.reverse(myList);
        printList(myList);
        int index = Collections.binarySearch(myList, "아바타");
        System.out.println("아바타는 " + index + "번째 요소입니다.");

    }
}