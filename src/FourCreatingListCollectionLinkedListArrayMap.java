import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FourCreatingListCollectionLinkedListArrayMap {
    /*
        Tworzenie listy
     */
    List<String> list = Stream.of("Fourios","Raja","Shovel","Bowler","Boy","Spleen")
            .collect(Collectors.toList());
    /*
        Tworzenie zbioru
     */
    Set<String> set = Stream.of("Fourios","Raja","Shovel","Bowler","Boy","Spleen")
            .collect(Collectors.toSet());
    /*
        Tworzenie listy powiązanej
     */
    List<String> linked = Stream.of("Fourios","Raja","Shovel","Bowler","Boy","Spleen")
            .collect(Collectors.toCollection(LinkedList::new));
    /*
        Tworzenie tablicy
     */
    String[] array = Stream.of("Fourios","Raja","Shovel","Bowler","Boy","Spleen")
            .toArray(String[]::new);
    /*
        Tworzenie słownika
     */
//    Set<Actor> actors = mysteryMan.getActors();
//    Map<String,String> actorMap = actors.stream().collect(Collectors.toMap(Actor::getName,Actor::getRole));
//
//    actorMap.forEach((key,value)->System.out.printf("%s wcielił się w postać %s%n",key,value));

}
