package com.taotao.service.impl;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.mapper.ItemCatMapper;
import com.taotao.pojo.ItemCat;
import com.taotao.pojo.ItemCatExample;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName:ItemCatServiceImpl
 * Author:  ghw06
 * Date:    2018/5/18 17:10
 * Description:商品分类管理Service
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private ItemCatMapper itemCatMapper;

    @Override
    public List<EasyUITreeNode> getItemCatList(long parentId) {
        //根据id查询分类列表
        ItemCatExample example = new ItemCatExample();
        //设置查询条件
        ItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<ItemCat> list = itemCatMapper.selectByExample(example);
        //转换成EasyUITreeNode列表
        List<EasyUITreeNode> resultList = new ArrayList<>();
        for (ItemCat itemCat : list) {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(itemCat.getId());
            node.setText(itemCat.getName());
            node.setState(itemCat.getIsParent() ? "closed" : "open");
            //添加到列表中
            resultList.add(node);
        }
        return resultList;
    }
}
