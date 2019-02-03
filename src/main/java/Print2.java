
public class Print2 extends Print1 {

    void print() {
        System.out.println(666);
    }

    public static void main(String[] args) {
        Print1 p = new Print1();
        Print2 q = new Print2();
        Print2 d =q;
        System.out.println(d);
        System.out.println(q);

    }


}
