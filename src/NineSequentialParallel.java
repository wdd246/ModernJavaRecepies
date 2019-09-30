import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NineSequentialParallel {
    List<Integer> numbers = Arrays.asList(3,1,4,1,5,9);
    List<Integer> nums = numbers.parallelStream()
            .map(n->n*2)
            .peek(n->System.out.printf("%s doing %d%n",
                    Thread.currentThread().getName(),n))
            .sequential()
            .sorted()
            .collect(Collectors.toList());
}
