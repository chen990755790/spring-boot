package com.example.model;

import com.example.util.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class LoanCommonBorrower extends Example{
    private Integer commonBorrowerId;

    private String projectNo;

    private String loanNo;

    private String loanName;

    private String commonBorrowerName;

    private String relationsWithBorrowersText;

    private Integer certificateType;

    private String certificateTypeText;

    private String certificateNo;

    private Date birthDate;

    private Integer maritalStatus;

    private String maritalStatusText;

    private String phoneNo;

    private BigDecimal share;

    private Boolean creditRecordIsNull;

    private String spouseName;

    private String spouseBorrowerRelationsText;

    private Integer spouseCertificateType;

    private String spouseCertificateTypeText;

    private String spouseCertificateNo;

    private Date spouseBirthDate;

    private String spousePhoneNo;

    private BigDecimal spouseShare;

    private Boolean spouseCreditRecordIsNull;

    private Date createdTime;

    private String createdUser;

    private Date updateTime;

    private String remarks;

    public Integer getCommonBorrowerId() {
        return commonBorrowerId;
    }

    public void setCommonBorrowerId(Integer commonBorrowerId) {
        this.commonBorrowerId = commonBorrowerId;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName == null ? null : loanName.trim();
    }

    public String getCommonBorrowerName() {
        return commonBorrowerName;
    }

    public void setCommonBorrowerName(String commonBorrowerName) {
        this.commonBorrowerName = commonBorrowerName == null ? null : commonBorrowerName.trim();
    }

    public String getRelationsWithBorrowersText() {
        return relationsWithBorrowersText;
    }

    public void setRelationsWithBorrowersText(String relationsWithBorrowersText) {
        this.relationsWithBorrowersText = relationsWithBorrowersText == null ? null : relationsWithBorrowersText.trim();
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

    public Date getBirthDate() {
        return birthDate;
    }
    public String getBirthDateString() {
        return DateUtil.formateDate(birthDate);
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo == null ? null : phoneNo.trim();
    }

    public BigDecimal getShare() {
        return share;
    }

    public void setShare(BigDecimal share) {
        this.share = share;
    }

    public Boolean getCreditRecordIsNull() {
        return creditRecordIsNull;
    }

    public void setCreditRecordIsNull(Boolean creditRecordIsNull) {
        this.creditRecordIsNull = creditRecordIsNull;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName == null ? null : spouseName.trim();
    }

    public String getSpouseBorrowerRelationsText() {
        return spouseBorrowerRelationsText;
    }

    public void setSpouseBorrowerRelationsText(String spouseBorrowerRelationsText) {
        this.spouseBorrowerRelationsText = spouseBorrowerRelationsText == null ? null : spouseBorrowerRelationsText.trim();
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

    public Date getSpouseBirthDate() {
        return spouseBirthDate;
    }
    public String getSpouseBirthDateString() {
        return DateUtil.formateDate(spouseBirthDate);
    }

    public void setSpouseBirthDate(Date spouseBirthDate) {
        this.spouseBirthDate = spouseBirthDate;
    }

    public String getSpousePhoneNo() {
        return spousePhoneNo;
    }

    public void setSpousePhoneNo(String spousePhoneNo) {
        this.spousePhoneNo = spousePhoneNo == null ? null : spousePhoneNo.trim();
    }

    public BigDecimal getSpouseShare() {
        return spouseShare;
    }

    public void setSpouseShare(BigDecimal spouseShare) {
        this.spouseShare = spouseShare;
    }

    public Boolean getSpouseCreditRecordIsNull() {
        return spouseCreditRecordIsNull;
    }

    public void setSpouseCreditRecordIsNull(Boolean spouseCreditRecordIsNull) {
        this.spouseCreditRecordIsNull = spouseCreditRecordIsNull;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public String getUpdateTimeString() {
        return DateUtil.formateDate(updateTime);
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
                commonBorrowerId +
                        "\001" + projectNo +
                        "\001" + loanNo +
                        "\001" + loanName +
                        "\001" + commonBorrowerName +
                        "\001" + relationsWithBorrowersText +
                        "\001" + certificateType +
                        "\001" + certificateTypeText +
                        "\001" + certificateNo +
                        "\001" + this.getBirthDateString() +
                        "\001" + maritalStatus +
                        "\001" + maritalStatusText +
                        "\001" + phoneNo +
                        "\001" + share +
                        "\001" + creditRecordIsNull +
                        "\001" + spouseName +
                        "\001" + spouseBorrowerRelationsText +
                        "\001" + spouseCertificateType +
                        "\001" + spouseCertificateTypeText +
                        "\001" + spouseCertificateNo +
                        "\001" + this.getSpouseBirthDateString() +
                        "\001" + spousePhoneNo +
                        "\001" + spouseShare +
                        "\001" + spouseCreditRecordIsNull +
                        "\001" + this.getCreatedTimeString() +
                        "\001" + createdUser +
                        "\001" + this.getUpdateTimeString() +
                        "\001" + remarks +
                        '\r';
    }
}