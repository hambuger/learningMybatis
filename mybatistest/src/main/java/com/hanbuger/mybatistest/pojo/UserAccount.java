package com.hanbuger.mybatistest.pojo;

import java.util.Date;

public class UserAccount {
	private String accountName;

	private String userPwd;

	private String accountStatus;

	private String phoneNo;

	private Date createDate;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName == null ? null : accountName.trim();
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd == null ? null : userPwd.trim();
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus == null ? null : accountStatus.trim();
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo == null ? null : phoneNo.trim();
	}

	@Override
	public String toString() {
		return "UserAccount [accountName=" + accountName + ", userPwd=" + userPwd + ", accountStatus=" + accountStatus
				+ ", phoneNo=" + phoneNo + ", createDate=" + createDate + "]";
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}