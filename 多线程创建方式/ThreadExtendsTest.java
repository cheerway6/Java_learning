
public class ThreadExtendsTest {
    public static void main(String[] args){
        ThreadExtends t1 = new ThreadExtends();
        ThreadExtends t2 = new ThreadExtends();


        t1.start();
        t2.start();
    }
}




class ThreadExtends extends Thread{

    private int i;



    public void run(){
        for(;i<20;i++){
            System.out.println(this.currentThread().getName() + "\t" + i);
        }
    }
}