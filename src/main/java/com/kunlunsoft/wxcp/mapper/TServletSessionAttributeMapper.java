package com.kunlunsoft.wxcp.mapper;

import com.kunlunsoft.wxcp.entity.ServletSessionAttribute;

public interface TServletSessionAttributeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_servlet_session_attribute
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_servlet_session_attribute
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int insert(ServletSessionAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_servlet_session_attribute
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int insertSelective(ServletSessionAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_servlet_session_attribute
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    ServletSessionAttribute selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_servlet_session_attribute
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int updateByPrimaryKeySelective(ServletSessionAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_servlet_session_attribute
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int updateByPrimaryKey(ServletSessionAttribute record);
}