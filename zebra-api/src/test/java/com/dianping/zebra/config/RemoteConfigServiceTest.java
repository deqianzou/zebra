package com.dianping.zebra.config;

import org.junit.Test;

public class RemoteConfigServiceTest {


    @Test
    public void testSingleton(){
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        TestThread t3 = new TestThread();

        t1.start();
        t2.start();
        t3.start();
    }

    class TestThread extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(RemoteConfigService.getInstance().hashCode());
            }
        }
    }
}
