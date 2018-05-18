package com.taotao.service;

import com.taotao.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 * FileName:ItemCatService
 * Author:  ghw06
 * Date:    2018/5/18 17:09
 * Description:
 */
public interface ItemCatService {

    List<EasyUITreeNode> getItemCatList(long parentId);
}
