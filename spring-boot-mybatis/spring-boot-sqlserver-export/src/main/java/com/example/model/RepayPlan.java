package com.example.model;

import com.example.util.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class RepayPlan extends RepayPlanKey {
    private String loanName;
    private Date dueDate;

    private BigDecimal principalDue;

    private BigDecimal interestDue;

    private BigDecimal securityChargeDue;

    private BigDecimal serviceChargeDue;

    private BigDecimal chargeMoneyDue;

    private BigDecimal otherPaymentDue;

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

    public Date getDueDate() {
        return dueDate;
    }
    public String getDueDateString() {
        return DateUtil.formateDate(dueDate);
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public BigDecimal getPrincipalDue() {
        return principalDue;
    }

    public void setPrincipalDue(BigDecimal principalDue) {
        this.principalDue = principalDue;
    }

    public BigDecimal getInterestDue() {
        return interestDue;
    }

    public void setInterestDue(BigDecimal interestDue) {
        this.interestDue = interestDue;
    }

    public BigDecimal getSecurityChargeDue() {
        return securityChargeDue;
    }

    public void setSecurityChargeDue(BigDecimal securityChargeDue) {
        this.securityChargeDue = securityChargeDue;
    }

    public BigDecimal getServiceChargeDue() {
        return serviceChargeDue;
    }

    public void setServiceChargeDue(BigDecimal serviceChargeDue) {
        this.serviceChargeDue = serviceChargeDue;
    }

    public BigDecimal getChargeMoneyDue() {
        return chargeMoneyDue;
    }

    public void setChargeMoneyDue(BigDecimal chargeMoneyDue) {
        this.chargeMoneyDue = chargeMoneyDue;
    }

    public BigDecimal getOtherPaymentDue() {
        return otherPaymentDue;
    }

    public void setOtherPaymentDue(BigDecimal otherPaymentDue) {
        this.otherPaymentDue = otherPaymentDue;
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
                        "\001" + this.getDueDateString() +
                        "\001" + principalDue +
                        "\001" + interestDue +
                        "\001" + securityChargeDue +
                        "\001" + serviceChargeDue +
                        "\001" + chargeMoneyDue +
                        "\001" + otherPaymentDue +
                        "\001" + createdUser +
                        "\001" + this.getCreatedUser() +
                        "\001" + this.getModifedTimeString() +
                        "\001" + remark +
                        '\r';
    }
}