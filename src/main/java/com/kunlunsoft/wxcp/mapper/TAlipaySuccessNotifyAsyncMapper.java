package com.kunlunsoft.wxcp.mapper;

import com.kunlunsoft.wxcp.entity.AlipaySuccessNotifyAsync;

public interface TAlipaySuccessNotifyAsyncMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alipay_success_notify_async
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alipay_success_notify_async
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int insert(AlipaySuccessNotifyAsync record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alipay_success_notify_async
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int insertSelective(AlipaySuccessNotifyAsync record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alipay_success_notify_async
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    AlipaySuccessNotifyAsync selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alipay_success_notify_async
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int updateByPrimaryKeySelective(AlipaySuccessNotifyAsync record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_alipay_success_notify_async
     *
     * @mbg.generated Fri Sep 28 12:46:52 CST 2018
     */
    int updateByPrimaryKey(AlipaySuccessNotifyAsync record);
}