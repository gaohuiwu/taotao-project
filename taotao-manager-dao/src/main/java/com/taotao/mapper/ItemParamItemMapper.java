package com.taotao.mapper;

import com.taotao.pojo.ItemParamItem;
import com.taotao.pojo.ItemParamItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemParamItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int countByExample(ItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int deleteByExample(ItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int insert(ItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int insertSelective(ItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    List<ItemParamItem> selectByExampleWithBLOBs(ItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    List<ItemParamItem> selectByExample(ItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    ItemParamItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int updateByExampleSelective(@Param("record") ItemParamItem record, @Param("example") ItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") ItemParamItem record, @Param("example") ItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int updateByExample(@Param("record") ItemParamItem record, @Param("example") ItemParamItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int updateByPrimaryKeySelective(ItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ItemParamItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param_item
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int updateByPrimaryKey(ItemParamItem record);
}