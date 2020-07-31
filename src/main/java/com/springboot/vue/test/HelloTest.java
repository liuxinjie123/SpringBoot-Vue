package com.springboot.vue.test;

import java.io.File;
import java.util.Calendar;

public class HelloTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        String relativePath = File.separator + "uploads" + File.separator + calendar.get(Calendar.YEAR)+"_"+(calendar.get(Calendar.MONTH) + 1);
        System.out.println(relativePath);
        relativePath = File.separator + "uploads" + File.separator + calendar.get(Calendar.YEAR)+"_"+(calendar.get(Calendar.MONTH));
        System.out.println(relativePath);
    }

}
