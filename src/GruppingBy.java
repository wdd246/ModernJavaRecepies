import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GruppingBy {

    List<String> strings = Arrays.asList("It","is","long","list","of","strings","to","use","in","case","of","example");
    Map<Integer, List<String>> lengthMap = strings.stream().collect(Collectors.groupingBy(String::length));

    public void show() {
        lengthMap.forEach((k, v) -> System.out.printf("%d: %s%n", k, v));
    }
}
