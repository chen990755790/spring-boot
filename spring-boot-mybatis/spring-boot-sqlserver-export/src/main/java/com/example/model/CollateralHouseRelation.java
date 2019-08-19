package com.example.model;


import com.example.util.DateUtil;

import java.util.Date;

public class CollateralHouseRelation extends Example{
    private Integer id;

    private String projectNo;

    private String loanNo;

    private String houseNo;

    private String relationUserType;

    private String relationUserTypeText;

    private String relationType;

    private String relationTypeText;

    private String relationUserName;

    private String relationUserCertificateType;

    private String relationUserCertificateTypeText;

    private String relationUserCertificateNo;

    private String companyAddress;

    private String telephone;

    private String homeAddress;
    private Date creationTime;
    private Date modifyTime;

    private String remark;

    private String createdUser;

    public String getCreationTimeString() {
        return DateUtil.formateDate(creationTime);
    }

    public String getModifyTimeString() {
        return DateUtil.formateDate(modifyTime);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo == null ? null : houseNo.trim();
    }

    public String getRelationUserType() {
        return relationUserType;
    }

    public void setRelationUserType(String relationUserType) {
        this.relationUserType = relationUserType == null ? null : relationUserType.trim();
    }

    public String getRelationUserTypeText() {
        return relationUserTypeText;
    }

    public void setRelationUserTypeText(String relationUserTypeText) {
        this.relationUserTypeText = relationUserTypeText == null ? null : relationUserTypeText.trim();
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType == null ? null : relationType.trim();
    }

    public String getRelationTypeText() {
        return relationTypeText;
    }

    public void setRelationTypeText(String relationTypeText) {
        this.relationTypeText = relationTypeText == null ? null : relationTypeText.trim();
    }

    public String getRelationUserName() {
        return relationUserName;
    }

    public void setRelationUserName(String relationUserName) {
        this.relationUserName = relationUserName == null ? null : relationUserName.trim();
    }

    public String getRelationUserCertificateType() {
        return relationUserCertificateType;
    }

    public void setRelationUserCertificateType(String relationUserCertificateType) {
        this.relationUserCertificateType = relationUserCertificateType == null ? null : relationUserCertificateType.trim();
    }

    public String getRelationUserCertificateTypeText() {
        return relationUserCertificateTypeText;
    }

    public void setRelationUserCertificateTypeText(String relationUserCertificateTypeText) {
        this.relationUserCertificateTypeText = relationUserCertificateTypeText == null ? null : relationUserCertificateTypeText.trim();
    }

    public String getRelationUserCertificateNo() {
        return relationUserCertificateNo;
    }

    public void setRelationUserCertificateNo(String relationUserCertificateNo) {
        this.relationUserCertificateNo = relationUserCertificateNo == null ? null : relationUserCertificateNo.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser == null ? null : createdUser.trim();
    }

    @Override
    public String toString() {
        return
                id +
                        "\001" + projectNo +
                        "\001" + loanNo +
                        "\001" + houseNo +
                        "\001" + relationUserType +
                        "\001" + relationUserTypeText +
                        "\001" + relationType +
                        "\001" + relationTypeText +
                        "\001" + relationUserName +
                        "\001" + relationUserCertificateType +
                        "\001" + relationUserCertificateTypeText +
                        "\001" + relationUserCertificateNo +
                        "\001" + companyAddress +
                        "\001" + telephone +
                        "\001" + homeAddress +
                        "\001" + this.getCreationTimeString() +
                        "\001" + this.getModifyTimeString() +
                        "\001" + remark +
                        "\001" + createdUser +
                        '\r';
    }
}