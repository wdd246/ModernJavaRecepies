import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FiveRandom {
    Random r = new Random();

    public void show(){
        /*
            Pięć liczb losowych
         */
        r.ints(5)
                .sorted()
                .forEach(System.out::println);
        /*
            Pięć liczb losowych double z prtzedziału <0,0.5)
         */
        r.doubles(5,0,0.5)
                .sorted()
                .forEach(System.out::println);
        /*
        Pakowanie long do obiketu Long by dodac do kolejki
         */
        List<Long> longs = r.longs(5)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(longs);
        /*
            To samo tylko collect zamiast boxed
         */
        List<Integer> listOfInts = r.ints(5,10,20)
                .collect(LinkedList::new, LinkedList::add,LinkedList::addAll);
        System.out.println(listOfInts);
    }
}
