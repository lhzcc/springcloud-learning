package top.lhzcc;

import java.time.ZonedDateTime;

/**
 * @Author: yaunlh
 * @Date: 2020/8/4 16:59
 * @Version 1.0
 */
public class TestZonedTime {

    public static void main(String[] args) {
        ZonedDateTime dateTime = ZonedDateTime.now();

        System.out.println(dateTime.toString());
    }

}
