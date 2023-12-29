package Day4.Example4;

public class Book {
    String title;
    String author;
    public Book() {
        this("", "");
        System.out.println("생성자 호출됨");
    }
    public Book(String title) {
        this(title, "작자미상");
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void show() {
        System.out.println(title + "의 작가는 " + author);
    }
    public static void main(String[] args) {
        Book b1 = new Book("어린왕자", "생택쥐페리");
        Book b2 = new Book("알고리즘");
        Book b3 = new Book();
        b1.show();
        b2.show();
        b3.show();
    }
}
