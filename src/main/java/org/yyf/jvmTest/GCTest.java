package org.yyf.jvmTest;

/**
 * Created by tobi on 16-10-9.
 * -Xmx1000m -Xms1000m -XX:-UseAdaptiveSizePolicy 观察新生代的搜survivor和eden的比例
 * -XX:+PrintGCDetails
 */
public class GCTest {
    private static final Integer _1M = 1024 * 1024;
    private static int createNum=0;
    public static void main(String[] args) {
        Byte[] object;
        while(true){
            object = new Byte[_1M];
//            System.out.println("createNum : "+ ++createNum);
        }
    }
}
