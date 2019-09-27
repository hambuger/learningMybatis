package com.hanbuger.mybatistest;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hanbuger.mybatistest.mapper.UserAccountMapper;
import com.hanbuger.mybatistest.mapper.UserPageurllistMapper;
import com.hanbuger.mybatistest.pojo.UserAccount;
import com.hanbuger.mybatistest.pojo.UserAccountExt;
import com.hanbuger.mybatistest.pojo.UserPageurllist;
import com.hanbuger.mybatistest.pojo.UserPageurllistExt;

/**
 * Unit test for simple App.
 */
public class AppTest {

	SqlSessionFactory sessionFactory;

	@Before
	public void before() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis/mybatisConf.xml");
		sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void test1() {
		SqlSession sqlSession = sessionFactory.openSession();
		UserAccountMapper mapper = sqlSession.getMapper(UserAccountMapper.class);
		UserAccount userAccount = mapper.queryByName("韩家宝");
		System.out.println(userAccount.getAccountName() + userAccount.getUserPwd());
	}

	@Test
	public void test2() {
		SqlSession sqlSession = sessionFactory.openSession();
		UserPageurllistMapper mapper = sqlSession.getMapper(UserPageurllistMapper.class);
		UserPageurllistExt userAccount = mapper.selectPageListById(2);
		System.out.println(userAccount.getAccountName() + userAccount.getPageName());
	}

	@Test
	public void test3() {
		SqlSession sqlSession = sessionFactory.openSession();
		UserAccountMapper mapper = sqlSession.getMapper(UserAccountMapper.class);
		UserAccountExt userAccountList = mapper.getPageListByName("青衣修罗");
		for (UserPageurllist user : userAccountList.getPageurllists()) {
			System.out.println(user);
		}
	}

	@Test
	public void test4() {
		SqlSession sqlSession = sessionFactory.openSession();
		UserAccountMapper mapper = sqlSession.getMapper(UserAccountMapper.class);
		PageHelper.startPage(1, 1);
		List<String> list = new ArrayList<String>();
		list.add("韩家宝");
		list.add("青衣修罗");
		List<UserAccount> userAccountList = mapper.queryByNameList(list);
		PageInfo<UserAccount> pageInfo = new PageInfo<UserAccount>(userAccountList);
		System.out.println(pageInfo);
		System.out.println(userAccountList);
		for (UserAccount user : userAccountList) {
			System.out.println(user);
		}
	}
}
