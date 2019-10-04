import java.util.stream.IntStream;

public class ThreePeek {
    public int sumDoublesDivisibleBy3(int start,int end){
        return IntStream.rangeClosed(start,end)
                .peek(n->System.out.printf("Pierwotna: %d%n",n))
                .map(n->n*2)
                .peek(n->System.out.printf("Podwojona: %d%n",n))
                .filter(n->n%3==0)
                .peek(n->System.out.printf("Z filtrem: %d%n",n))
                .sum();
    }
}
