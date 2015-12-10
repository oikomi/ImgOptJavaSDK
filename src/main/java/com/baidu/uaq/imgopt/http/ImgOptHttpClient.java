package com.baidu.uaq.imgopt.http;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;


/**
 * Created by miaohong01 on 15/12/10.
 */
public class ImgOptHttpClient {
    private String url;
    private int timeout;

    public void doPost() {
        CloseableHttpClient httpclient = HttpClients.createDefault();

        HttpPost httppost = new HttpPost(this.url);

    }


}
