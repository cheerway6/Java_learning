
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCallableTest {
    // 要抛出异常才可以; --> call()方法可以抛出异常
    public static void main(String[] args) throws ExecutionException, InterruptedException{
        ThreadCallable p1 = new ThreadCallable();
        ThreadCallable p2 = new ThreadCallable();

        //FutureTask 需要进一步学习
        FutureTask<Integer> task = new FutureTask<Integer>(p1);
        FutureTask<Integer> task2 = new FutureTask<Integer>(p2);


        new Thread(task).start();
        new Thread(task2).start();

        System.out.println("A\t" + task.get());
        System.out.println("B\t" + task2.get());
    }
}


class ThreadCallable implements Callable {

    private int i;
    @Override
    public Object call() throws Exception {
        for(;i<30;i++){
            System.out.println(Thread.currentThread().getName()+"\t"+i);
        }
        //call()可以有返回值
        return i;
    }
}