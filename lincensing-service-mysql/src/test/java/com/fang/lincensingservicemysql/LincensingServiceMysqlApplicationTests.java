package com.fang.lincensingservicemysql;


import com.fang.lincensingservicemysql.dao.LicenseDao;
import com.fang.lincensingservicemysql.service.LicenseService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.fang.lincensingservicemysql.dao")
public class LincensingServiceMysqlApplicationTests {
	@Autowired
	private DataSource dataSource;
	@Autowired
	private LicenseService licenseService;

	@Before
	public void contextLoads() {

	}


	@Test
	public void testLicenseService() throws SQLException {
		System.out.println("-----------------dataSource:"+this.dataSource);
		//licenseService.findByOrganizationId("442adb6e-fa58-47f3-9ca2-ed1fecdfe86c");
	}
}
