package com.alibaba.aecp.aecpsrvcenter.mapper.generated.aecpsrvcenter10000;
import model.aecpsrvcenter10000.CommonAccessLog;
import model.aecpsrvcenter10000.CommonAccessLogWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface CommonAccessLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.common_access_log
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.common_access_log
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    int insert(CommonAccessLogWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.common_access_log
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    int insertSelective(CommonAccessLogWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.common_access_log
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    CommonAccessLogWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.common_access_log
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    int updateByPrimaryKeySelective(CommonAccessLogWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.common_access_log
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(CommonAccessLogWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.common_access_log
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    int updateByPrimaryKey(CommonAccessLog record);

    List<CommonAccessLogWithBLOBs> findByAll(@Param("exceptionInfo") String exceptionInfo, @Param("extContext") String extContext, @Param("id") Long id, @Param("gmtCreate") Date gmtCreate, @Param("gmtModified") Date gmtModified, @Param("domainCode") String domainCode, @Param("tenantId") Long tenantId, @Param("creator") String creator, @Param("modifier") String modifier, @Param("isDeleted") String isDeleted, @Param("mdcExt") String mdcExt, @Param("logType") String logType, @Param("extranetIp") String extranetIp, @Param("queryString") String queryString, @Param("requestUri") String requestUri, @Param("userId") String userId, @Param("contentType") String contentType, @Param("accessDay") String accessDay, @Param("appCode") String appCode);

    List<CommonAccessLogWithBLOBs> findByLogTypeAndAccessDay(@Param("logType") String logType, @Param("accessDay") String accessDay);


}