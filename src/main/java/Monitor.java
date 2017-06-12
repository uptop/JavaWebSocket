import com.uptop.websocket.WebSocketTest;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Monitor implements Runnable {


    @Override
    public void run() {
        WebSocketTest webSocketTest = new WebSocketTest();
        webSocketTest.sendMsg("当前时间:" + new Date());
    }

    public void sendMsg() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newSingleThreadScheduledExecutor();
        newScheduledThreadPool.scheduleWithFixedDelay(new Monitor(), 20, 5, TimeUnit.SECONDS);

    }
}

