package com.kunlunsoft.wxcp.mapper;

import com.kunlunsoft.wxcp.entity.House;

public interface THouseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_house
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_house
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int insert(House record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_house
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int insertSelective(House record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_house
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    House selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_house
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int updateByPrimaryKeySelective(House record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_house
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int updateByPrimaryKey(House record);
}