package com.example.file;

public class FileExportException extends RuntimeException {

    public FileExportException(){}

    public FileExportException(String msg){
        super(msg);
    }
    public FileExportException(String msg,Throwable e) {
        super(msg,e);
    }
}
