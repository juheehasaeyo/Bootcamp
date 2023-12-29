package Day4;

public class TV {

    String tv;
    int year;
    int inch;
    public TV(String tv, int year, int inch) {
        this.tv = tv;
        this.year = year;
        this.inch = inch;
    }
    void show() {
        System.out.println(tv + "에서 만든 " + year + "년형 " + inch + "인치 TV");
    }
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}
