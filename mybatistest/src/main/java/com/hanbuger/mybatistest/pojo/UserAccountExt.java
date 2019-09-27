package com.hanbuger.mybatistest.pojo;

import java.util.List;

public class UserAccountExt extends UserAccount {

	private List<UserPageurllist> pageurllists;

	public List<UserPageurllist> getPageurllists() {
		return pageurllists;
	}

	public void setPageurllists(List<UserPageurllist> pageurllists) {
		this.pageurllists = pageurllists;
	}

}
