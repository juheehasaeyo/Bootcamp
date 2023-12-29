package Day4;

public class Song {
    String title;
    String article;
    int year;
    String country;
    public Song() {
        // 기본 생성자
    }
    // 매개변수로 모든 필드를 초기화하는 생성자
    public Song(String title, String article, int year, String country) {
        this.title = title;
        this.article = article;
        this.year = year;
        this.country = country;
    }
    void show() {
        System.out.println(year + "년 " + country + " 국적의 " + article + "가 부른 " + title);
    }
    public static void main(String[] args) {
        Song song = new Song("Dancing Queen", "ABBA", 1978, "Sweden");
        song.show();
    }
}
