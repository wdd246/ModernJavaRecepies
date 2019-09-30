import java.util.function.Consumer;
import java.util.stream.Stream;

public class OneLambda {
    /*
    Wyrażenie lambda -  jest uproszczoną notacją do definiowania i używania anonimowych obiektów funkcyjnych. Zamiast definiować nazwaną klasę z funkcją operator() i później tworzyć jej obiekt, a następnie go wywoływać, można zastosować metodę na skróty. Jest to szczególnie przydatne, gdy trzeba przekazać operację jako argument do algorytmu.
    */
    public void lambda(){
        Stream.of(3,1,4,1,5,9)
                .forEach(x->System.out.print(x));
    }
    /*
    Referencja do metody
    obiekt::metodaEgzemplarza
    Klasa::metodaStstyczna
    Klasa::metodaEgzemplarza
     */
    public void reference(){
        Stream.of(3,1,4,1,5,9)
                .forEach(System.out::print);
    }
    /*
    Interfejs funkcyjny jest to interfejs zawierający jedną metodę abstrakcyjną.
     */
    public void functionalInterface(){ //Przypisanie referencji do metody do zmiennej typu interfejsu funkcyjnego
        Consumer<Integer> printer = System.out::print;
        Stream.of(3,1,4,1,5,9)
                .forEach(printer);
    }
}
