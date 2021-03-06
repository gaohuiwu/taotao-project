package com.taotao.controller;

import com.taotao.common.pojo.PictureResult;
import com.taotao.common.utils.JsonUtils;
import com.taotao.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * FileName:PictureController
 * Author:  ghw06
 * Date:    2018/5/22 21:32
 * Description: 图片上传控制器
 */
@Controller
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping("/pic/upload")
    @ResponseBody
    public String uploadFile(MultipartFile uploadFile) {

        PictureResult result = pictureService.uploadPic(uploadFile);
        //需要把java对象手工转成String   解决兼容性问题
        return JsonUtils.objectToJson(result);
    }
}
