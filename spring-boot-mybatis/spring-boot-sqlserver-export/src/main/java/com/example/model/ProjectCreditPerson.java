package com.example.model;

public class ProjectCreditPerson extends Example{
    private Integer id;

    private Integer projectId;

    private String guarantorName;

    private String guarantorIDCardNo;

    private Boolean guarantorMaritalStatus;

    private String guarantorMaritalStatusText;

    private String guarantorCompany;

    private String guarantorPhone;

    private String guarantorAddress;

    private String guarantorBasicInformation;

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

    public String getGuarantorName() {
        return guarantorName;
    }

    public void setGuarantorName(String guarantorName) {
        this.guarantorName = guarantorName == null ? null : guarantorName.trim();
    }

    public String getGuarantorIDCardNo() {
        return guarantorIDCardNo;
    }

    public void setGuarantorIDCardNo(String guarantorIDCardNo) {
        this.guarantorIDCardNo = guarantorIDCardNo == null ? null : guarantorIDCardNo.trim();
    }

    public Boolean getGuarantorMaritalStatus() {
        return guarantorMaritalStatus;
    }

    public void setGuarantorMaritalStatus(Boolean guarantorMaritalStatus) {
        this.guarantorMaritalStatus = guarantorMaritalStatus;
    }

    public String getGuarantorMaritalStatusText() {
        return guarantorMaritalStatusText;
    }

    public void setGuarantorMaritalStatusText(String guarantorMaritalStatusText) {
        this.guarantorMaritalStatusText = guarantorMaritalStatusText == null ? null : guarantorMaritalStatusText.trim();
    }

    public String getGuarantorCompany() {
        return guarantorCompany;
    }

    public void setGuarantorCompany(String guarantorCompany) {
        this.guarantorCompany = guarantorCompany == null ? null : guarantorCompany.trim();
    }

    public String getGuarantorPhone() {
        return guarantorPhone;
    }

    public void setGuarantorPhone(String guarantorPhone) {
        this.guarantorPhone = guarantorPhone == null ? null : guarantorPhone.trim();
    }

    public String getGuarantorAddress() {
        return guarantorAddress;
    }

    public void setGuarantorAddress(String guarantorAddress) {
        this.guarantorAddress = guarantorAddress == null ? null : guarantorAddress.trim();
    }

    public String getGuarantorBasicInformation() {
        return guarantorBasicInformation;
    }

    public void setGuarantorBasicInformation(String guarantorBasicInformation) {
        this.guarantorBasicInformation = guarantorBasicInformation == null ? null : guarantorBasicInformation.trim();
    }

    @Override
    public String toString() {
        return
                id +
                        "\001" + projectId +
                        "\001" + guarantorName +
                        "\001" + guarantorIDCardNo +
                        "\001" + guarantorMaritalStatus +
                        "\001" + guarantorMaritalStatusText +
                        "\001" + guarantorCompany +
                        "\001" + guarantorPhone +
                        "\001" + guarantorAddress +
                        "\001" + guarantorBasicInformation +
                        '\r';
    }
}