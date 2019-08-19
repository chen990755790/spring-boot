package com.example.model;

import com.example.util.DateUtil;

import java.util.Date;

public class LoanUserRelationship extends Example{
    private Integer userId;

    private String loanNo;

    private Integer projectId;

    private String userName;

    private String phoneNumber;

    private String relationTypeText;
    private Date createdTime;
    private Date modifedTime;

    private String createdUser;

    private String projectNo;

    private String loanName;

    private String remarks;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getRelationTypeText() {
        return relationTypeText;
    }

    public void setRelationTypeText(String relationTypeText) {
        this.relationTypeText = relationTypeText == null ? null : relationTypeText.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }
    public String getCreatedTimeString() {
        return DateUtil.formateDate(createdTime);
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifedTime() {
        return modifedTime;
    }

    public String getModifedTimeString() {
        return DateUtil.formateDate(modifedTime);
    }

    public void setModifedTime(Date modifedTime) {
        this.modifedTime = modifedTime;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser == null ? null : createdUser.trim();
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName == null ? null : loanName.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    @Override
    public String toString() {
        return
                userId +
                        "\001" + loanNo +
                        "\001" + projectId +
                        "\001" + userName +
                        "\001" + phoneNumber +
                        "\001" + relationTypeText +
                        "\001" + this.getCreatedTimeString() +
                        "\001" + this.getModifedTimeString() +
                        "\001" + createdUser +
                        "\001" + projectNo +
                        "\001" + loanName +
                        "\001" + remarks +
                        '\r';
    }
}