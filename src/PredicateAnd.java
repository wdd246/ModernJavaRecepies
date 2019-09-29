import java.security.PublicKey;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PredicateAnd {

    public static boolean isPerect(int x){
        return Math.sqrt(x) % 1 == 0;
    }

    public static boolean isTriangular(int x){
        double val = (Math.sqrt(8*x+1)-1)/2;
        return val % 1 == 0;
    }

    public void show(){
        IntPredicate triangular = PredicateAnd::isTriangular;
        IntPredicate perfect = PredicateAnd::isPerect;
        IntPredicate both = triangular.and(perfect);
        IntStream.range(1,10_000).filter(both).forEach(System.out::println);
    }
}
