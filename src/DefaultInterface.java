@FunctionalInterface
public interface DefaultInterface {
    int doSth();

    default String show(){
        return "Hello, world";
    }

    static void staticMethod(){
        System.out.println("Static method");
    }
}
