import java.util.stream.IntStream;

public class Match {
    public boolean isPrime(int num){
        int limit = (int) (Math.sqrt(num)+1);
        return num == 2 || num > 1 && IntStream.range(2,limit).noneMatch(divisor -> num % divisor == 0);
    }
}
