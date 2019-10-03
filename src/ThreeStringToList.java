import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreeStringToList {
    /*
        Nie działa do strumieni danych typów podstawowych. IntStream etc. Wtedy po Stream.of (TntStream.of ...) trzeba dać .boxed()
     */
    List<String> strings =
            Stream.of("it","is","list","of","string","text")
            .collect(Collectors.toList());
}
