package com.example.file.ftp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ftp {
    @Value("${ipAddr}")
    private String ipAddr;//ip地址
    @Value("${port}")
    private Integer port;//端口号
    @Value("${userName}")
    private String userName;//用户名
    @Value("${pwd}")
    private String pwd;//密码
    @Value("${path}")
    private String path;//aaa路径

    public String getIpAddr() {
        return ipAddr;
    }

    public Integer getPort() {
        return port;
    }

    public String getUserName() {
        return userName;
    }

    public String getPwd() {
        return pwd;
    }

    public String getPath() {
        return path;
    }
}
