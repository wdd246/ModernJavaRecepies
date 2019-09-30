@FunctionalInterface
public interface OneDefaultInterface {
    int doSth();

    default String show(){
        return "Hello, world";
    }

    static void staticMethod(){
        System.out.println("Static method");
    }
}
