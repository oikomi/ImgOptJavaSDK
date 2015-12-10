package com.baidu.uaq.imgopt.client;

import com.baidu.uaq.imgopt.config.ImgOptClientConfiguration;
import com.baidu.uaq.imgopt.http.ImgOptHttpClient;
import com.baidu.uaq.imgopt.resp.PutImgByUploadResponse;
import com.baidu.uaq.imgopt.resp.PutImgByUrlResponse;

/**
 * Created by miaohong01 on 15/12/10.
 */
public class ImgOptClient {
    private ImgOptClientConfiguration imgOptClientConfiguration;

    public ImgOptClient(ImgOptClientConfiguration imgOptClientConfiguration) {
        this.imgOptClientConfiguration = imgOptClientConfiguration;
    }

    public PutImgByUrlResponse putImgByUrl(String imgUrl) {
        // ImgOptHttpClient imgOptHttpClient = new ImgOptHttpClient();

        return null;
    }

    public PutImgByUploadResponse putImgByUpload(String imgFile) {


        return null;
    }


}
