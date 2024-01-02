package Day5.Example5;

class Person {
    private int weight;
    int age;
    protected int height;
    public String name;
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void getHeight(int height) {
        this.height = height;
    }
}
class Student extends Person {
    public void set() {
        age = 30;
        name = "홍길동";
        getHeight(184);
        // weight = 99; // 오류. 슈퍼 클래스의 private 접근 불가
        setWeight(75);
        System.out.println(name + "은 " + age + "세이며 " +
                "키와 몸무게는 " + height + "에 " + getWeight() + "이다.");
    }
}
public class InheritanceEx {
    public static void main(String[] args) {
        Student st = new Student();
        st.set();
    }
}
