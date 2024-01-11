package DataStructure.One;

import DataStructure.One.ArrayList;

public class ch05_page32 {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(0, 300); // 오토박싱으로 300은 Integer(300)으로 취급해준다
            list.add(0, 100);
            list.append(500);
            list.remove(2);
            list.append(700);
            list.remove(1);
            list.print();
        }
    }