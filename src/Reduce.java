import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reduce {
    int doubleSum = IntStream.rangeClosed(1,10).reduce(0,(x,y)->x+2*y);
    int sum = Stream.of(1,2,3,4,5,6,7,8,9,10).reduce(0,Integer::sum);
    Integer max = Stream.of(3,1,4,1,5,9).reduce(Integer.MIN_VALUE,Integer::max);
    String s = Stream.of("Hello",",","World","!").reduce("",String::concat);
}
