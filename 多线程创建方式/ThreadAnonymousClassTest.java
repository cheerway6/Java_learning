

public class ThreadAnonymousClassTest {
    public static void main(String[] args){
        // 相当于继承Thread类并重写run方法
        new Thread(){
            public void run(){
                System.out.println("匿名类创建方式1.....");
            };
        }.start();


        //相当于实现了runnable;
        new Thread(new Runnable(){
            public void run(){
                System.out.println("匿名类创建方式2.....");
            };
        }).start();


    }
}

