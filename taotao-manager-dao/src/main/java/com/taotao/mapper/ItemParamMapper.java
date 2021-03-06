package com.taotao.mapper;

import com.taotao.pojo.ItemParam;
import com.taotao.pojo.ItemParamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemParamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int countByExample(ItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int deleteByExample(ItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int insert(ItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int insertSelective(ItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    List<ItemParam> selectByExampleWithBLOBs(ItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    List<ItemParam> selectByExample(ItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    ItemParam selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int updateByExampleSelective(@Param("record") ItemParam record, @Param("example") ItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") ItemParam record, @Param("example") ItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int updateByExample(@Param("record") ItemParam record, @Param("example") ItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int updateByPrimaryKeySelective(ItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int updateByPrimaryKey(ItemParam record);
}