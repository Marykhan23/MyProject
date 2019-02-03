import java.util.concurrent.ExecutionException;

public class C {
    public static void main(String[] args) {
        try {
            foo();
            System.out.println("A ");
        } catch(Exception e){
            System.out.println("B ");
        } finally {
            System.out.println("C ");
        }
    }
    private static void foo() throws Exception{
        try{
            System.out.println("A1 ");
            throw new Exception();
        }catch (Exception e){
            System.out.println("B1 ");
            throw new Exception();
        }finally {
            System.out.println("C1 ");
        }
    }
}

//A1 B1 C1 A