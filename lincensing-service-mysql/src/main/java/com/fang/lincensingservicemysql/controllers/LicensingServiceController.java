package com.fang.lincensingservicemysql.controllers;

import com.fang.lincensingservicemysql.model.License;
import com.fang.lincensingservicemysql.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LicensingServiceController {

    @Autowired
    private LicenseService licenseService;

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public List<License> getLicense(@PathVariable String id){
        return licenseService.getLicenses(id);
    }

    @RequestMapping(value = "/hello")
    public String getHello(){
        return "hello";
    }
}
