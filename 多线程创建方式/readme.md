| 文件名                   | 描述                               |
| ------------------------ | ---------------------------------- |
| ThreadExtendsTest        | 通过继承实现多线程                 |
| ThreadRunnableTest       | 通过runnable实现多线程             |
| ThreadCallableTest       | 通过callable和futuretask实现多线程 |
| ThreadPoolTest           | 通过线程池实现多线程               |
| ThreadAnonymousClassTest | 通过匿名类实现多线程               |
| ThreadTimer              | 通过timer实现多线程                |
| ThreadParallelStream     | ParallelStream实现多线程计算       |





**部分创建方式的对比**

上面已经介绍完了JAVA中创建线程的几种，通过对比我们可以知道，JAVA实现多线程可以分为两类：一类是继承Thread类实现多线程；另一类是：通过实现Runnable接口或者Callable接口实现多线程。

下面我们来分析一下这两类实现多线程的方式的优劣：

**通过继承Thread类实现多线程：**

优点：

1、实现起来简单，而且要获取当前线程，无需调用Thread.currentThread()方法，直接使用this即可获取当前线程；

缺点：

1、线程类已经继承Thread类了，就不能再继承其他类；

2、多个线程不能共享同一份资源（如前面分析的成员变量 i ）；

**通过实现Runnable接口或者Callable接口实现多线程：**

优点：

1、线程类只是实现了接口，还可以继承其他类；

2、多个线程可以使用同一个target对象，适合多个线程处理同一份资源的情况。

缺点：

1、通过这种方式实现多线程，相较于第一类方式，编程较复杂；

2、要访问当前线程，必须调用Thread.currentThread()方法。



**综上：**

一般采用第二类方式实现多线程。(低耦合、多态性)