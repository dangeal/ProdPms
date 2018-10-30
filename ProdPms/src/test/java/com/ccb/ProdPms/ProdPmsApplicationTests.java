package com.ccb.ProdPms;

import com.ccb.ProdPms.controller.DmdManageController;
import com.ccb.ProdPms.entity.DmdItemEntity;
import com.ccb.ProdPms.mapper.DmdManageMapper;
import com.ccb.ProdPms.service.impl.DmdManageServiceImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProdPmsApplicationTests {

	@Autowired
	DataSource dataSource;
	@Autowired
	DmdManageController dmdManageController;
	@Autowired
	DmdManageServiceImpl dmdManageServiceImpl;
	@Autowired
	DmdManageMapper dmdManageMapper;

	/*
	 * @Test public void contextLoads() throws SQLException {
	 * System.out.println("################" + dataSource.getClass()); // class
	 * com.alibaba.druid.pool.DruidDataSource Connection connection =
	 * dataSource.getConnection(); System.out.println("@@@@@@@@@@@@@@@@@" +
	 * connection); // com.mysql.jdbc.JDBC4Connection@36681447 connection.close(); }
	 */
	@Test
	public void HN() {
		// dmdManageController.getReqNo();
		// int count = dmdManageMapper.getLastId();
		// System.out.println("@@@@@@@@@@@@@@@@@"+count);
		// System.out.println("@@@@@@@@@@@@@@@@@" + dmdManageController.getReqNo());
		DmdItemEntity dmdItemEntity = new DmdItemEntity("PR2018103003", "描述", "YH", "需求项1", "开发任务1", "未上线", new Date(), new Date(), null, 0);
		

		dmdManageController.addReqItem(dmdItemEntity);
	}
}
