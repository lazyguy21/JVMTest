package org.yyf.jvmTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by tobi on 16-10-9.
 * 通过启动时VM options设置-Dtest=12312asdzsxc
 * 来得到属性
 * 可以通过jcmd pid VM.command_line看见你的命令行设置
 */
public class DPropertyTest {
    public static void main(String[] args) throws InterruptedException {
        String test = System.getProperty("test");
        System.out.println("test:"+test);
        TimeUnit.DAYS.sleep(11L);
    }
}
