

public class ThreadRunnableTest {
    public static void main(String[] args){
        Thread t1 = new Thread(new ThreadRunnable());
        Thread t2 = new Thread(new ThreadRunnable());

        t1.start();
        t2.start();

    }
}

class ThreadRunnable implements Runnable{

    private int i;

    @Override
    public void run() {
        for(;i<20;i++){
            System.out.println(Thread.currentThread().getName() +"\t" + i);
        }
    }
}