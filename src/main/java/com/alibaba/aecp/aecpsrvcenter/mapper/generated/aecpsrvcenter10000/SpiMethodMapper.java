package com.alibaba.aecp.aecpsrvcenter.mapper.generated.aecpsrvcenter10000;
import model.aecpsrvcenter10000.SpiMethod;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface SpiMethodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.spi_method
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.spi_method
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    int insert(SpiMethod record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.spi_method
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    int insertSelective(SpiMethod record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.spi_method
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    SpiMethod selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.spi_method
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    int updateByPrimaryKeySelective(SpiMethod record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aecpsrvcenter10000.spi_method
     *
     * @mbg.generated Thu Jun 06 11:32:10 CST 2019
     */
    int updateByPrimaryKey(SpiMethod record);

    int deleteByAppCodeAndEnvUuidAndIsDeletedAndStatus(@Param("appCode") String appCode, @Param("envUuid") String envUuid, @Param("isDeleted") String isDeleted, @Param("status") String status);

    int deleteByAppCodeAndEnvUuidAndIsDeletedAndStatusAndInterfaceUuid(@Param("appCode") String appCode, @Param("envUuid") String envUuid, @Param("isDeleted") String isDeleted, @Param("status") String status, @Param("interfaceUuid") String interfaceUuid);

    List<Long> selectIdByInterfaceUuidAndAppCode(@Param("interfaceUuid") String interfaceUuid, @Param("appCode") String appCode);

    List<SpiMethod> findByAll(@Param("id") Long id, @Param("gmtCreate") Date gmtCreate, @Param("gmtModified") Date gmtModified, @Param("domainCode") String domainCode, @Param("tenantId") Long tenantId, @Param("creator") String creator, @Param("modifier") String modifier, @Param("isDeleted") String isDeleted, @Param("mdcExt") String mdcExt, @Param("name") String name, @Param("metaDataUuid") String metaDataUuid, @Param("methodName") String methodName, @Param("description") String description, @Param("inParams") String inParams, @Param("version") Long version, @Param("uuid") String uuid, @Param("bizTypeUuid") String bizTypeUuid, @Param("appCode") String appCode, @Param("status") String status, @Param("interfaceUuid") String interfaceUuid, @Param("changeId") String changeId, @Param("envUuid") String envUuid, @Param("outParams") String outParams);

    SpiMethod findFirstByName(@Param("name") String name);

    Long countNameByName(@Param("name") String name);

    Long countNameByAppCode(@Param("appCode") String appCode);


}