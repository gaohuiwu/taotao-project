package com.taotao.fastdfs;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

/**
 * FileName:FastdfsTest
 * Author:  ghw06
 * Date:    2018/5/22 9:55
 * Description: 测试图片上传
 */
public class FastdfsTest {

    @Test
    public void testUpload() throws Exception {
        //1.把fastDFS提供的jar包添加到工程中；
        //2.初始化全局配置。加载一个配置文件；
        ClientGlobal.init("E:\\Project\\taotao-project\\" +
                "taotao-manager-web\\src\\main\\resources\\properties\\client.conf");
        //3.创建一个TarckerClient对象；
        TrackerClient trackerClient = new TrackerClient();
        //4.创建一个TrackerServer对象；
        TrackerServer trackerServer = trackerClient.getConnection();
        //5.声明一个StorageServer对象，null；
        StorageServer storageServer = null;
        //6.获得StorageClient对象；
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        //7.直接调用StorageClient对象的上传方法上传即可。
        String[] strings = storageClient.upload_file("" +
                "G:\\140-150924095020.jpg", "jpg", null);
        for (String str : strings) {
            System.out.println(str);
        }
    }

    @Test
    public void testFastDFSClient() throws Exception {
        FastDFSClient client = new FastDFSClient("E:\\Project\\taotao-project\\" +
                "taotao-manager-web\\src\\main\\resources\\properties\\client.conf");
        String str = client.uploadFile("G:\\mmexport1511063607015.jpg", "jpg");
        System.out.println(str);
    }
}
