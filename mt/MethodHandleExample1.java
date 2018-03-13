import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandleExample1 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException {
        MethodHandle mh = MethodHandles.lookup()
                .findVirtual(MethodHandleExample.class, "doStuff", MethodType.methodType(Void.class));
        System.out.println(mh.toString());
    }

    void sayHello(String name) {
        System.out.printf("Hello " + name);
    }
}
