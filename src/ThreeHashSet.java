import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class ThreeHashSet {
    List<String> wordList = Arrays.asList("it","is","stream","of","text","strings");
    /*
        Obiekty typu HashSet nie mają zdefiniowanej kolejności napotkania.
        W Javie 9 nowe niezmenne zbiory i słowniki są randominizowane,
        wiec kolejnośc po każdej iteracji będzie inna nawet jak zainicjalizuje się je w ten sam sposób.
     */
    Set<String> words = new HashSet<>(wordList);
    Set<String> words2 = new HashSet<>(wordList);

    /*
        Dodanie i usunięcie tylu elementów aby wywołać przeliczenie skrótów
     */
    public void set(){
        IntStream.rangeClosed(0,50)
                .forEachOrdered(i->words2.add(String.valueOf(i)));
        words2.retainAll(wordList);
    }

    public void show(){
        System.out.println(words.equals(words2));
        System.out.println("Wcześniej:"+words);
        System.out.println("Teraz: "+words2);
    }


}
