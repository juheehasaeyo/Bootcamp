package DataStructure.One;

import DataStructure.Two.ListInterface2;

public class ArrayList<E> implements ListInterface2<E> {
    private E[] item;
    private int numItems;
    private static final int DEFAULT_CAPACITY = 64;
    public ArrayList() { // 생성자 1
        item = (E[]) new Object[DEFAULT_CAPACITY];
        numItems = 0;
    }
    public ArrayList(int n) { // 생성자 2
        item = (E[]) new Object[n];
        numItems = 0;
    }
    public void add(int index, E x) {
        if (numItems >= item.length || index < 0 || index > numItems)
        { /*에러 처리*/ }
        else {
            for (int i = numItems-1; i >= index; i--)
                item[i+1] = item[i]; // shift right
            item[index] = x;
            numItems++;
        }
    }
    public void append(E x) {
        if (numItems >= item.length) { /*에러 처리*/ }
        else {
            item[numItems++] = x;
        }
    }
    public E remove(int index) {
        if (isEmpty() || index < 0 || index > numItems - 1)
            return null;
        else {
            E tmp = item[index];
            for (int i = index; i <= numItems - 2; i++) {
                item[i] = item[i + 1]; // shift left
            }
            numItems--;
            return tmp;
        }
    }
    public boolean removeItem(E x) {
        int k = 0;
        while (k < numItems && ((Comparable)item[k]).compareTo(x) != 0) {
            k++;
        }
        if (k == numItems) return false;
        else {
            for (int i = k; i <= numItems -2; i++) {
                item[i] = item[i + 1]; // shift left
            }
            numItems--;
            return true;
        }
    }
    public E get(int index) { //첫 번째 원소를 0번 원소로 표기
        if (index >= 0 && index <= numItems -1) {
            return item[index];
        } else return null;
    }
    public void set(int index, E x) {
        if (index >= 0 && index <= numItems -1) {
            item[index] = x;
        }
        else { /* 에러 처리*/ }
    }
    private final int NOT_FOUND = -1;
    public int indexOf(E x) {
        int i = 0;
        while (i < numItems && ((Comparable)item[i]).compareTo(x) != 0) {
            i++;
        }
        if (i == numItems) return NOT_FOUND;
        else return i;
    }
    public int size() {
        return numItems;
    }
    public boolean isEmpty() {
        return numItems == 0;
    }
    public void clear() {
        item = (E[]) new Object[item.length];
        numItems = 0;
    }

    public void print() {
        for(int i=0; i<numItems; i++) {
            System.out.print(item[i] + " ");
        }
    }
} // End ArrayList
