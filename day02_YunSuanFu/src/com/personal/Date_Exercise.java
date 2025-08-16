package com.personal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Date_Exercise {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("当前日期："+today);

        LocalDate nationDate = LocalDate.of(2025,05,1);
        System.out.println("劳动节："+nationDate);

        LocalDate tomorrw = today.plusDays(1);
        LocalDate nextMonth = today.plusMonths(1);
        LocalDate nextYear = today.plusYears(1);

        System.out.print("明天："+tomorrw+'\n'+"下个月："+nextMonth+'\n'+"明年今天："+nextYear+'\n');

        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("东京时间："+zdt);
        Instant now = Instant.now();
        System.out.println(now);
    }
}
