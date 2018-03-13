import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandleExample {

    public static void staticMethod(String x) {
        System.out.println(x);
    }

    private int add(int x, int y) {
        return x + y;
    }

    private int add(long x, long y) {
        return (int) (x + y);
    }

    protected String sayHello(String name) {
        return "Hello " + name;
    }

    void doStuff() {
        System.out.println("Sarath doStuff");
    }

    public static void main(String[] args) throws Throwable {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodType mt = MethodType.methodType(void.class);
        MethodHandle mh = lookup.findVirtual(MethodHandleExample.class, "doStuff", mt);

        mh.invoke(new MethodHandleExample());

        mt = MethodType.methodType(int.class, int.class, int.class);
        mh = lookup.findVirtual(MethodHandleExample.class, "add", mt);

        int res = (int) mh.invoke(new MethodHandleExample(), 2, 3);

        System.out.println(res);
    }
}
