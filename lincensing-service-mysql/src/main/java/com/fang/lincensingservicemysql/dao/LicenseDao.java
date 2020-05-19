package com.fang.lincensingservicemysql.dao;

import com.fang.lincensingservicemysql.model.License;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 使用@Param传参数
 */
@Repository
public interface LicenseDao {
    List<License> findByOrganizationId(@Param("organizationId") String organizationId);
    License findByOrganizationIdAndLicenseId(@Param("organizationId") String organizationId,@Param("licenseId") String licenseId);
}
