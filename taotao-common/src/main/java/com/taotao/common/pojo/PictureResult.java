package com.taotao.common.pojo;

/**
 * FileName:PictureResult
 * Author:  ghw06
 * Date:    2018/5/22 17:07
 * Description: 图片上传的返回格式
 */
public class PictureResult {

    private int error;
    private String url;
    private String message;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
