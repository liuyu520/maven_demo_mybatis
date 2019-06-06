package com.alibaba.aecp.aecpsrvcenter.mapper.generated.aecpsrvcenter10000;
import model.aecpsrvcenter10000.MainAppGlobalVersionMgmt;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface MainAppGlobalVersionMgmtMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.main_app_global_version_mgmt
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.main_app_global_version_mgmt
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    int insert(MainAppGlobalVersionMgmt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.main_app_global_version_mgmt
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    int insertSelective(MainAppGlobalVersionMgmt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.main_app_global_version_mgmt
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    MainAppGlobalVersionMgmt selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.main_app_global_version_mgmt
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    int updateByPrimaryKeySelective(MainAppGlobalVersionMgmt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.main_app_global_version_mgmt
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    int updateByPrimaryKey(MainAppGlobalVersionMgmt record);

    List<MainAppGlobalVersionMgmt> findByAll(@Param("id") Long id, @Param("gmtCreate") Date gmtCreate, @Param("gmtModified") Date gmtModified, @Param("domainCode") String domainCode, @Param("tenantId") Long tenantId, @Param("creator") String creator, @Param("modifier") String modifier, @Param("isDeleted") String isDeleted, @Param("mdcExt") String mdcExt, @Param("envUuid") String envUuid, @Param("version") Long version, @Param("status") String status, @Param("publishTime") Date publishTime, @Param("appCode") String appCode);

    List<MainAppGlobalVersionMgmt> findByAppCodeAndEnvUuidAndStatusAndIsDeleted(@Param("appCode") String appCode, @Param("envUuid") String envUuid, @Param("status") String status, @Param("isDeleted") String isDeleted);


}