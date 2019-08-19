package com.example.model;

import com.example.util.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class CollateralReceivables extends Example{
    private String id;

    private String loanNo;

    private String projectNo;

    private String underlyingTransactionContractName;

    private String underlyingTransactionContractNo;

    private String collertalModel;

    private String collertalModelText;

    private String underlyingTransactionContractDebtor;

    private String underlyingTransactionContractCreditor;

    private String invoiceNo;

    private String invoiceAmount;

    private BigDecimal receivablesAmount;
    private Date receivablesDueDate;

    private String shadowRating;

    private String shadowRatingText;
    private Date interestStartDate;
    private Date interestEndDate;

    private BigDecimal primaryRate;

    private String paymentType;

    private String paymentTypeText;

    private String remark;

    private String createdUser;
    private Date creationTime;
    private Date modifyTime;

    private Integer receivablesTerm;

    private BigDecimal expectIncomeAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public String getUnderlyingTransactionContractName() {
        return underlyingTransactionContractName;
    }

    public void setUnderlyingTransactionContractName(String underlyingTransactionContractName) {
        this.underlyingTransactionContractName = underlyingTransactionContractName == null ? null : underlyingTransactionContractName.trim();
    }

    public String getUnderlyingTransactionContractNo() {
        return underlyingTransactionContractNo;
    }

    public void setUnderlyingTransactionContractNo(String underlyingTransactionContractNo) {
        this.underlyingTransactionContractNo = underlyingTransactionContractNo == null ? null : underlyingTransactionContractNo.trim();
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

    public String getUnderlyingTransactionContractDebtor() {
        return underlyingTransactionContractDebtor;
    }

    public void setUnderlyingTransactionContractDebtor(String underlyingTransactionContractDebtor) {
        this.underlyingTransactionContractDebtor = underlyingTransactionContractDebtor == null ? null : underlyingTransactionContractDebtor.trim();
    }

    public String getUnderlyingTransactionContractCreditor() {
        return underlyingTransactionContractCreditor;
    }

    public void setUnderlyingTransactionContractCreditor(String underlyingTransactionContractCreditor) {
        this.underlyingTransactionContractCreditor = underlyingTransactionContractCreditor == null ? null : underlyingTransactionContractCreditor.trim();
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public String getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(String invoiceAmount) {
        this.invoiceAmount = invoiceAmount == null ? null : invoiceAmount.trim();
    }

    public BigDecimal getReceivablesAmount() {
        return receivablesAmount;
    }

    public void setReceivablesAmount(BigDecimal receivablesAmount) {
        this.receivablesAmount = receivablesAmount;
    }

    public Date getReceivablesDueDate() {
        return receivablesDueDate;
    }

    public String getReceivablesDueDateString() {
        return DateUtil.formateDate(receivablesDueDate);
    }

    public void setReceivablesDueDate(Date receivablesDueDate) {
        this.receivablesDueDate = receivablesDueDate;
    }

    public String getShadowRating() {
        return shadowRating;
    }

    public void setShadowRating(String shadowRating) {
        this.shadowRating = shadowRating == null ? null : shadowRating.trim();
    }

    public String getShadowRatingText() {
        return shadowRatingText;
    }

    public void setShadowRatingText(String shadowRatingText) {
        this.shadowRatingText = shadowRatingText == null ? null : shadowRatingText.trim();
    }

    public Date getInterestStartDate() {
        return interestStartDate;
    }

    public String getInterestStartDateString() {
        return DateUtil.formateDate(interestStartDate);
    }

    public void setInterestStartDate(Date interestStartDate) {
        this.interestStartDate = interestStartDate;
    }

    public Date getInterestEndDate() {
        return interestEndDate;
    }

    public String getInterestEndDateString() {
        return DateUtil.formateDate(interestEndDate);
    }

    public void setInterestEndDate(Date interestEndDate) {
        this.interestEndDate = interestEndDate;
    }

    public BigDecimal getPrimaryRate() {
        return primaryRate;
    }

    public void setPrimaryRate(BigDecimal primaryRate) {
        this.primaryRate = primaryRate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }

    public String getPaymentTypeText() {
        return paymentTypeText;
    }

    public void setPaymentTypeText(String paymentTypeText) {
        this.paymentTypeText = paymentTypeText == null ? null : paymentTypeText.trim();
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

    public Date getCreationTime() {
        return creationTime;
    }

    public String getCreationTimeString(){
        return DateUtil.formateDate(creationTime);
    }
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public String getModifyTimeString() {
        return DateUtil.formateDate(modifyTime);
    }
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getReceivablesTerm() {
        return receivablesTerm;
    }

    public void setReceivablesTerm(Integer receivablesTerm) {
        this.receivablesTerm = receivablesTerm;
    }

    public BigDecimal getExpectIncomeAmount() {
        return expectIncomeAmount;
    }

    public void setExpectIncomeAmount(BigDecimal expectIncomeAmount) {
        this.expectIncomeAmount = expectIncomeAmount;
    }

    @Override
    public String toString() {
        return
                id +
                        "\001" + loanNo +
                        "\001" + projectNo +
                        "\001" + underlyingTransactionContractName +
                        "\001" + underlyingTransactionContractNo +
                        "\001" + collertalModel +
                        "\001" + collertalModelText +
                        "\001" + underlyingTransactionContractDebtor +
                        "\001" + underlyingTransactionContractCreditor +
                        "\001" + invoiceNo +
                        "\001" + invoiceAmount +
                        "\001" + receivablesAmount +
                        "\001" + this.getReceivablesDueDateString() +
                        "\001" + shadowRating +
                        "\001" + shadowRatingText +
                        "\001" + this.getInterestStartDate() +
                        "\001" + this.getInterestEndDate() +
                        "\001" + primaryRate +
                        "\001" + paymentType +
                        "\001" + paymentTypeText +
                        "\001" + remark +
                        "\001" + createdUser +
                        "\001" + this.getCreationTime() +
                        "\001" + this.getModifyTime() +
                        "\001" + receivablesTerm +
                        "\001" + expectIncomeAmount +
                        '\r';
    }
}