import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ThreeRangeAndBoxed {
    /*
        Zakres <10,15)
     */
    List<Integer> range =
            IntStream.range(10,15)
            .boxed() //Potrzebne by umożliwiśc kolektorom dokonanie konwersji wartości typów podstawowych np. int -> Integer
            .collect(Collectors.toList());
    /*
        Zakres <10,15>
     */
    List<Long> rangeClosed=
            LongStream.rangeClosed(10,15)
            .boxed()
            .collect(Collectors.toList());
}
