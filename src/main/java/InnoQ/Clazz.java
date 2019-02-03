package InnoQ;

public class Clazz {
    int x = 2;
    public int getX(){
        return x;
    }

    public static void main(String[] args) {
        Clazz c = new subClass();
        System.out.println(c.x + "   " + c.getX());
    }
}

class subClass extends Clazz{
    int x = 1;
    public int getX(){
        return x;
    }
}
