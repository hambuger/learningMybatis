package com.hanbuger.mybatistest.pojo;

import java.util.Date;

public class UserPageurllist extends UserPageurllistKey {
	private String pageUrl;

	private String pageStatus;

	private Date createDate;

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl == null ? null : pageUrl.trim();
	}

	public String getPageStatus() {
		return pageStatus;
	}

	public void setPageStatus(String pageStatus) {
		this.pageStatus = pageStatus == null ? null : pageStatus.trim();
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "UserPageurllist [pageUrl=" + pageUrl + ", pageStatus=" + pageStatus + ", createDate=" + createDate
				+ ", getPageUrl()=" + getPageUrl() + ", getPageStatus()=" + getPageStatus() + ", getCreateDate()="
				+ getCreateDate() + ", getId()=" + getId() + ", getAccountName()=" + getAccountName()
				+ ", getPagepartName()=" + getPagepartName() + ", getPageName()=" + getPageName() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}