package com.fang.lincensingservicemysql.service;

import com.fang.lincensingservicemysql.dao.LicenseDao;
import com.fang.lincensingservicemysql.model.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenseService {
    @Autowired
    private LicenseDao licenseDao;

    public List<License> getLicenses(String organizationId){
       return licenseDao.findByOrganizationId(organizationId);
    }
}
