import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomWhile {
    Random random = new Random();

    List<Integer> nums = random.ints(50,0,100)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .takeWhile(n->n>70)
            .collect(Collectors.toList());

    List<Integer> nums2 = random.ints(50,0,100)
            .sorted()
            .dropWhile(n->n<70)
            .boxed()
            .collect(Collectors.toList());

}
