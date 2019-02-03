public class Fruit {
    public Fruit(){
        System.out.println("Costructor of Fruit");
    }
    public void method(){
        System.out.println("Method of Fruit");
    }

    public static void main(String[] args) {
        Fruit f = new Apple();
        f.method();
        Integer i1 = 10;
        Integer i2 = 10;
        Double d1 = 10d;
        Double d2 = 10d;
        System.out.println(i1 == i2);
        System.out.println(d1 == d2);

    }
}


