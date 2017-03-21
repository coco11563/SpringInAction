package pub.sha0w.ConcurrentTest.CAS;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by sha0w on 17-3-20.
 *
 * 使用cas令其无需上锁
 *
 */
public class immutableTest {
    private static volatile String store = "I am a immutable variable";
    private static AtomicInteger sigma = new AtomicInteger(0);
    private static String getStore() {
        return store;
    }
    private static boolean CASString(String old_val, String add_val) {
        if (old_val.equals(store)) {
            store += add_val;
            return true;
        } else {
            return false;
        }
    }

    private static boolean CAS(int old_val, int new_val) {
        return sigma.compareAndSet(old_val, new_val);
    }

    private static boolean CASAdd(String old_val, String add_val) {
        if (CAS(sigma.get(), sigma.get() + 1)) {
            store += add_val;
            return true;
        }
        return false;
    }
    static class taskOne implements Runnable{
        private int num = 0;
        @Override
        public void run() {
            while(num < 100) {
                if (CASString(getStore(), " task one Change " + ++num + "times"))
                    System.out.println(store);
            }
        }
    }


    static class taskTwo implements Runnable{
        private int num = 0;
        @Override
        public void run() {
            while(num < 100) {
                if (CASString(getStore(), " task two Change " + ++num + "times"))
                    System.out.println(store);
            }
        }
    }
    private static AtomicInteger num = new AtomicInteger(0);
    static class taskThree implements Runnable{

        @Override
        public void run() {
            while(num.get() < 100) {
                if (CASAdd(getStore(), " task one Change " + num.getAndIncrement() + "times"))
                    System.out.println(store);
            }
        }
    }


    static class taskFour implements Runnable{
        @Override
        public void run() {
            while(num.get() < 100) {
                if (CASAdd(getStore(), " task two Change " + num.getAndIncrement() + "times"))
                    System.out.println(store);
            }
        }
    }

    public static void main(String args[]) {
        Executor executor = Executors.newFixedThreadPool(2);
//        executor.execute(new taskOne());
//        executor.execute(new taskTwo());
//        executor.execute(new taskThree());
//        executor.execute(new taskFour());
//        executor.execute(new task__());
//        executor.execute(new task__());
        executor.execute(new task2__());
        executor.execute(new task2__());
    }

    //unsafe
    private static volatile int flagnum__ = 0;

    static class task__ implements Runnable{

        @Override
        public void run() {
            while (flagnum__ < 20) {
                flagnum__++;
                System.out.println(flagnum__);
            }
        }
    }

    //Thread safe now?
    private static boolean compareAndSet(int old_, int new_) {
        if (old_ != flagnum__) {
            return false;
        } else {
            flagnum__ = new_;
            return true;
        }
    }

    static class task2__ implements Runnable{

        @Override
        public void run() {
            while (flagnum__ < 20) {
                int old_val = flagnum__;
                if (compareAndSet(old_val, old_val + 1))
                System.out.println(flagnum__);
            }
        }
    }
}
