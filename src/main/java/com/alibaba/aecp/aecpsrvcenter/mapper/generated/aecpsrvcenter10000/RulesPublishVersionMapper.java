package com.alibaba.aecp.aecpsrvcenter.mapper.generated.aecpsrvcenter10000;

import model.aecpsrvcenter10000.RulesPublishVersion;

public interface RulesPublishVersionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.rules_publish_version
     *
     * @mbg.generated Thu Jun 13 14:32:41 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.rules_publish_version
     *
     * @mbg.generated Thu Jun 13 14:32:41 CST 2019
     */
    int insert(RulesPublishVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.rules_publish_version
     *
     * @mbg.generated Thu Jun 13 14:32:41 CST 2019
     */
    int insertSelective(RulesPublishVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.rules_publish_version
     *
     * @mbg.generated Thu Jun 13 14:32:41 CST 2019
     */
    RulesPublishVersion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.rules_publish_version
     *
     * @mbg.generated Thu Jun 13 14:32:41 CST 2019
     */
    int updateByPrimaryKeySelective(RulesPublishVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.rules_publish_version
     *
     * @mbg.generated Thu Jun 13 14:32:41 CST 2019
     */
    int updateByPrimaryKey(RulesPublishVersion record);
}