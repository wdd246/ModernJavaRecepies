import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FiveTryCatch {

    public List<Integer> div(List<Integer> values, Integer factor) {
        return values.stream()
                .map(n->{
                    try{
                        return n/factor;
                    } catch (ArithmeticException e){
                        e.printStackTrace();
                    }
                })
                .collect(Collectors.toList());
    }

    List<Integer> values = Arrays.asList(10,20,30,40,50,60,70,80,90);
    List<Integer> scaled = FiveTryCatch.div(values,10);

    private Integer divide(Integer value, Integer factor){
        try {
            return value/factor;
        } catch(ArithmeticException e){ //miejsce obsługi wyjątku
            e.printStackTrace();
        }
    }

    public List<Integer> divUsingMethod(List<Integer> values, Integer factor){
        return values.stream()
                .map(n->divide(n,factor)) //uproszczony kod strumienia
                .collect(Collectors.toList());
    }
}
