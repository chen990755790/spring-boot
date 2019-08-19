package com.example.model;

import java.math.BigDecimal;

public class ProjectCreditCompany extends Example{
    private Integer id;

    private Integer projectId;

    private String companyCode;

    private String companyGuarantorName;

    private BigDecimal registeredCapitalAmount;

    private String registerAddress;

    private String businessAddress;

    private String companyType;

    private String industry;

    private String legalRepresentativeName;

    private BigDecimal totalAmount;

    private BigDecimal totalLiability;

    private BigDecimal assetLiabilityRatio;

    private BigDecimal totalIncomeAmount;

    private BigDecimal netProfits;

    private Integer guarantorAndFinanceCompanyRelation;

    private String guarantorAndFinanceCompanyRelationText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getCompanyGuarantorName() {
        return companyGuarantorName;
    }

    public void setCompanyGuarantorName(String companyGuarantorName) {
        this.companyGuarantorName = companyGuarantorName == null ? null : companyGuarantorName.trim();
    }

    public BigDecimal getRegisteredCapitalAmount() {
        return registeredCapitalAmount;
    }

    public void setRegisteredCapitalAmount(BigDecimal registeredCapitalAmount) {
        this.registeredCapitalAmount = registeredCapitalAmount;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress == null ? null : registerAddress.trim();
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress == null ? null : businessAddress.trim();
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getLegalRepresentativeName() {
        return legalRepresentativeName;
    }

    public void setLegalRepresentativeName(String legalRepresentativeName) {
        this.legalRepresentativeName = legalRepresentativeName == null ? null : legalRepresentativeName.trim();
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTotalLiability() {
        return totalLiability;
    }

    public void setTotalLiability(BigDecimal totalLiability) {
        this.totalLiability = totalLiability;
    }

    public BigDecimal getAssetLiabilityRatio() {
        return assetLiabilityRatio;
    }

    public void setAssetLiabilityRatio(BigDecimal assetLiabilityRatio) {
        this.assetLiabilityRatio = assetLiabilityRatio;
    }

    public BigDecimal getTotalIncomeAmount() {
        return totalIncomeAmount;
    }

    public void setTotalIncomeAmount(BigDecimal totalIncomeAmount) {
        this.totalIncomeAmount = totalIncomeAmount;
    }

    public BigDecimal getNetProfits() {
        return netProfits;
    }

    public void setNetProfits(BigDecimal netProfits) {
        this.netProfits = netProfits;
    }

    public Integer getGuarantorAndFinanceCompanyRelation() {
        return guarantorAndFinanceCompanyRelation;
    }

    public void setGuarantorAndFinanceCompanyRelation(Integer guarantorAndFinanceCompanyRelation) {
        this.guarantorAndFinanceCompanyRelation = guarantorAndFinanceCompanyRelation;
    }

    public String getGuarantorAndFinanceCompanyRelationText() {
        return guarantorAndFinanceCompanyRelationText;
    }

    public void setGuarantorAndFinanceCompanyRelationText(String guarantorAndFinanceCompanyRelationText) {
        this.guarantorAndFinanceCompanyRelationText = guarantorAndFinanceCompanyRelationText == null ? null : guarantorAndFinanceCompanyRelationText.trim();
    }

    @Override
    public String toString() {
        return
                id +
                        "\001" + projectId +
                        "\001" + companyCode +
                        "\001" + companyGuarantorName +
                        "\001" + registeredCapitalAmount +
                        "\001" + registerAddress +
                        "\001" + businessAddress +
                        "\001" + companyType +
                        "\001" + industry +
                        "\001" + legalRepresentativeName +
                        "\001" + totalAmount +
                        "\001" + totalLiability +
                        "\001" + assetLiabilityRatio +
                        "\001" + totalIncomeAmount +
                        "\001" + netProfits +
                        "\001" + guarantorAndFinanceCompanyRelation +
                        "\001" + guarantorAndFinanceCompanyRelationText +
                        '\r';
    }
}