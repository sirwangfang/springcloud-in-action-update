package com.wangfang.licensingservice.controllers;

import com.wangfang.licensingservice.config.ConfigService;
import com.wangfang.licensingservice.model.License;
import com.wangfang.licensingservice.services.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="v1/organizations/{organizationId}/licenses")
public class LicensingServiceController {
    @Autowired
    private LicenseService licenseService;

    @Autowired
    private ConfigService serviceConfig;

    @RequestMapping(value="/",method = RequestMethod.GET)
    public List<License> getLicenses(@PathVariable("organizationId") String organizationId) {

        return licenseService.getLicensesByOrg(organizationId);
    }

    @RequestMapping(value="/{licenseId}",method = RequestMethod.GET)
    public License getLicenses( @PathVariable("organizationId") String organizationId,
                                @PathVariable("licenseId") String licenseId) {

        return licenseService.getLicense(organizationId,licenseId);
    }

    @RequestMapping(value="{licenseId}",method = RequestMethod.PUT)
    public String updateLicenses( @PathVariable("licenseId") String licenseId) {
        return String.format("This is the put");
    }

    @RequestMapping(value="{licenseId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteLicenses( @PathVariable("licenseId") String licenseId) {
        return String.format("This is the Delete");
    }
}