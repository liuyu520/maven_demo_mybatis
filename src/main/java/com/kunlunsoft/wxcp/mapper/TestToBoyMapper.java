package com.kunlunsoft.wxcp.mapper;

import com.kunlunsoft.wxcp.entity.TestToBoy;

import java.util.List;

public interface TestToBoyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_to_boy
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_to_boy
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int insert(TestToBoy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_to_boy
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int insertSelective(TestToBoy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_to_boy
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    TestToBoy selectByPrimaryKey(Integer id);

    List<TestToBoy> find(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_to_boy
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int updateByPrimaryKeySelective(TestToBoy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_to_boy
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(TestToBoy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_to_boy
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int updateByPrimaryKey(TestToBoy record);
}