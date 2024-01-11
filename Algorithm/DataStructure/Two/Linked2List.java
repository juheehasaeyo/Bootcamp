package DataStructure.Two;

public class Linked2List<E> implements ListInterface2<E> {
    private Node<E> head;
    private int numItems;
    public Linked2List() {
        numItems = 0;
        head = new Node<>(null, null);
    }
    public void add(int index, E x) {
        if(index >= 0 && index <= numItems) {
            Node<E> prevNode = getNode(index-1);
            Node<E> newNode = new Node<>(x, prevNode.next);
            prevNode.next = newNode;
            numItems++;
        } else System.out.println("에러");
    }
    public void append(E x) {
        Node<E> prevNode = head; // 더미 헤드
        while (prevNode.next != null)
            prevNode = prevNode.next;
        Node<E> newNode = new Node<>(x, null);
        prevNode.next = newNode;
        numItems++;
    }
    public E remove(int index) {
        if (index >= 0 && index <= numItems-1) {
            Node<E> prevNode = getNode(index - 1);
            Node<E> currNode = prevNode.next;
            prevNode.next = currNode.next;
            numItems--;
            return currNode.item;
        } else return null; // 에러
    }
    public boolean removeItem(E x) {
        Node<E> currNode = head; // dummy node
        for(int i = 0; i <= numItems-1; i++) {
            Node<E> prevNode = currNode;
            currNode = prevNode.next;
            if (((Comparable) (currNode.item)).compareTo(x) == 0) {
                prevNode.next = currNode.next;
                numItems--;
                return true;
            }
        } return false;
    }
    public E get(int index) { // 첫번째 원소를 0번째 원소로 표기
        if (index >= 0 && index <= numItems-1) {
            return getNode(index).item;
        }
        else return null; // 에러
    }
    public void set(int index, E x) {
        if (index >= 0 && index <= numItems-1)
            getNode(index).item = x;
        else { /* 에러 처리*/ }
    }
    private Node<E> getNode(int index) { // 첫번째 노드를 0번째 노드로 표기
        if (index >= -1 && index <= numItems-1) {
            Node<E> currNode = head; // dummy head
            for(int i = 0; i <= index; i++)
                currNode = currNode.next;
            return currNode;
        } else return null; // 에러//
    }
    private final int NOT_FOUND = -1;
    public int indexOf(E x) { // return item x's index
        Node<E> currNode = head; // 더미 헤드
        for (int i = 0; i <= numItems-1; i++) {
            currNode = currNode.next;
            if (((Comparable)(currNode.item)).compareTo(x) == 0) {
                return i;
            }
        }
        return NOT_FOUND;
    }
    public int size() {
        return numItems;
    }
    public boolean isEmpty() {
        return numItems == 0;
    }
    public void clear() {
        numItems = 0;
        head = new Node(null, null);
    }
    public void print() {
        Node<E> currNode = head.next;
        while (currNode != null) {
            System.out.print(currNode.item + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
} // End LinkedList
