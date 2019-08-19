package com.example.model;

import com.example.util.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class CompanyBasic extends Example{
    private Integer companyId;

    private String companyName;

    private String registerAddress;

    private String businessAddress;

    private String legalRepresentativeName;

    private Integer legalRepresentativeProofType;

    private String legalRepresentativeProofTypeText;

    private String legalRepresentativeProofNo;

    private Integer companyType;

    private String companyTypeText;

    private Integer companyCharacter;

    private String companyCharacterText;

    private BigDecimal registeredCapitalAmount;
    private Date companyFoundedDate;

    private String companyOperatingPeriod;
    private Date companyOperatingStartDate;

    private String companyOperatingEndDate;

    private String industry;

    private String industryText;

    private String unifiedSocialCreditCode;

    private String businessScope;

    private String businessLicenseNo;

    private String loanCardCode;

    private String relationCompany;

    private String companyHistory;

    private String partnerHistory;

    private String province;

    private String provinceCode;

    private String city;

    private String cityCode;

    private String district;

    private String districtCode;

    private Boolean isListed;

    private String isListedText;
    private Date createdTime;

    private String createdUser;

    private String modifedUser;
    private Date modifedTime;

    private BigDecimal totalEquityAmount;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
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

    public String getLegalRepresentativeName() {
        return legalRepresentativeName;
    }

    public void setLegalRepresentativeName(String legalRepresentativeName) {
        this.legalRepresentativeName = legalRepresentativeName == null ? null : legalRepresentativeName.trim();
    }

    public Integer getLegalRepresentativeProofType() {
        return legalRepresentativeProofType;
    }

    public void setLegalRepresentativeProofType(Integer legalRepresentativeProofType) {
        this.legalRepresentativeProofType = legalRepresentativeProofType;
    }

    public String getLegalRepresentativeProofTypeText() {
        return legalRepresentativeProofTypeText;
    }

    public void setLegalRepresentativeProofTypeText(String legalRepresentativeProofTypeText) {
        this.legalRepresentativeProofTypeText = legalRepresentativeProofTypeText == null ? null : legalRepresentativeProofTypeText.trim();
    }

    public String getLegalRepresentativeProofNo() {
        return legalRepresentativeProofNo;
    }

    public void setLegalRepresentativeProofNo(String legalRepresentativeProofNo) {
        this.legalRepresentativeProofNo = legalRepresentativeProofNo == null ? null : legalRepresentativeProofNo.trim();
    }

    public Integer getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }

    public String getCompanyTypeText() {
        return companyTypeText;
    }

    public void setCompanyTypeText(String companyTypeText) {
        this.companyTypeText = companyTypeText == null ? null : companyTypeText.trim();
    }

    public Integer getCompanyCharacter() {
        return companyCharacter;
    }

    public void setCompanyCharacter(Integer companyCharacter) {
        this.companyCharacter = companyCharacter;
    }

    public String getCompanyCharacterText() {
        return companyCharacterText;
    }

    public void setCompanyCharacterText(String companyCharacterText) {
        this.companyCharacterText = companyCharacterText == null ? null : companyCharacterText.trim();
    }

    public BigDecimal getRegisteredCapitalAmount() {
        return registeredCapitalAmount;
    }

    public void setRegisteredCapitalAmount(BigDecimal registeredCapitalAmount) {
        this.registeredCapitalAmount = registeredCapitalAmount;
    }

    public Date getCompanyFoundedDate() {
        return companyFoundedDate;
    }

    public String getCompanyFoundedDateString() {
        return DateUtil.formateDate(companyFoundedDate);
    }

    public void setCompanyFoundedDate(Date companyFoundedDate) {
        this.companyFoundedDate = companyFoundedDate;
    }

    public String getCompanyOperatingPeriod() {
        return companyOperatingPeriod;
    }

    public void setCompanyOperatingPeriod(String companyOperatingPeriod) {
        this.companyOperatingPeriod = companyOperatingPeriod == null ? null : companyOperatingPeriod.trim();
    }

    public Date getCompanyOperatingStartDate() {
        return companyOperatingStartDate;
    }

    public String getCompanyOperatingStartDateString() {
        return DateUtil.formateDate(companyOperatingStartDate);
    }

    public void setCompanyOperatingStartDate(Date companyOperatingStartDate) {
        this.companyOperatingStartDate = companyOperatingStartDate;
    }

    public String getCompanyOperatingEndDate() {
        return companyOperatingEndDate;
    }

    public void setCompanyOperatingEndDate(String companyOperatingEndDate) {
        this.companyOperatingEndDate = companyOperatingEndDate == null ? null : companyOperatingEndDate.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getIndustryText() {
        return industryText;
    }

    public void setIndustryText(String industryText) {
        this.industryText = industryText == null ? null : industryText.trim();
    }

    public String getUnifiedSocialCreditCode() {
        return unifiedSocialCreditCode;
    }

    public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
        this.unifiedSocialCreditCode = unifiedSocialCreditCode == null ? null : unifiedSocialCreditCode.trim();
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope == null ? null : businessScope.trim();
    }

    public String getBusinessLicenseNo() {
        return businessLicenseNo;
    }

    public void setBusinessLicenseNo(String businessLicenseNo) {
        this.businessLicenseNo = businessLicenseNo == null ? null : businessLicenseNo.trim();
    }

    public String getLoanCardCode() {
        return loanCardCode;
    }

    public void setLoanCardCode(String loanCardCode) {
        this.loanCardCode = loanCardCode == null ? null : loanCardCode.trim();
    }

    public String getRelationCompany() {
        return relationCompany;
    }

    public void setRelationCompany(String relationCompany) {
        this.relationCompany = relationCompany == null ? null : relationCompany.trim();
    }

    public String getCompanyHistory() {
        return companyHistory;
    }

    public void setCompanyHistory(String companyHistory) {
        this.companyHistory = companyHistory == null ? null : companyHistory.trim();
    }

    public String getPartnerHistory() {
        return partnerHistory;
    }

    public void setPartnerHistory(String partnerHistory) {
        this.partnerHistory = partnerHistory == null ? null : partnerHistory.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode == null ? null : districtCode.trim();
    }

    public Boolean getIsListed() {
        return isListed;
    }

    public void setIsListed(Boolean isListed) {
        this.isListed = isListed;
    }

    public String getIsListedText() {
        return isListedText;
    }

    public void setIsListedText(String isListedText) {
        this.isListedText = isListedText == null ? null : isListedText.trim();
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

    public String getModifedUser() {
        return modifedUser;
    }

    public void setModifedUser(String modifedUser) {
        this.modifedUser = modifedUser == null ? null : modifedUser.trim();
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

    public BigDecimal getTotalEquityAmount() {
        return totalEquityAmount;
    }

    public void setTotalEquityAmount(BigDecimal totalEquityAmount) {
        this.totalEquityAmount = totalEquityAmount;
    }

    @Override
    public String toString() {
        return
                companyId +
                        "\001" + companyName +
                        "\001" + registerAddress +
                        "\001" + businessAddress +
                        "\001" + legalRepresentativeName +
                        "\001" + legalRepresentativeProofType +
                        "\001" + legalRepresentativeProofTypeText +
                        "\001" + legalRepresentativeProofNo +
                        "\001" + companyType +
                        "\001" + companyTypeText +
                        "\001" + companyCharacter +
                        "\001" + companyCharacterText +
                        "\001" + registeredCapitalAmount +
                        "\001" + this.getCompanyFoundedDateString() +
                        "\001" + companyOperatingPeriod +
                        "\001" + this.getCompanyOperatingStartDateString() +
                        "\001" + companyOperatingEndDate +
                        "\001" + industry +
                        "\001" + industryText +
                        "\001" + unifiedSocialCreditCode +
                        "\001" + businessScope +
                        "\001" + businessLicenseNo +
                        "\001" + loanCardCode +
                        "\001" + relationCompany +
                        "\001" + companyHistory +
                        "\001" + partnerHistory +
                        "\001" + province +
                        "\001" + provinceCode +
                        "\001" + city +
                        "\001" + cityCode +
                        "\001" + district +
                        "\001" + districtCode +
                        "\001" + isListed +
                        "\001" + isListedText +
                        "\001" + this.getCreatedTimeString() +
                        "\001" + createdUser +
                        "\001" + modifedUser +
                        "\001" + this.getModifedTimeString() +
                        "\001" + totalEquityAmount +
                        '\r';
    }
}