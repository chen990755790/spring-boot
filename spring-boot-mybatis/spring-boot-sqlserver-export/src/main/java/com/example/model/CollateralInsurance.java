package com.example.model;


import com.example.util.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class CollateralInsurance extends Example{
    private String id;

    private String projectNo;

    private String loanNo;

    private String policyNumber;

    private String policyType;

    private String policyTypeText;

    private String collertalModel;

    private String collertalModelText;

    private String applicantName;

    private String applicantCertificateType;

    private String applicantCertificateTypeText;

    private String applicantCertificateNo;

    private String applicantCertificatePhone;

    private String insuredName;

    private String insuredCertificateType;

    private String insuredCertificateTypeText;

    private String insuredCertificateNo;

    private String insuranceType;

    private String insuranceTypeText;

    private BigDecimal premiumAmount;
    private Date insuranceBeginDate;
    private Date insuranceEndDate;

    private String premiumCompanyName;

    private String premiumIntermediaryName;

    private String specialAgreementContent;

    private String remarks;
    private Date creationTime;
    private Date modifyTime;

    private String createdUser;

    public String getInsuranceBeginDateString() {
        return DateUtil.formateDate(insuranceBeginDate);
    }

    public String getInsuranceEndDateString() {
        return DateUtil.formateDate(insuranceEndDate);
    }

    public String getCreationTimeString() {
        return DateUtil.formateDate(creationTime);
    }

    public String getModifyTimeString() {
        return DateUtil.formateDate(modifyTime);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber == null ? null : policyNumber.trim();
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType == null ? null : policyType.trim();
    }

    public String getPolicyTypeText() {
        return policyTypeText;
    }

    public void setPolicyTypeText(String policyTypeText) {
        this.policyTypeText = policyTypeText == null ? null : policyTypeText.trim();
    }

    public String getCollertalModel() {
        return collertalModel;
    }

    public void setCollertalModel(String collertalModel) {
        this.collertalModel = collertalModel == null ? null : collertalModel.trim();
    }

    public String getCollertalModelText() {
        return collertalModelText;
    }

    public void setCollertalModelText(String collertalModelText) {
        this.collertalModelText = collertalModelText == null ? null : collertalModelText.trim();
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName == null ? null : applicantName.trim();
    }

    public String getApplicantCertificateType() {
        return applicantCertificateType;
    }

    public void setApplicantCertificateType(String applicantCertificateType) {
        this.applicantCertificateType = applicantCertificateType == null ? null : applicantCertificateType.trim();
    }

    public String getApplicantCertificateTypeText() {
        return applicantCertificateTypeText;
    }

    public void setApplicantCertificateTypeText(String applicantCertificateTypeText) {
        this.applicantCertificateTypeText = applicantCertificateTypeText == null ? null : applicantCertificateTypeText.trim();
    }

    public String getApplicantCertificateNo() {
        return applicantCertificateNo;
    }

    public void setApplicantCertificateNo(String applicantCertificateNo) {
        this.applicantCertificateNo = applicantCertificateNo == null ? null : applicantCertificateNo.trim();
    }

    public String getApplicantCertificatePhone() {
        return applicantCertificatePhone;
    }

    public void setApplicantCertificatePhone(String applicantCertificatePhone) {
        this.applicantCertificatePhone = applicantCertificatePhone == null ? null : applicantCertificatePhone.trim();
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName == null ? null : insuredName.trim();
    }

    public String getInsuredCertificateType() {
        return insuredCertificateType;
    }

    public void setInsuredCertificateType(String insuredCertificateType) {
        this.insuredCertificateType = insuredCertificateType == null ? null : insuredCertificateType.trim();
    }

    public String getInsuredCertificateTypeText() {
        return insuredCertificateTypeText;
    }

    public void setInsuredCertificateTypeText(String insuredCertificateTypeText) {
        this.insuredCertificateTypeText = insuredCertificateTypeText == null ? null : insuredCertificateTypeText.trim();
    }

    public String getInsuredCertificateNo() {
        return insuredCertificateNo;
    }

    public void setInsuredCertificateNo(String insuredCertificateNo) {
        this.insuredCertificateNo = insuredCertificateNo == null ? null : insuredCertificateNo.trim();
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType == null ? null : insuranceType.trim();
    }

    public String getInsuranceTypeText() {
        return insuranceTypeText;
    }

    public void setInsuranceTypeText(String insuranceTypeText) {
        this.insuranceTypeText = insuranceTypeText == null ? null : insuranceTypeText.trim();
    }

    public BigDecimal getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(BigDecimal premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public Date getInsuranceBeginDate() {
        return insuranceBeginDate;
    }

    public void setInsuranceBeginDate(Date insuranceBeginDate) {
        this.insuranceBeginDate = insuranceBeginDate;
    }

    public Date getInsuranceEndDate() {
        return insuranceEndDate;
    }

    public void setInsuranceEndDate(Date insuranceEndDate) {
        this.insuranceEndDate = insuranceEndDate;
    }

    public String getPremiumCompanyName() {
        return premiumCompanyName;
    }

    public void setPremiumCompanyName(String premiumCompanyName) {
        this.premiumCompanyName = premiumCompanyName == null ? null : premiumCompanyName.trim();
    }

    public String getPremiumIntermediaryName() {
        return premiumIntermediaryName;
    }

    public void setPremiumIntermediaryName(String premiumIntermediaryName) {
        this.premiumIntermediaryName = premiumIntermediaryName == null ? null : premiumIntermediaryName.trim();
    }

    public String getSpecialAgreementContent() {
        return specialAgreementContent;
    }

    public void setSpecialAgreementContent(String specialAgreementContent) {
        this.specialAgreementContent = specialAgreementContent == null ? null : specialAgreementContent.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
                        "\001" + policyNumber +
                        "\001" + policyType +
                        "\001" + policyTypeText +
                        "\001" + collertalModel +
                        "\001" + collertalModelText +
                        "\001" + applicantName +
                        "\001" + applicantCertificateType +
                        "\001" + applicantCertificateTypeText +
                        "\001" + applicantCertificateNo +
                        "\001" + applicantCertificatePhone +
                        "\001" + insuredName +
                        "\001" + insuredCertificateType +
                        "\001" + insuredCertificateTypeText +
                        "\001" + insuredCertificateNo +
                        "\001" + insuranceType +
                        "\001" + insuranceTypeText +
                        "\001" + premiumAmount +
                        "\001" + this.getInsuranceBeginDateString() +
                        "\001" + this.getInsuranceEndDateString() +
                        "\001" + premiumCompanyName +
                        "\001" + premiumIntermediaryName +
                        "\001" + specialAgreementContent +
                        "\001" + remarks +
                        "\001" + this.getCreationTimeString() +
                        "\001" + this.getModifyTimeString() +
                        "\001" + createdUser +
                        '\r';
    }
}