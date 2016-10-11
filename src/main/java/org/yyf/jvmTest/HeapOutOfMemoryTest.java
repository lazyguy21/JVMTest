package org.yyf.jvmTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tobi on 16-10-9.
 * -Xmx20m -Xms20m -XX:+PrintGCDetails
 * 堆内存溢出之前导出堆快照
 *-XX:HeapDumpPath=制定地址
 *默认在启动java的目录下，名字叫java_pid.hpro
 *用jvivsualm加载分析
 */
public class HeapOutOfMemoryTest {
    private static final Integer _1M = 1024 * 1024;
    private static int createNum = 0;

    public static void main(String[] args) {
        List container = new ArrayList();

        while (true) {
            container.add(new Byte[_1M]);
//            System.out.println("createNum : "+ ++createNum);
        }
    }
}
