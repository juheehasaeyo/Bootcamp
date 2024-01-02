package Day5.Example5;

class Person2 {
    String name;
    String id;
    public Person2() {

    }
    public Person2(String name) {
        this.name = name;
    }
}
class Student2 extends Person2 {
    public Student2() {
        super();
    }
}
class Researcher extends Person2 {
    public Researcher() {
        super();
    }
}
class Professor extends Researcher {
    public Professor() {
        super();
    }
}
public class InstanceOfEx {
    static void print(Person2 p) {
        if(p instanceof Person2) {
            System.out.print("Person2 ");
        } if (p instanceof Student2) {
            System.out.print("Student2 ");
        } if (p instanceof Researcher) {
            System.out.print("Researcher ");
        } if (p instanceof Professor) {
            System.out.print("Professor ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("new Student() ->\t"); print(new Student2());
        System.out.print("new Researcher() ->\t"); print(new Researcher());
        System.out.print("new Professor() ->\t"); print(new Professor());
    }
}
