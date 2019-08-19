package com.example.model;

import com.example.util.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class LoanUser extends LoanUserKey {
    private String projectNo;

    private String customerName;

    private Integer certificateType;

    private String certificateTypeText;

    private String certificateNo;
    private Date certificateValidityPeriod;

    private String nationality;

    private String province;

    private String city;

    private String district;

    private Integer provinceCode;

    private Integer cityCode;

    private Integer districtCode;

    private String gender;

    private String officePhone;

    private BigDecimal workingYears;

    private String position;

    private String industryExperience;

    private String industryExperienceBasis;

    private String censusRegisterAddress;

    private String houseAddress;

    private Integer houseCharacter;

    private String houseCharacterText;
    private Date startLiveDate;

    private Integer educationStatus;

    private String educationStatusText;

    private Integer maritalStatus;

    private String maritalStatusText;
    private Date divorceDate;

    private String weChatNo;

    private String email;

    private String telephone;

    private String customerSource;

    private String agencyName;

    private String accountManager;

    private String region;

    private Boolean isOpenInventoryPermissions;

    private Integer workType;

    private String workTypeText;

    private Integer workIndustry;

    private String workIndustryText;
    private Date workStartDate;
    private Date workEndDate;

    private String workUnit;

    private String companyAddress;

    private Boolean isPaymentSocialSecurity;

    private Integer socialSecurityFixedNumberYears;

    private String post;

    private String phone;

    private Integer personalAnnualIncome;

    private String personalAnnualIncomeText;

    private Integer familyAnnualIncome;

    private String familyAnnualIncomeText;

    private String spouseName;

    private String spouseGender;
    private Date spouseBirthday;

    private Integer spouseCertificateType;

    private String spouseCertificateTypeText;

    private String spouseCertificateNo;

    private Integer spouseEducation;

    private String spouseEducationText;

    private String spouseTelephone;

    private String spouseHouseAddress;

    private Integer spouseWorkType;

    private String spouseWorkTypeText;

    private String spouseWorkUnit;

    private String childSituation;

    private String haveChildren;

    private Integer outstandingBusinessLoansCount;

    private BigDecimal unfinishedLoanAmount;

    private BigDecimal unfinishedLoanBalanceAmount;

    private Integer externalGuaranteesCount;

    private BigDecimal externalGuaranteeBalanceAmount;

    private Integer overdueCount;

    private BigDecimal overdueMaxAmount;

    private BigDecimal overdueCurrentAmount;

    private Integer overdueMaxDays;

    private String remarks;

    private String loanName;

    private Date createdTime;

    private Date modifedTime;

    private String createdUser;

    private String loanBankName;

    private String loanBankCard;

    private String loanBankAddress;

    private String repaymentBankName;

    private String repaymentBankCard;

    private String repaymentAddress;

    private Date birthDate;

    private BigDecimal creditAmount;

    private Integer creditLevel;

    private String creditLevelText;

    private BigDecimal creditScore;

    private Boolean creditRecordIsNull;

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
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

    public Date getCertificateValidityPeriod() {
        return certificateValidityPeriod;
    }

    public String getCertificateValidityPeriodString() {
        return DateUtil.formateDate(certificateValidityPeriod);
    }

    public void setCertificateValidityPeriod(Date certificateValidityPeriod) {
        this.certificateValidityPeriod = certificateValidityPeriod;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(Integer districtCode) {
        this.districtCode = districtCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone == null ? null : officePhone.trim();
    }

    public BigDecimal getWorkingYears() {
        return workingYears;
    }

    public void setWorkingYears(BigDecimal workingYears) {
        this.workingYears = workingYears;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getIndustryExperience() {
        return industryExperience;
    }

    public void setIndustryExperience(String industryExperience) {
        this.industryExperience = industryExperience == null ? null : industryExperience.trim();
    }

    public String getIndustryExperienceBasis() {
        return industryExperienceBasis;
    }

    public void setIndustryExperienceBasis(String industryExperienceBasis) {
        this.industryExperienceBasis = industryExperienceBasis == null ? null : industryExperienceBasis.trim();
    }

    public String getCensusRegisterAddress() {
        return censusRegisterAddress;
    }

    public void setCensusRegisterAddress(String censusRegisterAddress) {
        this.censusRegisterAddress = censusRegisterAddress == null ? null : censusRegisterAddress.trim();
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress == null ? null : houseAddress.trim();
    }

    public Integer getHouseCharacter() {
        return houseCharacter;
    }

    public void setHouseCharacter(Integer houseCharacter) {
        this.houseCharacter = houseCharacter;
    }

    public String getHouseCharacterText() {
        return houseCharacterText;
    }

    public void setHouseCharacterText(String houseCharacterText) {
        this.houseCharacterText = houseCharacterText == null ? null : houseCharacterText.trim();
    }

    public Date getStartLiveDate() {
        return startLiveDate;
    }

    public String getStartLiveDateString() {
        return DateUtil.formateDate(startLiveDate);
    }

    public void setStartLiveDate(Date startLiveDate) {
        this.startLiveDate = startLiveDate;
    }

    public Integer getEducationStatus() {
        return educationStatus;
    }

    public void setEducationStatus(Integer educationStatus) {
        this.educationStatus = educationStatus;
    }

    public String getEducationStatusText() {
        return educationStatusText;
    }

    public void setEducationStatusText(String educationStatusText) {
        this.educationStatusText = educationStatusText == null ? null : educationStatusText.trim();
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

    public Date getDivorceDate() {
        return divorceDate;
    }

    public String getDivorceDateString() {
        return DateUtil.formateDate(divorceDate);
    }

    public void setDivorceDate(Date divorceDate) {
        this.divorceDate = divorceDate;
    }

    public String getWeChatNo() {
        return weChatNo;
    }

    public void setWeChatNo(String weChatNo) {
        this.weChatNo = weChatNo == null ? null : weChatNo.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getCustomerSource() {
        return customerSource;
    }

    public void setCustomerSource(String customerSource) {
        this.customerSource = customerSource == null ? null : customerSource.trim();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName == null ? null : agencyName.trim();
    }

    public String getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(String accountManager) {
        this.accountManager = accountManager == null ? null : accountManager.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Boolean getIsOpenInventoryPermissions() {
        return isOpenInventoryPermissions;
    }

    public void setIsOpenInventoryPermissions(Boolean isOpenInventoryPermissions) {
        this.isOpenInventoryPermissions = isOpenInventoryPermissions;
    }

    public Integer getWorkType() {
        return workType;
    }

    public void setWorkType(Integer workType) {
        this.workType = workType;
    }

    public String getWorkTypeText() {
        return workTypeText;
    }

    public void setWorkTypeText(String workTypeText) {
        this.workTypeText = workTypeText == null ? null : workTypeText.trim();
    }

    public Integer getWorkIndustry() {
        return workIndustry;
    }

    public void setWorkIndustry(Integer workIndustry) {
        this.workIndustry = workIndustry;
    }

    public String getWorkIndustryText() {
        return workIndustryText;
    }

    public void setWorkIndustryText(String workIndustryText) {
        this.workIndustryText = workIndustryText == null ? null : workIndustryText.trim();
    }

    public Date getWorkStartDate() {
        return workStartDate;
    }

    public String getWorkStartDateString() {
        return DateUtil.formateDate(workStartDate);
    }

    public void setWorkStartDate(Date workStartDate) {
        this.workStartDate = workStartDate;
    }

    public Date getWorkEndDate() {
        return workEndDate;
    }

    public String getWorkEndDateString() {
        return DateUtil.formateDate(workEndDate);
    }

    public void setWorkEndDate(Date workEndDate) {
        this.workEndDate = workEndDate;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit == null ? null : workUnit.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public Boolean getIsPaymentSocialSecurity() {
        return isPaymentSocialSecurity;
    }

    public void setIsPaymentSocialSecurity(Boolean isPaymentSocialSecurity) {
        this.isPaymentSocialSecurity = isPaymentSocialSecurity;
    }

    public Integer getSocialSecurityFixedNumberYears() {
        return socialSecurityFixedNumberYears;
    }

    public void setSocialSecurityFixedNumberYears(Integer socialSecurityFixedNumberYears) {
        this.socialSecurityFixedNumberYears = socialSecurityFixedNumberYears;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getPersonalAnnualIncome() {
        return personalAnnualIncome;
    }

    public void setPersonalAnnualIncome(Integer personalAnnualIncome) {
        this.personalAnnualIncome = personalAnnualIncome;
    }

    public String getPersonalAnnualIncomeText() {
        return personalAnnualIncomeText;
    }

    public void setPersonalAnnualIncomeText(String personalAnnualIncomeText) {
        this.personalAnnualIncomeText = personalAnnualIncomeText == null ? null : personalAnnualIncomeText.trim();
    }

    public Integer getFamilyAnnualIncome() {
        return familyAnnualIncome;
    }

    public void setFamilyAnnualIncome(Integer familyAnnualIncome) {
        this.familyAnnualIncome = familyAnnualIncome;
    }

    public String getFamilyAnnualIncomeText() {
        return familyAnnualIncomeText;
    }

    public void setFamilyAnnualIncomeText(String familyAnnualIncomeText) {
        this.familyAnnualIncomeText = familyAnnualIncomeText == null ? null : familyAnnualIncomeText.trim();
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName == null ? null : spouseName.trim();
    }

    public String getSpouseGender() {
        return spouseGender;
    }

    public void setSpouseGender(String spouseGender) {
        this.spouseGender = spouseGender == null ? null : spouseGender.trim();
    }

    public Date getSpouseBirthday() {
        return spouseBirthday;
    }

    public String getSpouseBirthdayString() {
        return DateUtil.formateDate(spouseBirthday);
    }

    public void setSpouseBirthday(Date spouseBirthday) {
        this.spouseBirthday = spouseBirthday;
    }

    public Integer getSpouseCertificateType() {
        return spouseCertificateType;
    }

    public void setSpouseCertificateType(Integer spouseCertificateType) {
        this.spouseCertificateType = spouseCertificateType;
    }

    public String getSpouseCertificateTypeText() {
        return spouseCertificateTypeText;
    }

    public void setSpouseCertificateTypeText(String spouseCertificateTypeText) {
        this.spouseCertificateTypeText = spouseCertificateTypeText == null ? null : spouseCertificateTypeText.trim();
    }

    public String getSpouseCertificateNo() {
        return spouseCertificateNo;
    }

    public void setSpouseCertificateNo(String spouseCertificateNo) {
        this.spouseCertificateNo = spouseCertificateNo == null ? null : spouseCertificateNo.trim();
    }

    public Integer getSpouseEducation() {
        return spouseEducation;
    }

    public void setSpouseEducation(Integer spouseEducation) {
        this.spouseEducation = spouseEducation;
    }

    public String getSpouseEducationText() {
        return spouseEducationText;
    }

    public void setSpouseEducationText(String spouseEducationText) {
        this.spouseEducationText = spouseEducationText == null ? null : spouseEducationText.trim();
    }

    public String getSpouseTelephone() {
        return spouseTelephone;
    }

    public void setSpouseTelephone(String spouseTelephone) {
        this.spouseTelephone = spouseTelephone == null ? null : spouseTelephone.trim();
    }

    public String getSpouseHouseAddress() {
        return spouseHouseAddress;
    }

    public void setSpouseHouseAddress(String spouseHouseAddress) {
        this.spouseHouseAddress = spouseHouseAddress == null ? null : spouseHouseAddress.trim();
    }

    public Integer getSpouseWorkType() {
        return spouseWorkType;
    }

    public void setSpouseWorkType(Integer spouseWorkType) {
        this.spouseWorkType = spouseWorkType;
    }

    public String getSpouseWorkTypeText() {
        return spouseWorkTypeText;
    }

    public void setSpouseWorkTypeText(String spouseWorkTypeText) {
        this.spouseWorkTypeText = spouseWorkTypeText == null ? null : spouseWorkTypeText.trim();
    }

    public String getSpouseWorkUnit() {
        return spouseWorkUnit;
    }

    public void setSpouseWorkUnit(String spouseWorkUnit) {
        this.spouseWorkUnit = spouseWorkUnit == null ? null : spouseWorkUnit.trim();
    }

    public String getChildSituation() {
        return childSituation;
    }

    public void setChildSituation(String childSituation) {
        this.childSituation = childSituation == null ? null : childSituation.trim();
    }

    public String getHaveChildren() {
        return haveChildren;
    }

    public void setHaveChildren(String haveChildren) {
        this.haveChildren = haveChildren == null ? null : haveChildren.trim();
    }

    public Integer getOutstandingBusinessLoansCount() {
        return outstandingBusinessLoansCount;
    }

    public void setOutstandingBusinessLoansCount(Integer outstandingBusinessLoansCount) {
        this.outstandingBusinessLoansCount = outstandingBusinessLoansCount;
    }

    public BigDecimal getUnfinishedLoanAmount() {
        return unfinishedLoanAmount;
    }

    public void setUnfinishedLoanAmount(BigDecimal unfinishedLoanAmount) {
        this.unfinishedLoanAmount = unfinishedLoanAmount;
    }

    public BigDecimal getUnfinishedLoanBalanceAmount() {
        return unfinishedLoanBalanceAmount;
    }

    public void setUnfinishedLoanBalanceAmount(BigDecimal unfinishedLoanBalanceAmount) {
        this.unfinishedLoanBalanceAmount = unfinishedLoanBalanceAmount;
    }

    public Integer getExternalGuaranteesCount() {
        return externalGuaranteesCount;
    }

    public void setExternalGuaranteesCount(Integer externalGuaranteesCount) {
        this.externalGuaranteesCount = externalGuaranteesCount;
    }

    public BigDecimal getExternalGuaranteeBalanceAmount() {
        return externalGuaranteeBalanceAmount;
    }

    public void setExternalGuaranteeBalanceAmount(BigDecimal externalGuaranteeBalanceAmount) {
        this.externalGuaranteeBalanceAmount = externalGuaranteeBalanceAmount;
    }

    public Integer getOverdueCount() {
        return overdueCount;
    }

    public void setOverdueCount(Integer overdueCount) {
        this.overdueCount = overdueCount;
    }

    public BigDecimal getOverdueMaxAmount() {
        return overdueMaxAmount;
    }

    public void setOverdueMaxAmount(BigDecimal overdueMaxAmount) {
        this.overdueMaxAmount = overdueMaxAmount;
    }

    public BigDecimal getOverdueCurrentAmount() {
        return overdueCurrentAmount;
    }

    public void setOverdueCurrentAmount(BigDecimal overdueCurrentAmount) {
        this.overdueCurrentAmount = overdueCurrentAmount;
    }

    public Integer getOverdueMaxDays() {
        return overdueMaxDays;
    }

    public void setOverdueMaxDays(Integer overdueMaxDays) {
        this.overdueMaxDays = overdueMaxDays;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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

    public Date getBirthDate() {
        return birthDate;
    }

    public String getBirthDateString() {
        return DateUtil.formateDate(birthDate);
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public Integer getCreditLevel() {
        return creditLevel;
    }

    public void setCreditLevel(Integer creditLevel) {
        this.creditLevel = creditLevel;
    }

    public String getCreditLevelText() {
        return creditLevelText;
    }

    public void setCreditLevelText(String creditLevelText) {
        this.creditLevelText = creditLevelText == null ? null : creditLevelText.trim();
    }

    public BigDecimal getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(BigDecimal creditScore) {
        this.creditScore = creditScore;
    }

    public Boolean getCreditRecordIsNull() {
        return creditRecordIsNull;
    }

    public void setCreditRecordIsNull(Boolean creditRecordIsNull) {
        this.creditRecordIsNull = creditRecordIsNull;
    }

    @Override
    public String toString() {
        return
                projectNo +
                        "\001" + customerName +
                        "\001" + certificateType +
                        "\001" + certificateTypeText +
                        "\001" + certificateNo +
                        "\001" + this.getCertificateValidityPeriodString() +
                        "\001" + nationality +
                        "\001" + province +
                        "\001" + city +
                        "\001" + district +
                        "\001" + provinceCode +
                        "\001" + cityCode +
                        "\001" + districtCode +
                        "\001" + gender +
                        "\001" + officePhone +
                        "\001" + workingYears +
                        "\001" + position +
                        "\001" + industryExperience +
                        "\001" + industryExperienceBasis +
                        "\001" + censusRegisterAddress +
                        "\001" + houseAddress +
                        "\001" + houseCharacter +
                        "\001" + houseCharacterText +
                        "\001" + this.getStartLiveDateString() +
                        "\001" + educationStatus +
                        "\001" + educationStatusText +
                        "\001" + maritalStatus +
                        "\001" + maritalStatusText +
                        "\001" + this.getDivorceDateString() +
                        "\001" + weChatNo +
                        "\001" + email +
                        "\001" + telephone +
                        "\001" + customerSource +
                        "\001" + agencyName +
                        "\001" + accountManager +
                        "\001" + region +
                        "\001" + isOpenInventoryPermissions +
                        "\001" + workType +
                        "\001" + workTypeText +
                        "\001" + workIndustry +
                        "\001" + workIndustryText +
                        "\001" + this.getWorkStartDateString() +
                        "\001" + this.getWorkEndDateString() +
                        "\001" + workUnit +
                        "\001" + companyAddress +
                        "\001" + isPaymentSocialSecurity +
                        "\001" + socialSecurityFixedNumberYears +
                        "\001" + post +
                        "\001" + phone +
                        "\001" + personalAnnualIncome +
                        "\001" + personalAnnualIncomeText +
                        "\001" + familyAnnualIncome +
                        "\001" + familyAnnualIncomeText +
                        "\001" + spouseName +
                        "\001" + spouseGender +
                        "\001" + this.getSpouseBirthdayString() +
                        "\001" + spouseCertificateType +
                        "\001" + spouseCertificateTypeText +
                        "\001" + spouseCertificateNo +
                        "\001" + spouseEducation +
                        "\001" + spouseEducationText +
                        "\001" + spouseTelephone +
                        "\001" + spouseHouseAddress +
                        "\001" + spouseWorkType +
                        "\001" + spouseWorkTypeText +
                        "\001" + spouseWorkUnit +
                        "\001" + childSituation +
                        "\001" + haveChildren +
                        "\001" + outstandingBusinessLoansCount +
                        "\001" + unfinishedLoanAmount +
                        "\001" + unfinishedLoanBalanceAmount +
                        "\001" + externalGuaranteesCount +
                        "\001" + externalGuaranteeBalanceAmount +
                        "\001" + overdueCount +
                        "\001" + overdueMaxAmount +
                        "\001" + overdueCurrentAmount +
                        "\001" + overdueMaxDays +
                        "\001" + remarks +
                        "\001" + loanName +
                        "\001" + this.getCreatedTimeString() +
                        "\001" + this.getModifedTimeString() +
                        "\001" + createdUser +
                        "\001" + loanBankName +
                        "\001" + loanBankCard +
                        "\001" + loanBankAddress +
                        "\001" + repaymentBankName +
                        "\001" + repaymentBankCard +
                        "\001" + repaymentAddress +
                        "\001" + this.getBirthDateString() +
                        "\001" + creditAmount +
                        "\001" + creditLevel +
                        "\001" + creditLevelText +
                        "\001" + creditScore +
                        "\001" + creditRecordIsNull +
                        '\r';
    }
}