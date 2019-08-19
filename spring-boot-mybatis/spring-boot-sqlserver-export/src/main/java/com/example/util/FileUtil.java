package com.example.util;

import java.util.Date;

public class FileUtil {

    public static final String FILE_SEPERATOR = ".";

    public static final String CHARACTER_SET = "UTF-8";

    public static final String PREFIX_FILE_NAME = "fam";

    public static final String SUFFIX_DATA_FILE_NAME = "f.dat";

    public static final String SUFFIX_CONTROL_FILE_NAME = "f.ctr";

    public static final String SEPARATOR_TAB = "\t";

    public static String getDataFileName(String tableName) {
        return PREFIX_FILE_NAME + FILE_SEPERATOR + tableName + FILE_SEPERATOR + getDate() + FILE_SEPERATOR
                + getBatchNum() + FILE_SEPERATOR + getRepeatNum() + FILE_SEPERATOR + getSuffixDataFileName();
    }

    public static String getControlFileName(String tableName) {
        return PREFIX_FILE_NAME + FILE_SEPERATOR + tableName + FILE_SEPERATOR + getDate() + FILE_SEPERATOR
                + getBatchNum() + FILE_SEPERATOR + getRepeatNum() + FILE_SEPERATOR + getSuffixControlFileName();
    }

    private static String getDate() {
        return DateUtil.formateDate(new Date());
    }

    private static String getBatchNum() {
        return "000";
    }

    private static String getRepeatNum() {
        return "00";
    }

    private static String getSuffixDataFileName() {
        return SUFFIX_DATA_FILE_NAME;
    }

    private static String getSuffixControlFileName() {
        return SUFFIX_CONTROL_FILE_NAME;
    }

}
