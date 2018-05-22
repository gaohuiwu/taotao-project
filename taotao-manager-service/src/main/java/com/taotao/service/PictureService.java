package com.taotao.service;

import com.taotao.common.pojo.PictureResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * FileName:PictureService
 * Author:  ghw06
 * Date:    2018/5/22 17:39
 * Description: 图片上传
 */
public interface PictureService {

    PictureResult uploadPic(MultipartFile picFile);
}
