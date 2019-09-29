import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Future {
    ExecutorService service = Executors.newCachedThreadPool();
    java.util.concurrent.Future<String> future = service.submit(new Callable<String>(){
        @Override
        public String call() throws Exception{
            Thread.sleep(100);
            return "Witaj, świecie";
        }
    });

    public void doing(){
        System.out.println("Przetwarzanie");
        getIfNotCancelled(future);
    }

    public void getIfNotCancelled(java.util.concurrent.Future<String> future) {
        try{
            if(!future.isCancelled()){
                System.out.println(future.get());
            }
            else {
                System.out.println("Cancelled");
            }
        } catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
    }
}
