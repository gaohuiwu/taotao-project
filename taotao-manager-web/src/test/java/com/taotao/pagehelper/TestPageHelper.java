package com.taotao.pagehelper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.ItemMapper;
import com.taotao.pojo.Item;
import com.taotao.pojo.ItemExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * FileName:TestPageHelper
 * Author:  ghw06
 * Date:    2018/5/18 14:55
 * Description: 测试分页
 */
public class TestPageHelper {

    @Test
    public void testPageHelper() throws Exception {
        //1.获取mapper代理对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:spring/applicationContext-*.xml");
        ItemMapper itemMapper = applicationContext.getBean(ItemMapper.class);
        //2.设置分页
        PageHelper.startPage(1, 30);
        //3.执行查询
        ItemExample example = new ItemExample();
        List<Item> list = itemMapper.selectByExample(example);
        //4.取分页后结果
        PageInfo<Item> pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        System.out.println("total:" + total);
        int pages = pageInfo.getPages();
        System.out.println("pages:" + pages);
        int pageSize = pageInfo.getPageSize();
        System.out.println("pageSize:" + pageSize);

    }
}
