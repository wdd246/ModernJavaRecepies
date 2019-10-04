import java.util.stream.IntStream;

public class ThreeMap {
    public int sumSoublesDivisibleBy3(int start,int end){
        return IntStream.rangeClosed(start,end)
                .map(n->n*2)
                .filter(n->n%3==0)
                .sum();
    }
    /*
        Tożsamościowa operacja map która drukuje kazdy element po czym go zwraca
     */
    public int sumSoublesDivisibleBy32(int start,int end){
        return IntStream.rangeClosed(start,end)
                .map(n->{
                    System.out.println(n);
                    return n;
                })
                .map(n->n*2)
                .filter(n->n%3==0)
                .sum();
    }
}
