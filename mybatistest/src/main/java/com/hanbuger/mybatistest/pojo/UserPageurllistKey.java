package com.hanbuger.mybatistest.pojo;

public class UserPageurllistKey {
    private Integer id;

    private String accountName;

    private String pagepartName;

    private String pageName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getPagepartName() {
        return pagepartName;
    }

    public void setPagepartName(String pagepartName) {
        this.pagepartName = pagepartName == null ? null : pagepartName.trim();
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName == null ? null : pageName.trim();
    }
}