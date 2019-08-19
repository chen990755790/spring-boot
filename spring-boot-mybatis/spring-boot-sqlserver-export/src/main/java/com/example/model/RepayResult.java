package com.example.model;

import com.example.util.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class RepayResult extends RepayResultKey {
    private String loanName;

    private Integer currentIssue;

    private String currentIssueStatus;

    private String currentIssueStatusText;

    private String moneyFlowType;

    private String moneyFlowTypeText;

    private BigDecimal principalPaid;

    private BigDecimal interestPaid;

    private BigDecimal securityChargePaid;

    private BigDecimal serviceChargePaid;

    private BigDecimal chargeMoneyPaid;

    private BigDecimal otherPaymentPaid;
    private Date payDate;

    private Integer overdueArrears;

    private BigDecimal overdueAmount;

    private Date substitutionPaymentDate;

    private BigDecimal substitutionPaymentAmount;

    private Integer continuousTimesOverdue;

    private Integer accumulateOverdueTimes;

    private Integer substitutePaymentTimes;

    private BigDecimal duePenaltyTotalAmount;

    private BigDecimal paidPenaltyTotalAmount;

    private BigDecimal surplusPenaltyAmount;

    private BigDecimal deductionMarginAmount;

    private String createdUser;

    private Date createdTime;

    private Date modifedTime;

    private String remark;

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName == null ? null : loanName.trim();
    }

    public Integer getCurrentIssue() {
        return currentIssue;
    }

    public void setCurrentIssue(Integer currentIssue) {
        this.currentIssue = currentIssue;
    }

    public String getCurrentIssueStatus() {
        return currentIssueStatus;
    }

    public void setCurrentIssueStatus(String currentIssueStatus) {
        this.currentIssueStatus = currentIssueStatus == null ? null : currentIssueStatus.trim();
    }

    public String getCurrentIssueStatusText() {
        return currentIssueStatusText;
    }

    public void setCurrentIssueStatusText(String currentIssueStatusText) {
        this.currentIssueStatusText = currentIssueStatusText == null ? null : currentIssueStatusText.trim();
    }

    public String getMoneyFlowType() {
        return moneyFlowType;
    }

    public void setMoneyFlowType(String moneyFlowType) {
        this.moneyFlowType = moneyFlowType == null ? null : moneyFlowType.trim();
    }

    public String getMoneyFlowTypeText() {
        return moneyFlowTypeText;
    }

    public void setMoneyFlowTypeText(String moneyFlowTypeText) {
        this.moneyFlowTypeText = moneyFlowTypeText == null ? null : moneyFlowTypeText.trim();
    }

    public BigDecimal getPrincipalPaid() {
        return principalPaid;
    }

    public void setPrincipalPaid(BigDecimal principalPaid) {
        this.principalPaid = principalPaid;
    }

    public BigDecimal getInterestPaid() {
        return interestPaid;
    }

    public void setInterestPaid(BigDecimal interestPaid) {
        this.interestPaid = interestPaid;
    }

    public BigDecimal getSecurityChargePaid() {
        return securityChargePaid;
    }

    public void setSecurityChargePaid(BigDecimal securityChargePaid) {
        this.securityChargePaid = securityChargePaid;
    }

    public BigDecimal getServiceChargePaid() {
        return serviceChargePaid;
    }

    public void setServiceChargePaid(BigDecimal serviceChargePaid) {
        this.serviceChargePaid = serviceChargePaid;
    }

    public BigDecimal getChargeMoneyPaid() {
        return chargeMoneyPaid;
    }

    public void setChargeMoneyPaid(BigDecimal chargeMoneyPaid) {
        this.chargeMoneyPaid = chargeMoneyPaid;
    }

    public BigDecimal getOtherPaymentPaid() {
        return otherPaymentPaid;
    }

    public void setOtherPaymentPaid(BigDecimal otherPaymentPaid) {
        this.otherPaymentPaid = otherPaymentPaid;
    }

    public Date getPayDate() {
        return payDate;
    }

    public String getPayDateString() {
        return DateUtil.formateDate(payDate);
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Integer getOverdueArrears() {
        return overdueArrears;
    }

    public void setOverdueArrears(Integer overdueArrears) {
        this.overdueArrears = overdueArrears;
    }

    public BigDecimal getOverdueAmount() {
        return overdueAmount;
    }

    public void setOverdueAmount(BigDecimal overdueAmount) {
        this.overdueAmount = overdueAmount;
    }

    public Date getSubstitutionPaymentDate() {
        return substitutionPaymentDate;
    }

    public String getSubstitutionPaymentDateString() {
        return DateUtil.formateDate(substitutionPaymentDate);
    }

    public void setSubstitutionPaymentDate(Date substitutionPaymentDate) {
        this.substitutionPaymentDate = substitutionPaymentDate;
    }

    public BigDecimal getSubstitutionPaymentAmount() {
        return substitutionPaymentAmount;
    }

    public void setSubstitutionPaymentAmount(BigDecimal substitutionPaymentAmount) {
        this.substitutionPaymentAmount = substitutionPaymentAmount;
    }

    public Integer getContinuousTimesOverdue() {
        return continuousTimesOverdue;
    }

    public void setContinuousTimesOverdue(Integer continuousTimesOverdue) {
        this.continuousTimesOverdue = continuousTimesOverdue;
    }

    public Integer getAccumulateOverdueTimes() {
        return accumulateOverdueTimes;
    }

    public void setAccumulateOverdueTimes(Integer accumulateOverdueTimes) {
        this.accumulateOverdueTimes = accumulateOverdueTimes;
    }

    public Integer getSubstitutePaymentTimes() {
        return substitutePaymentTimes;
    }

    public void setSubstitutePaymentTimes(Integer substitutePaymentTimes) {
        this.substitutePaymentTimes = substitutePaymentTimes;
    }

    public BigDecimal getDuePenaltyTotalAmount() {
        return duePenaltyTotalAmount;
    }

    public void setDuePenaltyTotalAmount(BigDecimal duePenaltyTotalAmount) {
        this.duePenaltyTotalAmount = duePenaltyTotalAmount;
    }

    public BigDecimal getPaidPenaltyTotalAmount() {
        return paidPenaltyTotalAmount;
    }

    public void setPaidPenaltyTotalAmount(BigDecimal paidPenaltyTotalAmount) {
        this.paidPenaltyTotalAmount = paidPenaltyTotalAmount;
    }

    public BigDecimal getSurplusPenaltyAmount() {
        return surplusPenaltyAmount;
    }

    public void setSurplusPenaltyAmount(BigDecimal surplusPenaltyAmount) {
        this.surplusPenaltyAmount = surplusPenaltyAmount;
    }

    public BigDecimal getDeductionMarginAmount() {
        return deductionMarginAmount;
    }

    public void setDeductionMarginAmount(BigDecimal deductionMarginAmount) {
        this.deductionMarginAmount = deductionMarginAmount;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser == null ? null : createdUser.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return
                loanName +
                        "\001" + currentIssue +
                        "\001" + currentIssueStatus +
                        "\001" + currentIssueStatusText +
                        "\001" + moneyFlowType +
                        "\001" + moneyFlowTypeText +
                        "\001" + principalPaid +
                        "\001" + interestPaid +
                        "\001" + securityChargePaid +
                        "\001" + serviceChargePaid +
                        "\001" + chargeMoneyPaid +
                        "\001" + otherPaymentPaid +
                        "\001" + this.getPayDateString() +
                        "\001" + overdueArrears +
                        "\001" + overdueAmount +
                        "\001" + substitutionPaymentDate +
                        "\001" + substitutionPaymentAmount +
                        "\001" + continuousTimesOverdue +
                        "\001" + accumulateOverdueTimes +
                        "\001" + substitutePaymentTimes +
                        "\001" + duePenaltyTotalAmount +
                        "\001" + paidPenaltyTotalAmount +
                        "\001" + surplusPenaltyAmount +
                        "\001" + deductionMarginAmount +
                        "\001" + createdUser +
                        "\001" + this.getCreatedTimeString() +
                        "\001" + this.getModifedTimeString() +
                        "\001" + remark +
                        '\r';
    }
}