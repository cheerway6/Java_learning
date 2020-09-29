

import java.util.Timer;
import java.util.TimerTask;

public class ThreadTimer {
    public static void main(String[] args){
        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                System.out.println("定时任务立刻执行(0s)，每隔1000ms执行一次");
                System.out.println("*********************************************");
                System.out.println(Thread.currentThread().getName());
            }
        },0,1000);
    }
}
