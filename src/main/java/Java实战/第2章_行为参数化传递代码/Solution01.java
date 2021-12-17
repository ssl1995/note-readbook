package Java实战.第2章_行为参数化传递代码;

/**
 * @author SongShengLin
 * @date 2021/12/16 7:42 PM
 * @description
 */
public class Solution01 {
    public static void main(String[] args) {
        // 使用thread创建线程
        Thread hello = new Thread(() -> System.out.println("hello"));
        // 使用api的线程池创建线程
//        Future<?> getThreadName = Executors.newCachedThreadPool().submit(() -> System.out.println(Thread.currentThread().getName()));
    }
}
