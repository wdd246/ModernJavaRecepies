import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreeCreateStringBy {
    String StreamOf =
            Stream.of("Gomez","Monica","Wedesday","Pugsley")
            .collect(Collectors.joining(","));

    String[] names = {"Human","Bee","Lily","Herman","Grandpa"};
    String ArraysStream =
            Arrays.stream(names)
            .collect(Collectors.joining(","));

    List<BigDecimal> StreamIterate =
            Stream.iterate(BigDecimal.ONE, n->n.add(BigDecimal.ONE))
            .limit(10)
            .collect(Collectors.toList());

    List<String> names2 = Arrays.asList("Greg","Gomez","Monica","Wedesday","Pugsley");
    String StringFromList =
            names2.stream()
            .collect(Collectors.joining(","));

    void getGenerateRandom() {
        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);
    }
}
