import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FourInsertLinearStreamToMap {
    /*
        Book class
     */
    private int id;
    private String name;
    private double price;

    public FourInsertLinearStreamToMap(){}
    public FourInsertLinearStreamToMap(int id, String name, double price){}

    public int getId(){
        return id;
    }
    /*
        Dodawanie książek do słownika
     */
    public void addTo(){
        /*
            Kolekcja książek
         */
        List<FourInsertLinearStreamToMap> books = Arrays.asList(
                new FourInsertLinearStreamToMap(1,"Nowoczescne receptury w Javie 1", 69.99),
                new FourInsertLinearStreamToMap(2,"Book2", 19.99),
                new FourInsertLinearStreamToMap(3,"Nowoczescne 3", 109.99),
                new FourInsertLinearStreamToMap(4,"Now 4", 29.99),
                new FourInsertLinearStreamToMap(5,"Nowoczescne 5", 69.99),
                new FourInsertLinearStreamToMap(6,"Nowoczescne rece 6", 89.99),
                new FourInsertLinearStreamToMap(7,"N 7", 69.99)
        );
        /*
            Tożsamościowa lambda. Przyjmuje element i go zwraca
         */
        Map<Integer,FourInsertLinearStreamToMap> bookMap =
                books.stream()
                .collect(Collectors.toMap(FourInsertLinearStreamToMap::getId,b -> b));
        /*
            Statyczna metoda identity z interfejsu Function
         */
        bookMap=books.stream().collect(Collectors.toMap(FourInsertLinearStreamToMap::getId, Function.identity()));
    }

}

