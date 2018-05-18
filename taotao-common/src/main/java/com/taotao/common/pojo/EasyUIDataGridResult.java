package com.taotao.common.pojo;

import java.util.List;

/**
 * FileName:EasyUIDataGridResult
 * Author:  ghw06
 * Date:    2018/5/18 15:48
 * Description: easyui框架的datagrid的响应数据体
 */
public class EasyUIDataGridResult {

    //总记录数
    private long total;
    //返回数据
    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
