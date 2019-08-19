package com.example.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static final String DATE_PATTERN = "yyyyMMdd";

    public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    private static final ThreadLocal<SimpleDateFormat> dateFormat = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat(DATE_PATTERN);
        }

    };

    public static String formateDate(Date date) {
        if (date == null) return "";
        return dateFormat.get().format(date);
    }

    public static String formateDate(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }
}
