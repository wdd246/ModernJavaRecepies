@FunctionalInterface
public interface OneDefaultAndStaticInterface {

    int doSth();
    /*
        Uchronienie od problemu diamentowego ( dziedziczenia z wielu konstrukcji jednocześnie ). Od tej pory można definiować metody w interfejsach za pomocą default
    */
    default String show(){
        return "Hello, world";
    }
    /*
        Definiowanie statycznych metod w interfejsach. Do wywołania za pomocą nazwy interfejsu, nie trzeba implementować interfejsu byby użyć metod statycznych.
     */
    static void staticMethod(){
        System.out.println("Static method");
    }
}
