package com.example.model;

import com.example.util.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class LoanCompany extends LoanCompanyKey {
    private String projectNo;

    private String companyName;

    private String industry;

    private String industryText;

    private String companyNo;

    private String customerName;

    private String gender;

    private Integer age;

    private String nationality;

    private Integer maritalStatus;

    private String maritalStatusText;

    private String position;

    private String loanChannel;

    private String creditorChannelsTransfer;

    private Integer businessType;

    private String businessTypeText;

    private Date registerDate;

    private BigDecimal otherChannelsProvideAmount;

    private BigDecimal monthlyInventoryAmount;

    private BigDecimal debtAmount;

    private BigDecimal monthlyAverageAmount;

    private BigDecimal averageMonthlySalesAmount;

    private String businessAddress;

    private String province;

    private Integer provinceCode;

    private String city;

    private Integer cityCode;

    private String creditLevel;

    private String creditScore;

    private Integer creditScoreCode;

    private Integer creditLevelCode;

    private String certificateNo;

    private Integer certificateType;

    private String loanName;

    private Date createdTime;

    private Date modifedTime;

    private String createdUser;

    private String certificateTypeText;

    private String loanBankName;

    private String loanBankCard;

    private String loanBankAddress;

    private String repaymentBankName;

    private String repaymentBankCard;

    private String repaymentAddress;

    private String unifiedSocialCreditCode;

    private String legalRepresentativeName;

    private Integer legalRepresentativeProofType;

    private String legalRepresentativeProofTypeText;

    private String legalRepresentativeProofNo;

    private Integer districtCode;

    private String district;

    private String remarks;

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

    public String getCompanyNo() {
        return companyNo;
    }

    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo == null ? null : companyNo.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMaritalStatusText() {
        return maritalStatusText;
    }

    public void setMaritalStatusText(String maritalStatusText) {
        this.maritalStatusText = maritalStatusText == null ? null : maritalStatusText.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getLoanChannel() {
        return loanChannel;
    }

    public void setLoanChannel(String loanChannel) {
        this.loanChannel = loanChannel == null ? null : loanChannel.trim();
    }

    public String getCreditorChannelsTransfer() {
        return creditorChannelsTransfer;
    }

    public void setCreditorChannelsTransfer(String creditorChannelsTransfer) {
        this.creditorChannelsTransfer = creditorChannelsTransfer == null ? null : creditorChannelsTransfer.trim();
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

    public Date getRegisterDate() {
        return registerDate;
    }

    public String getRegisterDateString() {
        return DateUtil.formateDate(registerDate);
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public BigDecimal getOtherChannelsProvideAmount() {
        return otherChannelsProvideAmount;
    }

    public void setOtherChannelsProvideAmount(BigDecimal otherChannelsProvideAmount) {
        this.otherChannelsProvideAmount = otherChannelsProvideAmount;
    }

    public BigDecimal getMonthlyInventoryAmount() {
        return monthlyInventoryAmount;
    }

    public void setMonthlyInventoryAmount(BigDecimal monthlyInventoryAmount) {
        this.monthlyInventoryAmount = monthlyInventoryAmount;
    }

    public BigDecimal getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
    }

    public BigDecimal getMonthlyAverageAmount() {
        return monthlyAverageAmount;
    }

    public void setMonthlyAverageAmount(BigDecimal monthlyAverageAmount) {
        this.monthlyAverageAmount = monthlyAverageAmount;
    }

    public BigDecimal getAverageMonthlySalesAmount() {
        return averageMonthlySalesAmount;
    }

    public void setAverageMonthlySalesAmount(BigDecimal averageMonthlySalesAmount) {
        this.averageMonthlySalesAmount = averageMonthlySalesAmount;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress == null ? null : businessAddress.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public String getCreditLevel() {
        return creditLevel;
    }

    public void setCreditLevel(String creditLevel) {
        this.creditLevel = creditLevel == null ? null : creditLevel.trim();
    }

    public String getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore == null ? null : creditScore.trim();
    }

    public Integer getCreditScoreCode() {
        return creditScoreCode;
    }

    public void setCreditScoreCode(Integer creditScoreCode) {
        this.creditScoreCode = creditScoreCode;
    }

    public Integer getCreditLevelCode() {
        return creditLevelCode;
    }

    public void setCreditLevelCode(Integer creditLevelCode) {
        this.creditLevelCode = creditLevelCode;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
    }

    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
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

    public String getCertificateTypeText() {
        return certificateTypeText;
    }

    public void setCertificateTypeText(String certificateTypeText) {
        this.certificateTypeText = certificateTypeText == null ? null : certificateTypeText.trim();
    }

    public String getLoanBankName() {
        return loanBankName;
    }

    public void setLoanBankName(String loanBankName) {
        this.loanBankName = loanBankName == null ? null : loanBankName.trim();
    }

    public String getLoanBankCard() {
        return loanBankCard;
    }

    public void setLoanBankCard(String loanBankCard) {
        this.loanBankCard = loanBankCard == null ? null : loanBankCard.trim();
    }

    public String getLoanBankAddress() {
        return loanBankAddress;
    }

    public void setLoanBankAddress(String loanBankAddress) {
        this.loanBankAddress = loanBankAddress == null ? null : loanBankAddress.trim();
    }

    public String getRepaymentBankName() {
        return repaymentBankName;
    }

    public void setRepaymentBankName(String repaymentBankName) {
        this.repaymentBankName = repaymentBankName == null ? null : repaymentBankName.trim();
    }

    public String getRepaymentBankCard() {
        return repaymentBankCard;
    }

    public void setRepaymentBankCard(String repaymentBankCard) {
        this.repaymentBankCard = repaymentBankCard == null ? null : repaymentBankCard.trim();
    }

    public String getRepaymentAddress() {
        return repaymentAddress;
    }

    public void setRepaymentAddress(String repaymentAddress) {
        this.repaymentAddress = repaymentAddress == null ? null : repaymentAddress.trim();
    }

    public String getUnifiedSocialCreditCode() {
        return unifiedSocialCreditCode;
    }

    public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
        this.unifiedSocialCreditCode = unifiedSocialCreditCode == null ? null : unifiedSocialCreditCode.trim();
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

    public Integer getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(Integer districtCode) {
        this.districtCode = districtCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    @Override
    public String toString() {
        return
                projectNo +
                        "\001" + companyName +
                        "\001" + industry +
                        "\001" + industryText +
                        "\001" + companyNo +
                        "\001" + customerName +
                        "\001" + gender +
                        "\001" + age +
                        "\001" + nationality +
                        "\001" + maritalStatus +
                        "\001" + maritalStatusText +
                        "\001" + position +
                        "\001" + loanChannel +
                        "\001" + creditorChannelsTransfer +
                        "\001" + businessType +
                        "\001" + businessTypeText +
                        "\001" + this.getRegisterDateString() +
                        "\001" + otherChannelsProvideAmount +
                        "\001" + monthlyInventoryAmount +
                        "\001" + debtAmount +
                        "\001" + monthlyAverageAmount +
                        "\001" + averageMonthlySalesAmount +
                        "\001" + businessAddress +
                        "\001" + province +
                        "\001" + provinceCode +
                        "\001" + city +
                        "\001" + cityCode +
                        "\001" + creditLevel +
                        "\001" + creditScore +
                        "\001" + creditScoreCode +
                        "\001" + creditLevelCode +
                        "\001" + certificateNo +
                        "\001" + certificateType +
                        "\001" + loanName +
                        "\001" + this.getCreatedTimeString() +
                        "\001" + this.getModifedTimeString() +
                        "\001" + createdUser +
                        "\001" + certificateTypeText +
                        "\001" + loanBankName +
                        "\001" + loanBankCard +
                        "\001" + loanBankAddress +
                        "\001" + repaymentBankName +
                        "\001" + repaymentBankCard +
                        "\001" + repaymentAddress +
                        "\001" + unifiedSocialCreditCode +
                        "\001" + legalRepresentativeName +
                        "\001" + legalRepresentativeProofType +
                        "\001" + legalRepresentativeProofTypeText +
                        "\001" + legalRepresentativeProofNo +
                        "\001" + districtCode +
                        "\001" + district +
                        "\001" + remarks +
                        '\r';
    }
}