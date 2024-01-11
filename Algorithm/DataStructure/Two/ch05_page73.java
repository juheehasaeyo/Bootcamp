package DataStructure.Two;

public class ch05_page73 {
    public static void main(String[] args) {
        Linked2List<Integer> list = new Linked2List<>();
        list.add(0, 300); // 오토박싱으로 300은 Integer(300)으로 취급해준다
        list.add(0, 100);
        list.append(500);
        list.remove(2);
        list.append(700);
        list.remove(1);
        list.print();

        Linked2List<String> list2 = new Linked2List<>();
        list2.add(0, "Test String 1");
        list2.add(0, "Lion in oil");
        list2.append("appended");
        list2.remove(2);
        list2.print();
    }
}