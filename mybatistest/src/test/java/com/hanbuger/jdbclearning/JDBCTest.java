package com.hanbuger.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCTest {

	@Test
	public void test() throws Exception {
		// 加载数据库连接驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/han","root","46asd5092");
		
		
		
		
		
	}

}
