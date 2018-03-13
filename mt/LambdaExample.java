import java.util.concurrent.Callable;

public class LambdaExample {

    public static void main(String[] args) throws Exception {
        Callable callable = () -> "val";
        callable.call();

        int x = 10;
        Add add10 = (y) -> x + y;
        System.out.println(add10.apply(3));
    }

    @FunctionalInterface
    interface Add {
        int apply(int x);
    }
}
