import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RoundRobinAlgorithm {
    public static void main(String[] args) {
        //1. Using modulus (%) operator
        List<String> workers = Arrays.asList("A", "B", "C");
        int totalTasks = 7;

        for(int i=0;i<totalTasks;i++){
            String assignedWorker = workers.get(i % workers.size());
            System.out.println("Task " + (i + 1) + " → " + assignedWorker);
        }


        //2. Using an Iterator + reset
        List<String> servers = Arrays.asList("server1","server2","server3");
        int totalRequests = 8;

        Iterator<String> it = servers.iterator();

        for(int i=0;i<totalRequests;i++){
            if(!it.hasNext()){
                it = servers.iterator();
            }
            System.out.println("Task "+(i+1)+" Assigned server to "+it.next());
        }


        //3. Using AtomicInteger for thread-safe Round Robin
        for (int i = 1; i <= 10; i++) {
            System.out.println("Request " + i + " → " + getNextServer());
        }

        
    }

    private static final List<String> servers = Arrays.asList("S1", "S2", "S3");
    private static final AtomicInteger index = new AtomicInteger(0);

    public static String getNextServer() {
        System.out.println("value is "+index.get());
        //System.out.println(index.getAndUpdate(j->5));
        return servers.get(index.getAndUpdate(i -> (i + 1) % servers.size()));
    }

}
