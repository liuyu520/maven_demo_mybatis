package com.kunlunsoft.wxcp.mapper;

import com.kunlunsoft.wxcp.entity.BusinessOrderItem;

public interface TBusinessOrderItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_business_order_item
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_business_order_item
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int insert(BusinessOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_business_order_item
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int insertSelective(BusinessOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_business_order_item
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    BusinessOrderItem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_business_order_item
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int updateByPrimaryKeySelective(BusinessOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_business_order_item
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int updateByPrimaryKey(BusinessOrderItem record);
}