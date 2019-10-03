import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreeCollectorAndStringBuild {
    /*
        Zbieranie łańcuchów za pomocą StringBuilder
     */
    String s = Stream.of("it","is","list","of","words")
            .collect(() -> new StringBuilder(), //dostawca wyniku
                    (sb,str)->sb.append(str), //dodanie jednej wartości do wyniku
                    (sb1,sb2)->sb1.append(sb2)) //utworzenie kombinacji dwóch wyników
            .toString();
    /*
        Zbieranie łańcuchów za pomocą referencji
     */
    String z = Stream.of("it","is","list","of","words")
            .collect(StringBuilder::new,
                    StringBuilder::append,
                    StringBuilder::append)
            .toString();

}
