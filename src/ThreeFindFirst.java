import java.util.Optional;
import java.util.stream.Stream;

public class ThreeFindFirst {
    Optional<Integer> firstEven =
            Stream.of(3,1,4,8,5,7,9,2,6)
            .filter(n->n%2==0)
            .findFirst();
    //System.out.print = Optional[4]

    Optional<Integer> firstEven2 =
            Stream.of(3,1,4,8,5,7,9,2,6)
                    .filter(n->n>10)
                    .filter(n->n%2==0)
                    .findFirst();
    //System.out.print = Optional.empty

    Optional<Integer> firstEvenParallel =
            Stream.of(3,1,4,8,5,7,9,2,6)
                    .parallel()
                    .filter(n->n%2==0)
                    .findFirst();
    //System.out.print = Optional[4]
}
