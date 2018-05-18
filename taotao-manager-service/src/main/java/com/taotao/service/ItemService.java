package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.Item;

/**
 * FileName:ItemService
 * Author:  ghw06
 * Date:    2018/5/16 10:17
 * Description:
 */
public interface ItemService {

    Item getItemById(Long itemId);

    EasyUIDataGridResult getItemList(int page, int rows);
}
