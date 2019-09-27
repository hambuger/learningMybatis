package com.hanbuger.mybatistest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hanbuger.mybatistest.pojo.UserAccount;
import com.hanbuger.mybatistest.pojo.UserAccountExt;

public interface UserAccountMapper {

	@Select(value = "select * from USER_ACCOUNT where ACCOUNT_NAME = '${name}'")
	UserAccount queryByName(String name);

	UserAccountExt getPageListByName(String name);

	List<UserAccount> queryByNameList(List<String> nameList);
}
