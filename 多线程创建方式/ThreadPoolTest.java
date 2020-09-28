

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class ThreadPoolTest {
    private static int POOL_NUM = 10;
    public static void main(String[] args) throws InterruptedException{
        ExecutorService threadpool = Executors.newFixedThreadPool(POOL_NUM);


        for(int i=0;i<POOL_NUM;i++){
            ThreadRunnable thread = new ThreadRunnable();
            threadpool.execute(thread);
        }


        threadpool.shutdown();
    }
}