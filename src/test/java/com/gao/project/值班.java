package com.gao.project;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class 值班 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = simpleDateFormat.parse("2020-06-26");
            System.out.println(simpleDateFormat.format(date));
            for (int i=0; i < 30; i++) {
                long time = date.getTime();
                time = time + 86400 * 23 * 1000;
                date = new Date(time);
                System.out.println(simpleDateFormat.format(date));
            }
        }catch (Exception e){

        }
    }
}
