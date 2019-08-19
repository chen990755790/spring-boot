package com.example.model;

import com.example.util.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class Loan extends Example{
    private String loanNo;

    private String projectNo;

    private String projectNoText;

    private String parentLoanNo;

    private String parentLoanNoText;

    private Integer loanLevel;

    private String loanLevelText;

    private String contractNo;

    private String loanName;

    private String applyPlace;

    private String applyPlaceCode;

    private String loanType;

    private String loanTypeText;

    private BigDecimal contractAmount;

    private String primaryRateType;

    private String primaryRateTypeText;
    private Date interestStartDate;
    private Date interestEndDate;

    private String loanTermType;

    private String loanTermTypeText;

    private Integer loanTerm;
    private Date actualPayDate;

    private String paymentType;

    private String paymentTypeText;

    private Boolean isProductUsed;

    private String isProductUsedText;

    private Boolean isThirdpartyWarranty;

    private String warrantyType;

    private String warrantyTypeText;

    private String warrantorCreditLevel;

    private BigDecimal warrantorAmount;

    private String warrantorName;

    private String warrantorType;

    private Boolean isGuaranteed;

    private Boolean isUsedOwnFunds;

    private String loanProcurementDepartment;

    private Integer loanCount;

    private Integer transferStatus;

    private String transferStatusText;

    private BigDecimal primaryRate;

    private BigDecimal expectIncomeAmount;

    private String interestTypeText;

    private String interestType;

    private Integer purposeHolding;

    private String purposeHoldingText;

    private String warrantorCreditLevelText;

    private String warrantorTypeText;

    private Integer loanTemplate;

    private String loanTemplateText;

    private String loanProcurementDepartmentText;

    private BigDecimal loanMarginAmount;

    private String remarks;

    private String isThirdpartyWarrantyText;

    private String isGuaranteedText;

    private String isUsedOwnFundsText;
    private Date modifedTime;
    private Date createdTime;

    private String createdUser;

    private Integer holderType;

    private String holderTypeText;

    private String holderName;

    private BigDecimal originalAssetAmount;

    private BigDecimal originalAssetPrimaryRate;

    private Integer repaymentSource;

    private String repaymentSourceText;

    private BigDecimal onceCashFlowAmount;

    private BigDecimal sellRate;

    private Integer payInterestFrequency;

    private String payInterestFrequencyText;

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

    public String getProjectNoText() {
        return projectNoText;
    }

    public void setProjectNoText(String projectNoText) {
        this.projectNoText = projectNoText == null ? null : projectNoText.trim();
    }

    public String getParentLoanNo() {
        return parentLoanNo;
    }

    public void setParentLoanNo(String parentLoanNo) {
        this.parentLoanNo = parentLoanNo == null ? null : parentLoanNo.trim();
    }

    public String getParentLoanNoText() {
        return parentLoanNoText;
    }

    public void setParentLoanNoText(String parentLoanNoText) {
        this.parentLoanNoText = parentLoanNoText == null ? null : parentLoanNoText.trim();
    }

    public Integer getLoanLevel() {
        return loanLevel;
    }

    public void setLoanLevel(Integer loanLevel) {
        this.loanLevel = loanLevel;
    }

    public String getLoanLevelText() {
        return loanLevelText;
    }

    public void setLoanLevelText(String loanLevelText) {
        this.loanLevelText = loanLevelText == null ? null : loanLevelText.trim();
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName == null ? null : loanName.trim();
    }

    public String getApplyPlace() {
        return applyPlace;
    }

    public void setApplyPlace(String applyPlace) {
        this.applyPlace = applyPlace == null ? null : applyPlace.trim();
    }

    public String getApplyPlaceCode() {
        return applyPlaceCode;
    }

    public void setApplyPlaceCode(String applyPlaceCode) {
        this.applyPlaceCode = applyPlaceCode == null ? null : applyPlaceCode.trim();
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType == null ? null : loanType.trim();
    }

    public String getLoanTypeText() {
        return loanTypeText;
    }

    public void setLoanTypeText(String loanTypeText) {
        this.loanTypeText = loanTypeText == null ? null : loanTypeText.trim();
    }

    public BigDecimal getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(BigDecimal contractAmount) {
        this.contractAmount = contractAmount;
    }

    public String getPrimaryRateType() {
        return primaryRateType;
    }

    public void setPrimaryRateType(String primaryRateType) {
        this.primaryRateType = primaryRateType == null ? null : primaryRateType.trim();
    }

    public String getPrimaryRateTypeText() {
        return primaryRateTypeText;
    }

    public void setPrimaryRateTypeText(String primaryRateTypeText) {
        this.primaryRateTypeText = primaryRateTypeText == null ? null : primaryRateTypeText.trim();
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

    public String getLoanTermType() {
        return loanTermType;
    }

    public void setLoanTermType(String loanTermType) {
        this.loanTermType = loanTermType == null ? null : loanTermType.trim();
    }

    public String getLoanTermTypeText() {
        return loanTermTypeText;
    }

    public void setLoanTermTypeText(String loanTermTypeText) {
        this.loanTermTypeText = loanTermTypeText == null ? null : loanTermTypeText.trim();
    }

    public Integer getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(Integer loanTerm) {
        this.loanTerm = loanTerm;
    }

    public Date getActualPayDate() {
        return actualPayDate;
    }

    public String getActualPayDateString() {
        return DateUtil.formateDate(actualPayDate);
    }

    public void setActualPayDate(Date actualPayDate) {
        this.actualPayDate = actualPayDate;
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

    public Boolean getIsProductUsed() {
        return isProductUsed;
    }

    public void setIsProductUsed(Boolean isProductUsed) {
        this.isProductUsed = isProductUsed;
    }

    public String getIsProductUsedText() {
        return isProductUsedText;
    }

    public void setIsProductUsedText(String isProductUsedText) {
        this.isProductUsedText = isProductUsedText == null ? null : isProductUsedText.trim();
    }

    public Boolean getIsThirdpartyWarranty() {
        return isThirdpartyWarranty;
    }

    public void setIsThirdpartyWarranty(Boolean isThirdpartyWarranty) {
        this.isThirdpartyWarranty = isThirdpartyWarranty;
    }

    public String getWarrantyType() {
        return warrantyType;
    }

    public void setWarrantyType(String warrantyType) {
        this.warrantyType = warrantyType == null ? null : warrantyType.trim();
    }

    public String getWarrantyTypeText() {
        return warrantyTypeText;
    }

    public void setWarrantyTypeText(String warrantyTypeText) {
        this.warrantyTypeText = warrantyTypeText == null ? null : warrantyTypeText.trim();
    }

    public String getWarrantorCreditLevel() {
        return warrantorCreditLevel;
    }

    public void setWarrantorCreditLevel(String warrantorCreditLevel) {
        this.warrantorCreditLevel = warrantorCreditLevel == null ? null : warrantorCreditLevel.trim();
    }

    public BigDecimal getWarrantorAmount() {
        return warrantorAmount;
    }

    public void setWarrantorAmount(BigDecimal warrantorAmount) {
        this.warrantorAmount = warrantorAmount;
    }

    public String getWarrantorName() {
        return warrantorName;
    }

    public void setWarrantorName(String warrantorName) {
        this.warrantorName = warrantorName == null ? null : warrantorName.trim();
    }

    public String getWarrantorType() {
        return warrantorType;
    }

    public void setWarrantorType(String warrantorType) {
        this.warrantorType = warrantorType == null ? null : warrantorType.trim();
    }

    public Boolean getIsGuaranteed() {
        return isGuaranteed;
    }

    public void setIsGuaranteed(Boolean isGuaranteed) {
        this.isGuaranteed = isGuaranteed;
    }

    public Boolean getIsUsedOwnFunds() {
        return isUsedOwnFunds;
    }

    public void setIsUsedOwnFunds(Boolean isUsedOwnFunds) {
        this.isUsedOwnFunds = isUsedOwnFunds;
    }

    public String getLoanProcurementDepartment() {
        return loanProcurementDepartment;
    }

    public void setLoanProcurementDepartment(String loanProcurementDepartment) {
        this.loanProcurementDepartment = loanProcurementDepartment == null ? null : loanProcurementDepartment.trim();
    }

    public Integer getLoanCount() {
        return loanCount;
    }

    public void setLoanCount(Integer loanCount) {
        this.loanCount = loanCount;
    }

    public Integer getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(Integer transferStatus) {
        this.transferStatus = transferStatus;
    }

    public String getTransferStatusText() {
        return transferStatusText;
    }

    public void setTransferStatusText(String transferStatusText) {
        this.transferStatusText = transferStatusText == null ? null : transferStatusText.trim();
    }

    public BigDecimal getPrimaryRate() {
        return primaryRate;
    }

    public void setPrimaryRate(BigDecimal primaryRate) {
        this.primaryRate = primaryRate;
    }

    public BigDecimal getExpectIncomeAmount() {
        return expectIncomeAmount;
    }

    public void setExpectIncomeAmount(BigDecimal expectIncomeAmount) {
        this.expectIncomeAmount = expectIncomeAmount;
    }

    public String getInterestTypeText() {
        return interestTypeText;
    }

    public void setInterestTypeText(String interestTypeText) {
        this.interestTypeText = interestTypeText == null ? null : interestTypeText.trim();
    }

    public String getInterestType() {
        return interestType;
    }

    public void setInterestType(String interestType) {
        this.interestType = interestType == null ? null : interestType.trim();
    }

    public Integer getPurposeHolding() {
        return purposeHolding;
    }

    public void setPurposeHolding(Integer purposeHolding) {
        this.purposeHolding = purposeHolding;
    }

    public String getPurposeHoldingText() {
        return purposeHoldingText;
    }

    public void setPurposeHoldingText(String purposeHoldingText) {
        this.purposeHoldingText = purposeHoldingText == null ? null : purposeHoldingText.trim();
    }

    public String getWarrantorCreditLevelText() {
        return warrantorCreditLevelText;
    }

    public void setWarrantorCreditLevelText(String warrantorCreditLevelText) {
        this.warrantorCreditLevelText = warrantorCreditLevelText == null ? null : warrantorCreditLevelText.trim();
    }

    public String getWarrantorTypeText() {
        return warrantorTypeText;
    }

    public void setWarrantorTypeText(String warrantorTypeText) {
        this.warrantorTypeText = warrantorTypeText == null ? null : warrantorTypeText.trim();
    }

    public Integer getLoanTemplate() {
        return loanTemplate;
    }

    public void setLoanTemplate(Integer loanTemplate) {
        this.loanTemplate = loanTemplate;
    }

    public String getLoanTemplateText() {
        return loanTemplateText;
    }

    public void setLoanTemplateText(String loanTemplateText) {
        this.loanTemplateText = loanTemplateText == null ? null : loanTemplateText.trim();
    }

    public String getLoanProcurementDepartmentText() {
        return loanProcurementDepartmentText;
    }

    public void setLoanProcurementDepartmentText(String loanProcurementDepartmentText) {
        this.loanProcurementDepartmentText = loanProcurementDepartmentText == null ? null : loanProcurementDepartmentText.trim();
    }

    public BigDecimal getLoanMarginAmount() {
        return loanMarginAmount;
    }

    public void setLoanMarginAmount(BigDecimal loanMarginAmount) {
        this.loanMarginAmount = loanMarginAmount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getIsThirdpartyWarrantyText() {
        return isThirdpartyWarrantyText;
    }

    public void setIsThirdpartyWarrantyText(String isThirdpartyWarrantyText) {
        this.isThirdpartyWarrantyText = isThirdpartyWarrantyText == null ? null : isThirdpartyWarrantyText.trim();
    }

    public String getIsGuaranteedText() {
        return isGuaranteedText;
    }

    public void setIsGuaranteedText(String isGuaranteedText) {
        this.isGuaranteedText = isGuaranteedText == null ? null : isGuaranteedText.trim();
    }

    public String getIsUsedOwnFundsText() {
        return isUsedOwnFundsText;
    }

    public void setIsUsedOwnFundsText(String isUsedOwnFundsText) {
        this.isUsedOwnFundsText = isUsedOwnFundsText == null ? null : isUsedOwnFundsText.trim();
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

    public Date getCreatedTime() {
        return createdTime;
    }

    public String getCreatedTimeString() {
        return DateUtil.formateDate(createdTime);
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser == null ? null : createdUser.trim();
    }

    public Integer getHolderType() {
        return holderType;
    }

    public void setHolderType(Integer holderType) {
        this.holderType = holderType;
    }

    public String getHolderTypeText() {
        return holderTypeText;
    }

    public void setHolderTypeText(String holderTypeText) {
        this.holderTypeText = holderTypeText == null ? null : holderTypeText.trim();
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName == null ? null : holderName.trim();
    }

    public BigDecimal getOriginalAssetAmount() {
        return originalAssetAmount;
    }

    public void setOriginalAssetAmount(BigDecimal originalAssetAmount) {
        this.originalAssetAmount = originalAssetAmount;
    }

    public BigDecimal getOriginalAssetPrimaryRate() {
        return originalAssetPrimaryRate;
    }

    public void setOriginalAssetPrimaryRate(BigDecimal originalAssetPrimaryRate) {
        this.originalAssetPrimaryRate = originalAssetPrimaryRate;
    }

    public Integer getRepaymentSource() {
        return repaymentSource;
    }

    public void setRepaymentSource(Integer repaymentSource) {
        this.repaymentSource = repaymentSource;
    }

    public String getRepaymentSourceText() {
        return repaymentSourceText;
    }

    public void setRepaymentSourceText(String repaymentSourceText) {
        this.repaymentSourceText = repaymentSourceText == null ? null : repaymentSourceText.trim();
    }

    public BigDecimal getOnceCashFlowAmount() {
        return onceCashFlowAmount;
    }

    public void setOnceCashFlowAmount(BigDecimal onceCashFlowAmount) {
        this.onceCashFlowAmount = onceCashFlowAmount;
    }

    public BigDecimal getSellRate() {
        return sellRate;
    }

    public void setSellRate(BigDecimal sellRate) {
        this.sellRate = sellRate;
    }

    public Integer getPayInterestFrequency() {
        return payInterestFrequency;
    }

    public void setPayInterestFrequency(Integer payInterestFrequency) {
        this.payInterestFrequency = payInterestFrequency;
    }

    public String getPayInterestFrequencyText() {
        return payInterestFrequencyText;
    }

    public void setPayInterestFrequencyText(String payInterestFrequencyText) {
        this.payInterestFrequencyText = payInterestFrequencyText == null ? null : payInterestFrequencyText.trim();
    }

    @Override
    public String toString() {
        return
                loanNo +
                        "\001" + projectNo +
                        "\001" + projectNoText +
                        "\001" + parentLoanNo +
                        "\001" + parentLoanNoText +
                        "\001" + loanLevel +
                        "\001" + loanLevelText +
                        "\001" + contractNo +
                        "\001" + loanName +
                        "\001" + applyPlace +
                        "\001" + applyPlaceCode +
                        "\001" + loanType +
                        "\001" + loanTypeText +
                        "\001" + contractAmount +
                        "\001" + primaryRateType +
                        "\001" + primaryRateTypeText +
                        "\001" + this.getInterestStartDateString() +
                        "\001" + this.getInterestEndDateString() +
                        "\001" + loanTermType +
                        "\001" + loanTermTypeText +
                        "\001" + loanTerm +
                        "\001" + this.getActualPayDateString() +
                        "\001" + paymentType +
                        "\001" + paymentTypeText +
                        "\001" + isProductUsed +
                        "\001" + isProductUsedText +
                        "\001" + isThirdpartyWarranty +
                        "\001" + warrantyType +
                        "\001" + warrantyTypeText +
                        "\001" + warrantorCreditLevel +
                        "\001" + warrantorAmount +
                        "\001" + warrantorName +
                        "\001" + warrantorType +
                        "\001" + isGuaranteed +
                        "\001" + isUsedOwnFunds +
                        "\001" + loanProcurementDepartment +
                        "\001" + loanCount +
                        "\001" + transferStatus +
                        "\001" + transferStatusText +
                        "\001" + primaryRate +
                        "\001" + expectIncomeAmount +
                        "\001" + interestTypeText +
                        "\001" + interestType +
                        "\001" + purposeHolding +
                        "\001" + purposeHoldingText +
                        "\001" + warrantorCreditLevelText +
                        "\001" + warrantorTypeText +
                        "\001" + loanTemplate +
                        "\001" + loanTemplateText +
                        "\001" + loanProcurementDepartmentText +
                        "\001" + loanMarginAmount +
                        "\001" + remarks +
                        "\001" + isThirdpartyWarrantyText +
                        "\001" + isGuaranteedText +
                        "\001" + isUsedOwnFundsText +
                        "\001" + this.getModifedTimeString() +
                        "\001" + this.getCreatedTimeString() +
                        "\001" + createdUser +
                        "\001" + holderType +
                        "\001" + holderTypeText +
                        "\001" + holderName +
                        "\001" + originalAssetAmount +
                        "\001" + originalAssetPrimaryRate +
                        "\001" + repaymentSource +
                        "\001" + repaymentSourceText +
                        "\001" + onceCashFlowAmount +
                        "\001" + sellRate +
                        "\001" + payInterestFrequency +
                        "\001" + payInterestFrequencyText +
                        '\r';
    }
}