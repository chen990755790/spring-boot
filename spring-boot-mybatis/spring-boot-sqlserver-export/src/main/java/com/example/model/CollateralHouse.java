package com.example.model;

import com.example.util.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class CollateralHouse extends Example{
    private String id;

    private String loanNo;

    private String projectNo;

    private String houseNo;

    private String houseRegisterCity;

    private String houseRegisterCityText;

    private String houseRegisterDistinct;

    private String houseRegisterDistinctText;

    private String buildingName;

    private BigDecimal buildingArea;

    private String houseType;

    private String houseTypeText;

    private String collertalModel;

    private String collertalModelText;

    private String houseAddress;

    private String propertyOwner;

    private String propertyOwnerICertificateType;

    private String propertyOwnerICertificateTypeText;

    private String propertyOwnerCertificateNo;

    private BigDecimal mortgagedLoanBalanceAmount;

    private BigDecimal valuationPrice;

    private BigDecimal unitPrice;

    private Integer houseAge;

    private String roomType;

    private String roomTypeText;

    private BigDecimal houseMortgageRate;

    private Boolean isOnlyHouseForFamily;

    private String isOnlyHouseForFamilyText;

    private Integer mortgageType;

    private String mortgageTypeText;

    private Boolean isDebtor;

    private String isDebtorText;

    private String oneMortgageType;

    private String oneMortgageTypeText;

    private BigDecimal oneMortgageAmount;

    private String oneMortgageTerm;

    private String notaryFinishInfo;

    private String notaryFinishInfoText;

    private String mortgageFinishInfo;

    private String mortgageFinishInfoText;

    private Integer houseFloor;

    private Integer buildingFloor;

    private String buildingStates;

    private String buildingStatesText;

    private String houseEstimateAgency;

    private String guarantorAndBorrowerRelationship;

    private String guarantorAndBorrowerRelationshipText;

    private String guarantorType;

    private String guarantorTypeText;

    private String guarantorName;

    private String guarantorIDNumber;
    private Date creationTime;
    private Date modifyTime;

    private String remark;

    private String createdUser;

    private String provence;

    private String provenceText;

    private Integer yearOfPropertyRights;

    private String buildingNo;

    private String orientation;

    private String orientationText;
    private Date certificateDate;

    private String planUtilization;

    private String planUtilizationText;

    private String houseProperty;

    private String housePropertyText;

    private String houseSituation;

    private String houseSituationText;

    private String landSource;

    private String landSourceText;

    private String landUse;

    private String landUseText;

    private Integer completionTime;

    private Boolean isTransaction;

    private String isTransactionText;

    private Boolean isFreeze;

    private String isFreezeText;

    private Boolean isOnlyHousing;

    private String isOnlyHousingText;

    private Boolean isDispute;

    private String isDisputeText;

    private Boolean isThrough;

    private String isThroughText;

    private Boolean isDisposition;

    private String isDispositionText;

    private String roomNumber;

    public String getCreationTimeString() {
        return DateUtil.formateDate(creationTime);
    }

    public String getModifyTimeString() {
        return DateUtil.formateDate(modifyTime);
    }

    public String getCertificateDateString() {
        return DateUtil.formateDate(certificateDate);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

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

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo == null ? null : houseNo.trim();
    }

    public String getHouseRegisterCity() {
        return houseRegisterCity;
    }

    public void setHouseRegisterCity(String houseRegisterCity) {
        this.houseRegisterCity = houseRegisterCity == null ? null : houseRegisterCity.trim();
    }

    public String getHouseRegisterCityText() {
        return houseRegisterCityText;
    }

    public void setHouseRegisterCityText(String houseRegisterCityText) {
        this.houseRegisterCityText = houseRegisterCityText == null ? null : houseRegisterCityText.trim();
    }

    public String getHouseRegisterDistinct() {
        return houseRegisterDistinct;
    }

    public void setHouseRegisterDistinct(String houseRegisterDistinct) {
        this.houseRegisterDistinct = houseRegisterDistinct == null ? null : houseRegisterDistinct.trim();
    }

    public String getHouseRegisterDistinctText() {
        return houseRegisterDistinctText;
    }

    public void setHouseRegisterDistinctText(String houseRegisterDistinctText) {
        this.houseRegisterDistinctText = houseRegisterDistinctText == null ? null : houseRegisterDistinctText.trim();
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    public BigDecimal getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(BigDecimal buildingArea) {
        this.buildingArea = buildingArea;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType == null ? null : houseType.trim();
    }

    public String getHouseTypeText() {
        return houseTypeText;
    }

    public void setHouseTypeText(String houseTypeText) {
        this.houseTypeText = houseTypeText == null ? null : houseTypeText.trim();
    }

    public String getCollertalModel() {
        return collertalModel;
    }

    public void setCollertalModel(String collertalModel) {
        this.collertalModel = collertalModel == null ? null : collertalModel.trim();
    }

    public String getCollertalModelText() {
        return collertalModelText;
    }

    public void setCollertalModelText(String collertalModelText) {
        this.collertalModelText = collertalModelText == null ? null : collertalModelText.trim();
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress == null ? null : houseAddress.trim();
    }

    public String getPropertyOwner() {
        return propertyOwner;
    }

    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner == null ? null : propertyOwner.trim();
    }

    public String getPropertyOwnerICertificateType() {
        return propertyOwnerICertificateType;
    }

    public void setPropertyOwnerICertificateType(String propertyOwnerICertificateType) {
        this.propertyOwnerICertificateType = propertyOwnerICertificateType == null ? null : propertyOwnerICertificateType.trim();
    }

    public String getPropertyOwnerICertificateTypeText() {
        return propertyOwnerICertificateTypeText;
    }

    public void setPropertyOwnerICertificateTypeText(String propertyOwnerICertificateTypeText) {
        this.propertyOwnerICertificateTypeText = propertyOwnerICertificateTypeText == null ? null : propertyOwnerICertificateTypeText.trim();
    }

    public String getPropertyOwnerCertificateNo() {
        return propertyOwnerCertificateNo;
    }

    public void setPropertyOwnerCertificateNo(String propertyOwnerCertificateNo) {
        this.propertyOwnerCertificateNo = propertyOwnerCertificateNo == null ? null : propertyOwnerCertificateNo.trim();
    }

    public BigDecimal getMortgagedLoanBalanceAmount() {
        return mortgagedLoanBalanceAmount;
    }

    public void setMortgagedLoanBalanceAmount(BigDecimal mortgagedLoanBalanceAmount) {
        this.mortgagedLoanBalanceAmount = mortgagedLoanBalanceAmount;
    }

    public BigDecimal getValuationPrice() {
        return valuationPrice;
    }

    public void setValuationPrice(BigDecimal valuationPrice) {
        this.valuationPrice = valuationPrice;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getHouseAge() {
        return houseAge;
    }

    public void setHouseAge(Integer houseAge) {
        this.houseAge = houseAge;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public String getRoomTypeText() {
        return roomTypeText;
    }

    public void setRoomTypeText(String roomTypeText) {
        this.roomTypeText = roomTypeText == null ? null : roomTypeText.trim();
    }

    public BigDecimal getHouseMortgageRate() {
        return houseMortgageRate;
    }

    public void setHouseMortgageRate(BigDecimal houseMortgageRate) {
        this.houseMortgageRate = houseMortgageRate;
    }

    public Boolean getIsOnlyHouseForFamily() {
        return isOnlyHouseForFamily;
    }

    public void setIsOnlyHouseForFamily(Boolean isOnlyHouseForFamily) {
        this.isOnlyHouseForFamily = isOnlyHouseForFamily;
    }

    public String getIsOnlyHouseForFamilyText() {
        return isOnlyHouseForFamilyText;
    }

    public void setIsOnlyHouseForFamilyText(String isOnlyHouseForFamilyText) {
        this.isOnlyHouseForFamilyText = isOnlyHouseForFamilyText == null ? null : isOnlyHouseForFamilyText.trim();
    }

    public Integer getMortgageType() {
        return mortgageType;
    }

    public void setMortgageType(Integer mortgageType) {
        this.mortgageType = mortgageType;
    }

    public String getMortgageTypeText() {
        return mortgageTypeText;
    }

    public void setMortgageTypeText(String mortgageTypeText) {
        this.mortgageTypeText = mortgageTypeText == null ? null : mortgageTypeText.trim();
    }

    public Boolean getIsDebtor() {
        return isDebtor;
    }

    public void setIsDebtor(Boolean isDebtor) {
        this.isDebtor = isDebtor;
    }

    public String getIsDebtorText() {
        return isDebtorText;
    }

    public void setIsDebtorText(String isDebtorText) {
        this.isDebtorText = isDebtorText == null ? null : isDebtorText.trim();
    }

    public String getOneMortgageType() {
        return oneMortgageType;
    }

    public void setOneMortgageType(String oneMortgageType) {
        this.oneMortgageType = oneMortgageType == null ? null : oneMortgageType.trim();
    }

    public String getOneMortgageTypeText() {
        return oneMortgageTypeText;
    }

    public void setOneMortgageTypeText(String oneMortgageTypeText) {
        this.oneMortgageTypeText = oneMortgageTypeText == null ? null : oneMortgageTypeText.trim();
    }

    public BigDecimal getOneMortgageAmount() {
        return oneMortgageAmount;
    }

    public void setOneMortgageAmount(BigDecimal oneMortgageAmount) {
        this.oneMortgageAmount = oneMortgageAmount;
    }

    public String getOneMortgageTerm() {
        return oneMortgageTerm;
    }

    public void setOneMortgageTerm(String oneMortgageTerm) {
        this.oneMortgageTerm = oneMortgageTerm == null ? null : oneMortgageTerm.trim();
    }

    public String getNotaryFinishInfo() {
        return notaryFinishInfo;
    }

    public void setNotaryFinishInfo(String notaryFinishInfo) {
        this.notaryFinishInfo = notaryFinishInfo == null ? null : notaryFinishInfo.trim();
    }

    public String getNotaryFinishInfoText() {
        return notaryFinishInfoText;
    }

    public void setNotaryFinishInfoText(String notaryFinishInfoText) {
        this.notaryFinishInfoText = notaryFinishInfoText == null ? null : notaryFinishInfoText.trim();
    }

    public String getMortgageFinishInfo() {
        return mortgageFinishInfo;
    }

    public void setMortgageFinishInfo(String mortgageFinishInfo) {
        this.mortgageFinishInfo = mortgageFinishInfo == null ? null : mortgageFinishInfo.trim();
    }

    public String getMortgageFinishInfoText() {
        return mortgageFinishInfoText;
    }

    public void setMortgageFinishInfoText(String mortgageFinishInfoText) {
        this.mortgageFinishInfoText = mortgageFinishInfoText == null ? null : mortgageFinishInfoText.trim();
    }

    public Integer getHouseFloor() {
        return houseFloor;
    }

    public void setHouseFloor(Integer houseFloor) {
        this.houseFloor = houseFloor;
    }

    public Integer getBuildingFloor() {
        return buildingFloor;
    }

    public void setBuildingFloor(Integer buildingFloor) {
        this.buildingFloor = buildingFloor;
    }

    public String getBuildingStates() {
        return buildingStates;
    }

    public void setBuildingStates(String buildingStates) {
        this.buildingStates = buildingStates == null ? null : buildingStates.trim();
    }

    public String getBuildingStatesText() {
        return buildingStatesText;
    }

    public void setBuildingStatesText(String buildingStatesText) {
        this.buildingStatesText = buildingStatesText == null ? null : buildingStatesText.trim();
    }

    public String getHouseEstimateAgency() {
        return houseEstimateAgency;
    }

    public void setHouseEstimateAgency(String houseEstimateAgency) {
        this.houseEstimateAgency = houseEstimateAgency == null ? null : houseEstimateAgency.trim();
    }

    public String getGuarantorAndBorrowerRelationship() {
        return guarantorAndBorrowerRelationship;
    }

    public void setGuarantorAndBorrowerRelationship(String guarantorAndBorrowerRelationship) {
        this.guarantorAndBorrowerRelationship = guarantorAndBorrowerRelationship == null ? null : guarantorAndBorrowerRelationship.trim();
    }

    public String getGuarantorAndBorrowerRelationshipText() {
        return guarantorAndBorrowerRelationshipText;
    }

    public void setGuarantorAndBorrowerRelationshipText(String guarantorAndBorrowerRelationshipText) {
        this.guarantorAndBorrowerRelationshipText = guarantorAndBorrowerRelationshipText == null ? null : guarantorAndBorrowerRelationshipText.trim();
    }

    public String getGuarantorType() {
        return guarantorType;
    }

    public void setGuarantorType(String guarantorType) {
        this.guarantorType = guarantorType == null ? null : guarantorType.trim();
    }

    public String getGuarantorTypeText() {
        return guarantorTypeText;
    }

    public void setGuarantorTypeText(String guarantorTypeText) {
        this.guarantorTypeText = guarantorTypeText == null ? null : guarantorTypeText.trim();
    }

    public String getGuarantorName() {
        return guarantorName;
    }

    public void setGuarantorName(String guarantorName) {
        this.guarantorName = guarantorName == null ? null : guarantorName.trim();
    }

    public String getGuarantorIDNumber() {
        return guarantorIDNumber;
    }

    public void setGuarantorIDNumber(String guarantorIDNumber) {
        this.guarantorIDNumber = guarantorIDNumber == null ? null : guarantorIDNumber.trim();
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser == null ? null : createdUser.trim();
    }

    public String getProvence() {
        return provence;
    }

    public void setProvence(String provence) {
        this.provence = provence == null ? null : provence.trim();
    }

    public String getProvenceText() {
        return provenceText;
    }

    public void setProvenceText(String provenceText) {
        this.provenceText = provenceText == null ? null : provenceText.trim();
    }

    public Integer getYearOfPropertyRights() {
        return yearOfPropertyRights;
    }

    public void setYearOfPropertyRights(Integer yearOfPropertyRights) {
        this.yearOfPropertyRights = yearOfPropertyRights;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo == null ? null : buildingNo.trim();
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation == null ? null : orientation.trim();
    }

    public String getOrientationText() {
        return orientationText;
    }

    public void setOrientationText(String orientationText) {
        this.orientationText = orientationText == null ? null : orientationText.trim();
    }

    public Date getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(Date certificateDate) {
        this.certificateDate = certificateDate;
    }

    public String getPlanUtilization() {
        return planUtilization;
    }

    public void setPlanUtilization(String planUtilization) {
        this.planUtilization = planUtilization == null ? null : planUtilization.trim();
    }

    public String getPlanUtilizationText() {
        return planUtilizationText;
    }

    public void setPlanUtilizationText(String planUtilizationText) {
        this.planUtilizationText = planUtilizationText == null ? null : planUtilizationText.trim();
    }

    public String getHouseProperty() {
        return houseProperty;
    }

    public void setHouseProperty(String houseProperty) {
        this.houseProperty = houseProperty == null ? null : houseProperty.trim();
    }

    public String getHousePropertyText() {
        return housePropertyText;
    }

    public void setHousePropertyText(String housePropertyText) {
        this.housePropertyText = housePropertyText == null ? null : housePropertyText.trim();
    }

    public String getHouseSituation() {
        return houseSituation;
    }

    public void setHouseSituation(String houseSituation) {
        this.houseSituation = houseSituation == null ? null : houseSituation.trim();
    }

    public String getHouseSituationText() {
        return houseSituationText;
    }

    public void setHouseSituationText(String houseSituationText) {
        this.houseSituationText = houseSituationText == null ? null : houseSituationText.trim();
    }

    public String getLandSource() {
        return landSource;
    }

    public void setLandSource(String landSource) {
        this.landSource = landSource == null ? null : landSource.trim();
    }

    public String getLandSourceText() {
        return landSourceText;
    }

    public void setLandSourceText(String landSourceText) {
        this.landSourceText = landSourceText == null ? null : landSourceText.trim();
    }

    public String getLandUse() {
        return landUse;
    }

    public void setLandUse(String landUse) {
        this.landUse = landUse == null ? null : landUse.trim();
    }

    public String getLandUseText() {
        return landUseText;
    }

    public void setLandUseText(String landUseText) {
        this.landUseText = landUseText == null ? null : landUseText.trim();
    }

    public Integer getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(Integer completionTime) {
        this.completionTime = completionTime;
    }

    public Boolean getIsTransaction() {
        return isTransaction;
    }

    public void setIsTransaction(Boolean isTransaction) {
        this.isTransaction = isTransaction;
    }

    public String getIsTransactionText() {
        return isTransactionText;
    }

    public void setIsTransactionText(String isTransactionText) {
        this.isTransactionText = isTransactionText == null ? null : isTransactionText.trim();
    }

    public Boolean getIsFreeze() {
        return isFreeze;
    }

    public void setIsFreeze(Boolean isFreeze) {
        this.isFreeze = isFreeze;
    }

    public String getIsFreezeText() {
        return isFreezeText;
    }

    public void setIsFreezeText(String isFreezeText) {
        this.isFreezeText = isFreezeText == null ? null : isFreezeText.trim();
    }

    public Boolean getIsOnlyHousing() {
        return isOnlyHousing;
    }

    public void setIsOnlyHousing(Boolean isOnlyHousing) {
        this.isOnlyHousing = isOnlyHousing;
    }

    public String getIsOnlyHousingText() {
        return isOnlyHousingText;
    }

    public void setIsOnlyHousingText(String isOnlyHousingText) {
        this.isOnlyHousingText = isOnlyHousingText == null ? null : isOnlyHousingText.trim();
    }

    public Boolean getIsDispute() {
        return isDispute;
    }

    public void setIsDispute(Boolean isDispute) {
        this.isDispute = isDispute;
    }

    public String getIsDisputeText() {
        return isDisputeText;
    }

    public void setIsDisputeText(String isDisputeText) {
        this.isDisputeText = isDisputeText == null ? null : isDisputeText.trim();
    }

    public Boolean getIsThrough() {
        return isThrough;
    }

    public void setIsThrough(Boolean isThrough) {
        this.isThrough = isThrough;
    }

    public String getIsThroughText() {
        return isThroughText;
    }

    public void setIsThroughText(String isThroughText) {
        this.isThroughText = isThroughText == null ? null : isThroughText.trim();
    }

    public Boolean getIsDisposition() {
        return isDisposition;
    }

    public void setIsDisposition(Boolean isDisposition) {
        this.isDisposition = isDisposition;
    }

    public String getIsDispositionText() {
        return isDispositionText;
    }

    public void setIsDispositionText(String isDispositionText) {
        this.isDispositionText = isDispositionText == null ? null : isDispositionText.trim();
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

    @Override
    public String toString() {
        return
                id +
                        "\001" + loanNo +
                        "\001" + projectNo +
                        "\001" + houseNo +
                        "\001" + houseRegisterCity +
                        "\001" + houseRegisterCityText +
                        "\001" + houseRegisterDistinct +
                        "\001" + houseRegisterDistinctText +
                        "\001" + buildingName +
                        "\001" + buildingArea +
                        "\001" + houseType +
                        "\001" + houseTypeText +
                        "\001" + collertalModel +
                        "\001" + collertalModelText +
                        "\001" + houseAddress +
                        "\001" + propertyOwner +
                        "\001" + propertyOwnerICertificateType +
                        "\001" + propertyOwnerICertificateTypeText +
                        "\001" + propertyOwnerCertificateNo +
                        "\001" + mortgagedLoanBalanceAmount +
                        "\001" + valuationPrice +
                        "\001" + unitPrice +
                        "\001" + houseAge +
                        "\001" + roomType +
                        "\001" + roomTypeText +
                        "\001" + houseMortgageRate +
                        "\001" + isOnlyHouseForFamily +
                        "\001" + isOnlyHouseForFamilyText +
                        "\001" + mortgageType +
                        "\001" + mortgageTypeText +
                        "\001" + isDebtor +
                        "\001" + isDebtorText +
                        "\001" + oneMortgageType +
                        "\001" + oneMortgageTypeText +
                        "\001" + oneMortgageAmount +
                        "\001" + oneMortgageTerm +
                        "\001" + notaryFinishInfo +
                        "\001" + notaryFinishInfoText +
                        "\001" + mortgageFinishInfo +
                        "\001" + mortgageFinishInfoText +
                        "\001" + houseFloor +
                        "\001" + buildingFloor +
                        "\001" + buildingStates +
                        "\001" + buildingStatesText +
                        "\001" + houseEstimateAgency +
                        "\001" + guarantorAndBorrowerRelationship +
                        "\001" + guarantorAndBorrowerRelationshipText +
                        "\001" + guarantorType +
                        "\001" + guarantorTypeText +
                        "\001" + guarantorName +
                        "\001" + guarantorIDNumber +
                        "\001" + this.getCreationTimeString() +
                        "\001" + this.getModifyTimeString() +
                        "\001" + remark +
                        "\001" + createdUser +
                        "\001" + provence +
                        "\001" + provenceText +
                        "\001" + yearOfPropertyRights +
                        "\001" + buildingNo +
                        "\001" + orientation +
                        "\001" + orientationText +
                        "\001" + this.getCertificateDateString() +
                        "\001" + planUtilization +
                        "\001" + planUtilizationText +
                        "\001" + houseProperty +
                        "\001" + housePropertyText +
                        "\001" + houseSituation +
                        "\001" + houseSituationText +
                        "\001" + landSource +
                        "\001" + landSourceText +
                        "\001" + landUse +
                        "\001" + landUseText +
                        "\001" + completionTime +
                        "\001" + isTransaction +
                        "\001" + isTransactionText +
                        "\001" + isFreeze +
                        "\001" + isFreezeText +
                        "\001" + isOnlyHousing +
                        "\001" + isOnlyHousingText +
                        "\001" + isDispute +
                        "\001" + isDisputeText +
                        "\001" + isThrough +
                        "\001" + isThroughText +
                        "\001" + isDisposition +
                        "\001" + isDispositionText +
                        "\001" + roomNumber +
                        '\r';
    }
}