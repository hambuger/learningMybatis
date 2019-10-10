package com.hanbuger.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;

import com.mysql.jdbc.Driver;

public class JDBCTest {

	@Test
	public void test1() throws Exception {
		// 加载数据库连接驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 创建数据库连接
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/han?serverTimezone=UTC",
				"root", "test");
		connection.setAutoCommit(false);
		// 创建执行sql的语句statement
		String sql = "select * from user_account where account_name <> ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		// 执行sql语句
		statement.setString(1, "青衣修罗");
		ResultSet resultSet = statement.executeQuery();
		// 处理执行结果
		while (resultSet.next()) {
			System.out.println(resultSet.getObject("account_name") + resultSet.getString("phone_no"));
		}
		String dmlSql = "update user_account set phone_no = ? where account_name = ?";
		PreparedStatement dmlSqlstatement = connection.prepareStatement(dmlSql);
		dmlSqlstatement.setString(1, "53333s");
		dmlSqlstatement.setString(2, "测试");
		dmlSqlstatement.executeUpdate();
		connection.commit();
		// 数据库连接非常消耗资源，尽量晚创建，早释放
		try {
			if (resultSet != null) {
				resultSet.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@Test
	public void test2() throws SQLException {
		Driver mysqlDriver = new Driver();
		Properties properties = new Properties();
		properties.put("user", "root");
		properties.put("password", "test");
		Connection connection = mysqlDriver.connect("jdbc:mysql://localhost:3306/han?serverTimezone=UTC", properties);
		String sql = "select * from user_account where account_name <> ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		// 执行sql语句
		statement.setString(1, "青衣修罗");
		ResultSet resultSet = statement.executeQuery();
		// 处理执行结果
		while (resultSet.next()) {
			System.out.println(resultSet.getObject("account_name") + resultSet.getString("phone_no"));
		}
		// 数据库连接非常消耗资源，尽量晚创建，早释放
		try {
			if (resultSet != null) {
				resultSet.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
