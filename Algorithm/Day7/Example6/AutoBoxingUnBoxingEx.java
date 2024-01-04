package Day7.Example6;

public class AutoBoxingUnBoxingEx {
    public static void main(String[] args) {
        int n = 10;
        Integer intObjet = n;
        System.out.println("intObject = " + intObjet);
        int m = intObjet + 10;
        System.out.println("m = " + m);
    }
}