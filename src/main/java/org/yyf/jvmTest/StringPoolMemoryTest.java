package org.yyf.jvmTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tobi on 16-10-9.
 * -XX:MaxPermSize=1K -Xmx5m -Xms5m
 * -XX:+HeapDumpOnOutOfMemoryError
 * 堆内存溢出之前导出堆快照
 *-XX:HeapDumpPath=制定地址
 *默认在启动java的目录下，名字叫java_pid.hpro
 *用jvivsualm加载分析
 * 常量池的实际实现是在堆内存中……
 */
public class StringPoolMemoryTest {
    private static final Integer _1M = 1024 * 1024;
    private static int createNum = 0;

    public static void main(String[] args) {
        List container = new ArrayList();
        int n = 0;
        while (true) {
            container.add("去吧，皮卡丘！！！！！！！阿斯顿发送到发送地方啊"+n++);
//            System.out.println("createNum : "+ ++createNum);
        }
    }
}
