import java.util.Optional;
import java.util.stream.Stream;

public class OptionalFind {
    Optional<String> firstEven = Stream.of("five","values","strings","different","length").filter(s->s.length()%2==0).findFirst();

    Optional<String> firstOdd = Stream.of("five","values","strings","different","length").filter(s->s.length()%2!=0).findFirst();

    public void showFirstEven(){
        System.out.println(firstEven.isPresent()?firstEven.get():"Non even strings found");
    }
    public void showFirstOdd(){
        System.out.println(firstOdd.orElse("Non even strings found"));
    }
}
