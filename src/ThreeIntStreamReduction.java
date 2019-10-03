import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ThreeIntStreamReduction {
    String[] strings = "It is a array of string types".split(" ");

    /*
        Count to metoda Stream więc niema potrzeby odwoływać się do IntStream
     */
    long count =
            Arrays.stream(strings)
            .map(String::length)
            .count();
    /*
        Sum jest uzywana tylko ze strumieniami typów podstawowych
     */
    int totalLength =
            Arrays.stream(strings)
            .mapToInt(String::length)
            .sum();
    /*
        Average jest uzywana tylko ze strumieniami typów podstawowych
     */
    OptionalDouble avg =
            Arrays.stream(strings)
            .mapToInt(String::length)
            .average();
    /*
        Max bez komparatora jest uzywana tylko ze strumieniami typów podstawowych
     */
    OptionalInt max =
            Arrays.stream(strings)
            .mapToInt(String::length)
            .max();
    /*
        Min bez komparatora jest uzywana tylko ze strumieniami typów podstawowych
     */
    OptionalInt min =
            Arrays.stream(strings)
                    .mapToInt(String::length)
                    .min();

}
