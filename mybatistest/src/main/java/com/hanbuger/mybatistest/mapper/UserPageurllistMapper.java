package com.hanbuger.mybatistest.mapper;

import com.hanbuger.mybatistest.pojo.UserPageurllistExt;

public interface UserPageurllistMapper {

	UserPageurllistExt selectPageListById(int id);
}
