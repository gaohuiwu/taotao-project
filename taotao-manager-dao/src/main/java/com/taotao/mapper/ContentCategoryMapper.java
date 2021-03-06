package com.taotao.mapper;

import com.taotao.pojo.ContentCategory;
import com.taotao.pojo.ContentCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContentCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int countByExample(ContentCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int deleteByExample(ContentCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int insert(ContentCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int insertSelective(ContentCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    List<ContentCategory> selectByExample(ContentCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    ContentCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int updateByExampleSelective(@Param("record") ContentCategory record, @Param("example") ContentCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int updateByExample(@Param("record") ContentCategory record, @Param("example") ContentCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int updateByPrimaryKeySelective(ContentCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_content_category
     *
     * @mbggenerated Wed May 16 09:00:37 CST 2018
     */
    int updateByPrimaryKey(ContentCategory record);
}