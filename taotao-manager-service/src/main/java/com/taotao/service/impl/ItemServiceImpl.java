package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.mapper.ItemMapper;
import com.taotao.pojo.Item;
import com.taotao.pojo.ItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * FileName:ItemServiceImpl
 * Author:  ghw06
 * Date:    2018/5/16 10:19
 * Description: 商品查询Service
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public Item getItemById(Long itemId) {
        ItemExample example = new ItemExample();
        //创建查询条件
        ItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(itemId);
        List<Item> list = itemMapper.selectByExample(example);
        //判断list是否为空
        Item item = null;
        if (list != null & list.size() > 0) {
            item = list.get(0);
        }
        return item;
    }

    @Override
    public EasyUIDataGridResult getItemList(int page, int rows) {
        //分页处理
        PageHelper.startPage(page, rows);
        //执行查询
        ItemExample example = new ItemExample();
        List<Item> list = itemMapper.selectByExample(example);
        //取分页信息
        PageInfo<Item> pageInfo = new PageInfo<>(list);
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(list);

        return result;
    }
}
