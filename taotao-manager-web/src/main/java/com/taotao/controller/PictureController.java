package com.taotao.controller;

import com.taotao.common.pojo.PictureResult;
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
    public PictureResult uploadFile(MultipartFile uploadFile) {
        return pictureService.uploadPic(uploadFile);
    }
}
