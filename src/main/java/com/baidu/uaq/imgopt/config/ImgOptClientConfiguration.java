package com.baidu.uaq.imgopt.config;

/**
 * Created by miaohong01 on 15/12/10.
 */
public class ImgOptClientConfiguration {
    private String host;
    private String quality = "70%";
    private String accessKey;
    private String secretKey;

    public ImgOptClientConfiguration() {
        
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

}
