import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FiveMerge {
    public Map<String,Integer> fullWordCounts(String passage){
        Map<String, Integer> wordCounts = new HashMap<>();
        /*
        Pozbycie się wielkich liter i znaków interpunkcyjnych
         */
        String testString = passage.toLowerCase()
                .replaceAll("\\W"," ");
        /*
            Dodanie lub aktualizacja licznika dla danego słownika
         */
        Arrays.stream(testString.split("\\s+"))
                .forEach(word->wordCounts.merge(word,1,Integer::sum));

        return wordCounts;
    }
}
