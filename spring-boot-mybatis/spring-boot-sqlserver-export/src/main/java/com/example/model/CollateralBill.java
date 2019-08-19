package com.example.model;


import com.example.util.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class CollateralBill extends CollateralBillKey {
    private String projectNo;

    private String pledgedBillNumber;

    private String collertalModel;

    private String collertalModelText;

    private String billType;

    private String billTypeText;

    private BigDecimal billAmount;
    private Date issueDate;
    private Date expiryDate;

    private String drawerName;

    private String drawerAccount;

    private String beneficiaryName;

    private String beneficiaryAccount;

    private Integer billViewCount;

    private String paymentCredit;
    private Date creationTime;
    private Date modifyTime;

    private String remarks;

    private String createdUser;

    private String billAcceptor;

    public String getIssueDateString() {
        return DateUtil.formateDate(issueDate);
    }

    public String getExpiryDateString() {
        return DateUtil.formateDate(expiryDate);
    }

    public String getCreationTimeString() {
        return DateUtil.formateDate(creationTime);
    }

    public String getModifyTimeString() {
        return DateUtil.formateDate(modifyTime);
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public String getPledgedBillNumber() {
        return pledgedBillNumber;
    }

    public void setPledgedBillNumber(String pledgedBillNumber) {
        this.pledgedBillNumber = pledgedBillNumber == null ? null : pledgedBillNumber.trim();
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

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public String getBillTypeText() {
        return billTypeText;
    }

    public void setBillTypeText(String billTypeText) {
        this.billTypeText = billTypeText == null ? null : billTypeText.trim();
    }

    public BigDecimal getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(BigDecimal billAmount) {
        this.billAmount = billAmount;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getDrawerName() {
        return drawerName;
    }

    public void setDrawerName(String drawerName) {
        this.drawerName = drawerName == null ? null : drawerName.trim();
    }

    public String getDrawerAccount() {
        return drawerAccount;
    }

    public void setDrawerAccount(String drawerAccount) {
        this.drawerAccount = drawerAccount == null ? null : drawerAccount.trim();
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName == null ? null : beneficiaryName.trim();
    }

    public String getBeneficiaryAccount() {
        return beneficiaryAccount;
    }

    public void setBeneficiaryAccount(String beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount == null ? null : beneficiaryAccount.trim();
    }

    public Integer getBillViewCount() {
        return billViewCount;
    }

    public void setBillViewCount(Integer billViewCount) {
        this.billViewCount = billViewCount;
    }

    public String getPaymentCredit() {
        return paymentCredit;
    }

    public void setPaymentCredit(String paymentCredit) {
        this.paymentCredit = paymentCredit == null ? null : paymentCredit.trim();
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser == null ? null : createdUser.trim();
    }

    public String getBillAcceptor() {
        return billAcceptor;
    }

    public void setBillAcceptor(String billAcceptor) {
        this.billAcceptor = billAcceptor == null ? null : billAcceptor.trim();
    }

    @Override
    public String toString() {
        return
                projectNo +
                        "\001" + pledgedBillNumber +
                        "\001" + collertalModel +
                        "\001" + collertalModelText +
                        "\001" + billType +
                        "\001" + billTypeText +
                        "\001" + billAmount +
                        "\001" + this.getIssueDateString() +
                        "\001" + this.getExpiryDateString() +
                        "\001" + drawerName +
                        "\001" + drawerAccount +
                        "\001" + beneficiaryName +
                        "\001" + beneficiaryAccount +
                        "\001" + billViewCount +
                        "\001" + paymentCredit +
                        "\001" + this.getCreationTimeString() +
                        "\001" + this.getModifyTimeString() +
                        "\001" + remarks +
                        "\001" + createdUser +
                        "\001" + billAcceptor +
                        '\r';
    }
}