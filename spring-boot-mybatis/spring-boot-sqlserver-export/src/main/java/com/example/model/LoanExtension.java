package com.example.model;

import com.example.util.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class LoanExtension extends LoanExtensionKey {
    private String projectNo;

    private String companyName;

    private String customerName;

    private Integer certificateType;

    private String certificateTypeText;

    private String certificateNo;

    private Integer businessType;

    private String businessTypeText;

    private BigDecimal feeRate;

    private Integer collateralType;

    private String collateralTypeText;

    private String loanApplication;

    private String underlyingTransactionContractName;

    private String underlyingTransactionContractNo;

    private String underlyingTransactionContractDebtor;

    private String underlyingTransactionContractCreditor;

    private String invoiceNo;

    private String invoiceAmount;
    private Date receivablesDueDate;

    private String financingApplyNo;
    private Date submitApplyDate;

    private BigDecimal expectTaxAmount;
    private Date taxPayDate;

    private BigDecimal selfPayAmount;

    private String financingContactName;

    private String financingContactPhone;

    private String agencyAgreementNo;

    private String financingContactEmail;

    private String pickUpNo;

    private String pickUpBillNo;

    private BigDecimal financingAmount;
    private Date financingStartDate;
    private Date financingEndDate;

    private Boolean isFirstFincancing;

    private String isFirstFincancingText;

    private String carInsuranceMode;

    private String billNo;

    private String billAmount;

    private String billPayBank;

    private Integer billTerm;
    private Date billStartDate;
    private Date bilEndDate;

    private String billDrawer;

    private String billTaker;

    private String billNumber;

    private String billRemarks;

    private BigDecimal financingPlanAmount;

    private BigDecimal financingActualAmount;

    private String useOfFunds;

    private String fundsSource;

    private String riskLevel;

    private String bondCategory;

    private String financingCustomerName;

    private String financingCustomerNo;

    private String businessScope;

    private String actualOwner;

    private String mainBusiness;

    private BigDecimal registeredCapital;

    private String financingCustomerIndustry;

    private String financingCustomerCharacter;

    private String financingCustomerBankAccountName;

    private String financingCustomerBankName;

    private String financingCustomerBankAccountNo;

    private Date purchaseDate;

    private Boolean isFixedTerm;

    private String isFixedTermText;

    private String loanApplyNo;

    private Integer vehicleCategory;

    private String vehicleCategoryText;

    private String shadowRating;

    private BigDecimal receivablesAmount;

    private String loanName;

    private Date createdTime;

    private Date modifedTime;

    private String createdUser;

    private String remarks;

    private String shadowRatingText;

    private String extendField1;

    private Integer underlyingTransactionContractDebtorId;

    private Integer contractDebtorContactId;

    private Integer underlyingTransactionContractCreditorId;

    private Integer contractCreditorContactId;

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateTypeText() {
        return certificateTypeText;
    }

    public void setCertificateTypeText(String certificateTypeText) {
        this.certificateTypeText = certificateTypeText == null ? null : certificateTypeText.trim();
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public String getBusinessTypeText() {
        return businessTypeText;
    }

    public void setBusinessTypeText(String businessTypeText) {
        this.businessTypeText = businessTypeText == null ? null : businessTypeText.trim();
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public Integer getCollateralType() {
        return collateralType;
    }

    public void setCollateralType(Integer collateralType) {
        this.collateralType = collateralType;
    }

    public String getCollateralTypeText() {
        return collateralTypeText;
    }

    public void setCollateralTypeText(String collateralTypeText) {
        this.collateralTypeText = collateralTypeText == null ? null : collateralTypeText.trim();
    }

    public String getLoanApplication() {
        return loanApplication;
    }

    public void setLoanApplication(String loanApplication) {
        this.loanApplication = loanApplication == null ? null : loanApplication.trim();
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

    public Date getReceivablesDueDate() {
        return receivablesDueDate;
    }
    public String getReceivablesDueDateString() {
        return DateUtil.formateDate(receivablesDueDate);
    }

    public void setReceivablesDueDate(Date receivablesDueDate) {
        this.receivablesDueDate = receivablesDueDate;
    }

    public String getFinancingApplyNo() {
        return financingApplyNo;
    }

    public void setFinancingApplyNo(String financingApplyNo) {
        this.financingApplyNo = financingApplyNo == null ? null : financingApplyNo.trim();
    }

    public Date getSubmitApplyDate() {
        return submitApplyDate;
    }

    public String getSubmitApplyDateString() {
        return DateUtil.formateDate(submitApplyDate);
    }

    public void setSubmitApplyDate(Date submitApplyDate) {
        this.submitApplyDate = submitApplyDate;
    }

    public BigDecimal getExpectTaxAmount() {
        return expectTaxAmount;
    }

    public void setExpectTaxAmount(BigDecimal expectTaxAmount) {
        this.expectTaxAmount = expectTaxAmount;
    }

    public Date getTaxPayDate() {
        return taxPayDate;
    }
    public String getTaxPayDateString() {
        return DateUtil.formateDate(taxPayDate);
    }

    public void setTaxPayDate(Date taxPayDate) {
        this.taxPayDate = taxPayDate;
    }

    public BigDecimal getSelfPayAmount() {
        return selfPayAmount;
    }

    public void setSelfPayAmount(BigDecimal selfPayAmount) {
        this.selfPayAmount = selfPayAmount;
    }

    public String getFinancingContactName() {
        return financingContactName;
    }

    public void setFinancingContactName(String financingContactName) {
        this.financingContactName = financingContactName == null ? null : financingContactName.trim();
    }

    public String getFinancingContactPhone() {
        return financingContactPhone;
    }

    public void setFinancingContactPhone(String financingContactPhone) {
        this.financingContactPhone = financingContactPhone == null ? null : financingContactPhone.trim();
    }

    public String getAgencyAgreementNo() {
        return agencyAgreementNo;
    }

    public void setAgencyAgreementNo(String agencyAgreementNo) {
        this.agencyAgreementNo = agencyAgreementNo == null ? null : agencyAgreementNo.trim();
    }

    public String getFinancingContactEmail() {
        return financingContactEmail;
    }

    public void setFinancingContactEmail(String financingContactEmail) {
        this.financingContactEmail = financingContactEmail == null ? null : financingContactEmail.trim();
    }

    public String getPickUpNo() {
        return pickUpNo;
    }

    public void setPickUpNo(String pickUpNo) {
        this.pickUpNo = pickUpNo == null ? null : pickUpNo.trim();
    }

    public String getPickUpBillNo() {
        return pickUpBillNo;
    }

    public void setPickUpBillNo(String pickUpBillNo) {
        this.pickUpBillNo = pickUpBillNo == null ? null : pickUpBillNo.trim();
    }

    public BigDecimal getFinancingAmount() {
        return financingAmount;
    }

    public void setFinancingAmount(BigDecimal financingAmount) {
        this.financingAmount = financingAmount;
    }

    public Date getFinancingStartDate() {
        return financingStartDate;
    }

    public String getFinancingStartDateString() {
        return DateUtil.formateDate(financingStartDate);
    }

    public void setFinancingStartDate(Date financingStartDate) {
        this.financingStartDate = financingStartDate;
    }

    public Date getFinancingEndDate() {
        return financingEndDate;
    }

    public String getFinancingEndDateString() {
        return DateUtil.formateDate(financingEndDate);
    }

    public void setFinancingEndDate(Date financingEndDate) {
        this.financingEndDate = financingEndDate;
    }

    public Boolean getIsFirstFincancing() {
        return isFirstFincancing;
    }

    public void setIsFirstFincancing(Boolean isFirstFincancing) {
        this.isFirstFincancing = isFirstFincancing;
    }

    public String getIsFirstFincancingText() {
        return isFirstFincancingText;
    }

    public void setIsFirstFincancingText(String isFirstFincancingText) {
        this.isFirstFincancingText = isFirstFincancingText == null ? null : isFirstFincancingText.trim();
    }

    public String getCarInsuranceMode() {
        return carInsuranceMode;
    }

    public void setCarInsuranceMode(String carInsuranceMode) {
        this.carInsuranceMode = carInsuranceMode == null ? null : carInsuranceMode.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public String getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(String billAmount) {
        this.billAmount = billAmount == null ? null : billAmount.trim();
    }

    public String getBillPayBank() {
        return billPayBank;
    }

    public void setBillPayBank(String billPayBank) {
        this.billPayBank = billPayBank == null ? null : billPayBank.trim();
    }

    public Integer getBillTerm() {
        return billTerm;
    }

    public void setBillTerm(Integer billTerm) {
        this.billTerm = billTerm;
    }

    public Date getBillStartDate() {
        return billStartDate;
    }

    public String getBillStartDateString() {
        return DateUtil.formateDate(billStartDate);
    }

    public void setBillStartDate(Date billStartDate) {
        this.billStartDate = billStartDate;
    }

    public Date getBilEndDate() {
        return bilEndDate;
    }

    public String getBilEndDateString() {
        return DateUtil.formateDate(bilEndDate);
    }

    public void setBilEndDate(Date bilEndDate) {
        this.bilEndDate = bilEndDate;
    }

    public String getBillDrawer() {
        return billDrawer;
    }

    public void setBillDrawer(String billDrawer) {
        this.billDrawer = billDrawer == null ? null : billDrawer.trim();
    }

    public String getBillTaker() {
        return billTaker;
    }

    public void setBillTaker(String billTaker) {
        this.billTaker = billTaker == null ? null : billTaker.trim();
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber == null ? null : billNumber.trim();
    }

    public String getBillRemarks() {
        return billRemarks;
    }

    public void setBillRemarks(String billRemarks) {
        this.billRemarks = billRemarks == null ? null : billRemarks.trim();
    }

    public BigDecimal getFinancingPlanAmount() {
        return financingPlanAmount;
    }

    public void setFinancingPlanAmount(BigDecimal financingPlanAmount) {
        this.financingPlanAmount = financingPlanAmount;
    }

    public BigDecimal getFinancingActualAmount() {
        return financingActualAmount;
    }

    public void setFinancingActualAmount(BigDecimal financingActualAmount) {
        this.financingActualAmount = financingActualAmount;
    }

    public String getUseOfFunds() {
        return useOfFunds;
    }

    public void setUseOfFunds(String useOfFunds) {
        this.useOfFunds = useOfFunds == null ? null : useOfFunds.trim();
    }

    public String getFundsSource() {
        return fundsSource;
    }

    public void setFundsSource(String fundsSource) {
        this.fundsSource = fundsSource == null ? null : fundsSource.trim();
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel == null ? null : riskLevel.trim();
    }

    public String getBondCategory() {
        return bondCategory;
    }

    public void setBondCategory(String bondCategory) {
        this.bondCategory = bondCategory == null ? null : bondCategory.trim();
    }

    public String getFinancingCustomerName() {
        return financingCustomerName;
    }

    public void setFinancingCustomerName(String financingCustomerName) {
        this.financingCustomerName = financingCustomerName == null ? null : financingCustomerName.trim();
    }

    public String getFinancingCustomerNo() {
        return financingCustomerNo;
    }

    public void setFinancingCustomerNo(String financingCustomerNo) {
        this.financingCustomerNo = financingCustomerNo == null ? null : financingCustomerNo.trim();
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope == null ? null : businessScope.trim();
    }

    public String getActualOwner() {
        return actualOwner;
    }

    public void setActualOwner(String actualOwner) {
        this.actualOwner = actualOwner == null ? null : actualOwner.trim();
    }

    public String getMainBusiness() {
        return mainBusiness;
    }

    public void setMainBusiness(String mainBusiness) {
        this.mainBusiness = mainBusiness == null ? null : mainBusiness.trim();
    }

    public BigDecimal getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(BigDecimal registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getFinancingCustomerIndustry() {
        return financingCustomerIndustry;
    }

    public void setFinancingCustomerIndustry(String financingCustomerIndustry) {
        this.financingCustomerIndustry = financingCustomerIndustry == null ? null : financingCustomerIndustry.trim();
    }

    public String getFinancingCustomerCharacter() {
        return financingCustomerCharacter;
    }

    public void setFinancingCustomerCharacter(String financingCustomerCharacter) {
        this.financingCustomerCharacter = financingCustomerCharacter == null ? null : financingCustomerCharacter.trim();
    }

    public String getFinancingCustomerBankAccountName() {
        return financingCustomerBankAccountName;
    }

    public void setFinancingCustomerBankAccountName(String financingCustomerBankAccountName) {
        this.financingCustomerBankAccountName = financingCustomerBankAccountName == null ? null : financingCustomerBankAccountName.trim();
    }

    public String getFinancingCustomerBankName() {
        return financingCustomerBankName;
    }

    public void setFinancingCustomerBankName(String financingCustomerBankName) {
        this.financingCustomerBankName = financingCustomerBankName == null ? null : financingCustomerBankName.trim();
    }

    public String getFinancingCustomerBankAccountNo() {
        return financingCustomerBankAccountNo;
    }

    public void setFinancingCustomerBankAccountNo(String financingCustomerBankAccountNo) {
        this.financingCustomerBankAccountNo = financingCustomerBankAccountNo == null ? null : financingCustomerBankAccountNo.trim();
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public String getPurchaseDateString() {
        return DateUtil.formateDate(purchaseDate);
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Boolean getIsFixedTerm() {
        return isFixedTerm;
    }

    public void setIsFixedTerm(Boolean isFixedTerm) {
        this.isFixedTerm = isFixedTerm;
    }

    public String getIsFixedTermText() {
        return isFixedTermText;
    }

    public void setIsFixedTermText(String isFixedTermText) {
        this.isFixedTermText = isFixedTermText == null ? null : isFixedTermText.trim();
    }

    public String getLoanApplyNo() {
        return loanApplyNo;
    }

    public void setLoanApplyNo(String loanApplyNo) {
        this.loanApplyNo = loanApplyNo == null ? null : loanApplyNo.trim();
    }

    public Integer getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(Integer vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public String getVehicleCategoryText() {
        return vehicleCategoryText;
    }

    public void setVehicleCategoryText(String vehicleCategoryText) {
        this.vehicleCategoryText = vehicleCategoryText == null ? null : vehicleCategoryText.trim();
    }

    public String getShadowRating() {
        return shadowRating;
    }

    public void setShadowRating(String shadowRating) {
        this.shadowRating = shadowRating == null ? null : shadowRating.trim();
    }

    public BigDecimal getReceivablesAmount() {
        return receivablesAmount;
    }

    public void setReceivablesAmount(BigDecimal receivablesAmount) {
        this.receivablesAmount = receivablesAmount;
    }

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName == null ? null : loanName.trim();
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getShadowRatingText() {
        return shadowRatingText;
    }

    public void setShadowRatingText(String shadowRatingText) {
        this.shadowRatingText = shadowRatingText == null ? null : shadowRatingText.trim();
    }

    public String getExtendField1() {
        return extendField1;
    }

    public void setExtendField1(String extendField1) {
        this.extendField1 = extendField1 == null ? null : extendField1.trim();
    }

    public Integer getUnderlyingTransactionContractDebtorId() {
        return underlyingTransactionContractDebtorId;
    }

    public void setUnderlyingTransactionContractDebtorId(Integer underlyingTransactionContractDebtorId) {
        this.underlyingTransactionContractDebtorId = underlyingTransactionContractDebtorId;
    }

    public Integer getContractDebtorContactId() {
        return contractDebtorContactId;
    }

    public void setContractDebtorContactId(Integer contractDebtorContactId) {
        this.contractDebtorContactId = contractDebtorContactId;
    }

    public Integer getUnderlyingTransactionContractCreditorId() {
        return underlyingTransactionContractCreditorId;
    }

    public void setUnderlyingTransactionContractCreditorId(Integer underlyingTransactionContractCreditorId) {
        this.underlyingTransactionContractCreditorId = underlyingTransactionContractCreditorId;
    }

    public Integer getContractCreditorContactId() {
        return contractCreditorContactId;
    }

    public void setContractCreditorContactId(Integer contractCreditorContactId) {
        this.contractCreditorContactId = contractCreditorContactId;
    }

    @Override
    public String toString() {
        return
                projectNo +
                        "\001" + companyName +
                        "\001" + customerName +
                        "\001" + certificateType +
                        "\001" + certificateTypeText +
                        "\001" + certificateNo +
                        "\001" + businessType +
                        "\001" + businessTypeText +
                        "\001" + feeRate +
                        "\001" + collateralType +
                        "\001" + collateralTypeText +
                        "\001" + loanApplication +
                        "\001" + underlyingTransactionContractName +
                        "\001" + underlyingTransactionContractNo +
                        "\001" + underlyingTransactionContractDebtor +
                        "\001" + underlyingTransactionContractCreditor +
                        "\001" + invoiceNo +
                        "\001" + invoiceAmount +
                        "\001" + this.getReceivablesDueDateString() +
                        "\001" + financingApplyNo +
                        "\001" + this.getSubmitApplyDateString() +
                        "\001" + expectTaxAmount +
                        "\001" + this.getTaxPayDateString() +
                        "\001" + selfPayAmount +
                        "\001" + financingContactName +
                        "\001" + financingContactPhone +
                        "\001" + agencyAgreementNo +
                        "\001" + financingContactEmail +
                        "\001" + pickUpNo +
                        "\001" + pickUpBillNo +
                        "\001" + financingAmount +
                        "\001" + this.getFinancingStartDateString() +
                        "\001" + this.getFinancingEndDateString() +
                        "\001" + isFirstFincancing +
                        "\001" + isFirstFincancingText +
                        "\001" + carInsuranceMode +
                        "\001" + billNo +
                        "\001" + billAmount +
                        "\001" + billPayBank +
                        "\001" + billTerm +
                        "\001" + this.getBillStartDateString() +
                        "\001" + this.getBilEndDateString() +
                        "\001" + billDrawer +
                        "\001" + billTaker +
                        "\001" + billNumber +
                        "\001" + billRemarks +
                        "\001" + financingPlanAmount +
                        "\001" + financingActualAmount +
                        "\001" + useOfFunds +
                        "\001" + fundsSource +
                        "\001" + riskLevel +
                        "\001" + bondCategory +
                        "\001" + financingCustomerName +
                        "\001" + financingCustomerNo +
                        "\001" + businessScope +
                        "\001" + actualOwner +
                        "\001" + mainBusiness +
                        "\001" + registeredCapital +
                        "\001" + financingCustomerIndustry +
                        "\001" + financingCustomerCharacter +
                        "\001" + financingCustomerBankAccountName +
                        "\001" + financingCustomerBankName +
                        "\001" + financingCustomerBankAccountNo +
                        "\001" + this.getPurchaseDateString() +
                        "\001" + isFixedTerm +
                        "\001" + isFixedTermText +
                        "\001" + loanApplyNo +
                        "\001" + vehicleCategory +
                        "\001" + vehicleCategoryText +
                        "\001" + shadowRating +
                        "\001" + receivablesAmount +
                        "\001" + loanName +
                        "\001" + this.getCreatedTimeString() +
                        "\001" + this.getModifedTimeString() +
                        "\001" + createdUser +
                        "\001" + remarks +
                        "\001" + shadowRatingText +
                        "\001" + extendField1 +
                        "\001" + underlyingTransactionContractDebtorId +
                        "\001" + contractDebtorContactId +
                        "\001" + underlyingTransactionContractCreditorId +
                        "\001" + contractCreditorContactId +
                        '\r';
    }
}