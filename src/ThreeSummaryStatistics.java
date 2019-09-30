import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

public class ThreeSummaryStatistics {

    DoubleSummaryStatistics stats = DoubleStream.generate(Math::random).limit(100_000).summaryStatistics();

    public void show(){
        //System.out.println(stats);
        System.out.println("Min:"+stats.getMin());
        System.out.println("Max:"+stats.getMax());
        System.out.println("Count:"+stats.getCount());
        System.out.println("Sum:"+stats.getSum());
        System.out.println("Avg:"+stats.getAverage());

    }

}
