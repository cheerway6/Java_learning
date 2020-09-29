

import java.util.Arrays;
import java.util.List;

public class ThreadParallelStream {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        ThreadParallelStream test = new ThreadParallelStream();
        int result = test.add(list);
        System.out.println("计算后的结果为"+result);
    }

    public int add(List<Integer> list){
        //如果lambda是串行执行，则应顺序打印
        list.parallelStream().forEach(System.out::println);
        //Lambda有stream和parallelStream
        return list.parallelStream().mapToInt(i->i).sum();
    }
}
