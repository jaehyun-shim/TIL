# 쓰레드(Thread) 
- __쓰레드 & 프로세스__ : 프로세스가 OS의 자원(주소공간, 메모리 등)을 할당받는 작업의 단위라면, 쓰레드는 프로세스가 할당받은 자원을 이용하여 실행하는 단위이다. 
쓰레드는 프로세스간에 통신보다 서로 비용이 적게들고 자원의 효율적으로 관리할 수 있다.
주위할점은 쓰레드간의 자원공유는 전역변수를 이용하므로 특히 멀티쓰레드간 동기화 문제에 신경을 써야한다.

## 쓰레드 기본동작  
-  run 메소드를 실행 시키려면 Thread 클래스를 상속한 ThreadRunTest의 인스턴스를 생성하여 run.start 를 실행하면 Thread 클래스 내부에 start 메소드를 수행시켜 상속받은 클래스의 run 메소드가 실행된다.

``` 
public class ThreadRunTest extends Thread {
    public void run() {
        System.out.println("Run!");
    }

    public static void main(String[] args) {
        ThreadRunTest run = new ThreadRunTest();
        run.start();
    }
}
```
## <span style="color:gray">_Join_</span>
- 쓰레드가 확실히 종료 된 후 다음 로직을 수행할 수 있도록 쓰레드가 종료될때까지 기다리게 하는 메소드이다.

```
public static void main(String[] args) {
    ArrayList<Thread> threads = new ArrayList<Thread>();
    for (int i = 0; i < 10; i++) {
        Thread t = new ThreadRunTest(i);
        t.start();
        threads.add(t);
    }

    for (int i = 0; i < threads.size(); i++) {
        Thread t = threads.get(i);
        try {
            t.join();
        } catch (Exception e) {
        }
    }
    System.out.println("main end.");
}

```


## <span style="color:gray">_Runnable_</span>
- 보통 쓰레드 객체를 만들 때 위의 예처럼 Thread를 상속하여 만들기도 하지만 보통 클래스 확장(다중상속)을 위해서 Runnable 인터페이스를 구현하도록 하는 방법을 많이 사용한다. Runnable 인터페이스는 run 메소드를 구현하도록 강제한다.

```
import java.util.ArrayList;

public class ThreadRunTest implements Runnable {
    int seq;

    public ThreadRunTest(int seq) {
        this.seq = seq;
    }

    @Override
    public void run() {
        System.out.println(this.seq + " thread start.");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(this.seq + " thread end.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new ThreadRunTest(i));
            t.start();
            threads.add(t);
        }

        for (int i = 0; i < threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join();
            } catch (Exception e) {
            }
        }
        System.out.println("main end.");
    }
}

```