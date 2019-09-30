import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OneSorting {
    List<String> bonds = Arrays.asList("Connery","Lazenby","Moore","Dalton","Brosnan","Craig");//List of Strings
    /*
    Porządek naturalny - leksykograficzny
     */
    List<String> natural = bonds.stream()
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.toList());
    /*
    Odwrotny porządek leksykograficzny
     */
    List<String> reverse = bonds.stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
    /*
    Sortowanie według zapisu małymi literami
     */
    List<String> lowercase = bonds.stream()
            .sorted(Comparator.comparing(String::toLowerCase))
            .collect(Collectors.toList());
    /*
    Sortowanie według długości
     */
    List<String> length = bonds.stream()
            .sorted(Comparator.comparingInt(String::length))
            .collect(Collectors.toList());
    /*
    Sortowanie według długości a w przypadku tej samej długości sortowanie leksykograficzne
     */
    List<String> lengthAndNatural = bonds.stream()
            .sorted(Comparator.comparingInt(String::length)
            .thenComparing(Comparator.naturalOrder()))
            .collect(Collectors.toList());
}
