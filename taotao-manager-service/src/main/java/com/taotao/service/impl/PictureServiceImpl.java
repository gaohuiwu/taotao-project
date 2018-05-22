package com.taotao.service.impl;

import com.taotao.common.pojo.PictureResult;
import com.taotao.common.utils.FastDFSClient;
import com.taotao.service.PictureService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * FileName:PictureServiceImpl
 * Author:  ghw06
 * Date:    2018/5/22 17:41
 * Description:
 */
@Service
public class PictureServiceImpl implements PictureService {

    @Value("${IMAGE_SERVER_BASE_URL}")
    private String IMAGE_SERVER_BASE_URL;

    @Override
    public PictureResult uploadPic(MultipartFile picFile) {
        PictureResult result = new PictureResult();
        //判断图片是否为空
        if (picFile.isEmpty()) {
            result.setError(1);
            result.setMessage("图片为空");
            return result;
        }
        //上传到图片服务器
        try {
            //取图片的拓宽名(图片类型)
            String originalFilename = picFile.getOriginalFilename();
            String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
            FastDFSClient client = new FastDFSClient("classpath:properties/client.conf");
            String url = client.uploadFile(picFile.getBytes(), extName);
            //需要拼接图片服务器的IP地址
            url = IMAGE_SERVER_BASE_URL + url;
            //把url返回给客户端
            result.setError(0);
            result.setUrl(url);
        } catch (Exception e) {
            e.printStackTrace();
            result.setError(1);
            result.setMessage("图片上传失败");
        }
        return result;
    }
}
