import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoPredykatyFiltrowanie {
    /*
        Szukanie łańcucha określonej długości.

     */
    public String getNamesOfLength(int length, String... names){
        return Arrays.stream(names)
                .filter(s->s.length() == length) //predykat okreslonej długości znaków
                .collect(Collectors.joining(", "));
    }
    /*
        Szukanie łańcucha o określonym początku znakow

     */
    public String getNamesStartingWith(String s, String... names){
        return Arrays.stream(names)
                .filter(x->x.startsWith(s)) //predykat zwracający łańcuch znakó rozporczynający się od ciągu znaków
                .collect(Collectors.joining(", "));
    }

}
