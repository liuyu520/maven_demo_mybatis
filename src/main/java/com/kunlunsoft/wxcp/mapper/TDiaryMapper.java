package com.kunlunsoft.wxcp.mapper;

import com.kunlunsoft.wxcp.entity.Diary;

public interface TDiaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_diary
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_diary
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int insert(Diary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_diary
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int insertSelective(Diary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_diary
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    Diary selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_diary
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int updateByPrimaryKeySelective(Diary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_diary
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Diary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_diary
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int updateByPrimaryKey(Diary record);
}