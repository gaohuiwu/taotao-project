package com.taotao.common.utils;

import java.util.Random;

/**
 * FileName:IdUtil
 * Author:  ghw06
 * Date:    2018/5/23 17:01
 * Description: 生成id的工具类
 */
public class IdUtil {
    /**
     * 商品id生成
     * id格式：毫秒数+2位随机数(随机数不足两位，补零)
     *
     * @return 商品id
     */
    public static long getItemId() {
        long currentTimeMillis = System.currentTimeMillis();

        Random random = new Random();
        int end = random.nextInt(99);
        String str = currentTimeMillis + String.format("%02d", end);
        Long id = new Long(str);
        return id;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(getItemId());
        }
    }
}
