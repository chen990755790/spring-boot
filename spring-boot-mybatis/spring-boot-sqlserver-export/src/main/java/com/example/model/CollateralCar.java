package com.example.model;

import com.example.util.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class CollateralCar extends Example{
    private String id;

    private String loanNo;

    private String projectNo;

    private String vehicleIdentify;

    private String useCharacter;

    private String useCharacterText;

    private String vehicleLevel;

    private String vehicleLevelText;
    private Date mortagageDate;
    private Date dateOfProduction;

    private BigDecimal valuationPrice;

    private String vehicleCategory;

    private String vehicleCategoryText;

    private String vehicleBrand;

    private String vehiclePlateNumber;

    private String vehicleType;

    private String vehicleTypeText;

    private String vehicleModel;

    private Boolean hasMortgageContract;

    private String hasMortgageContractText;
    private Date purchaseDate;

    private String engineNo;

    private BigDecimal mortgageRates;

    private String mortgageAuthorizer;

    private BigDecimal purchasePrice;

    private String sweptVolume;

    private BigDecimal kilometers;

    private BigDecimal downPaymentRatio;

    private String idNo;

    private String vehicleColor;

    private String rentType;

    private String mortagageModel;

    private BigDecimal thirdpartyEvaluationPrice;

    private Boolean isExtension;

    private String isExtensionText;

    private String inscuranceName;
    private Date SALIExpireDate;
    private Date issueDate;

    private Integer transferCount;
    private Date hisWarrantsUploadingTime;
    private Date vaiEndDate;

    private Integer usedDays;
    private Date storageDate;
    private Date outStorageDate;
    private BigDecimal vehiclePurchasePrice;

    private String collertalModel;

    private String collertalModelText;

    private String interiorColor;

    private String vehicleDetails;

    private String storePlace;
    private Date creationTime;
    private Date modifyTime;

    private String createdUser;

    private String declarationNo;

    private BigDecimal marginRatio;

    private String carInsurance;

    private String carInsuranceText;

    private String remark;

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

    public String getVehicleIdentify() {
        return vehicleIdentify;
    }

    public void setVehicleIdentify(String vehicleIdentify) {
        this.vehicleIdentify = vehicleIdentify == null ? null : vehicleIdentify.trim();
    }

    public String getUseCharacter() {
        return useCharacter;
    }

    public void setUseCharacter(String useCharacter) {
        this.useCharacter = useCharacter == null ? null : useCharacter.trim();
    }

    public String getUseCharacterText() {
        return useCharacterText;
    }

    public void setUseCharacterText(String useCharacterText) {
        this.useCharacterText = useCharacterText == null ? null : useCharacterText.trim();
    }

    public String getVehicleLevel() {
        return vehicleLevel;
    }

    public void setVehicleLevel(String vehicleLevel) {
        this.vehicleLevel = vehicleLevel == null ? null : vehicleLevel.trim();
    }

    public String getVehicleLevelText() {
        return vehicleLevelText;
    }

    public void setVehicleLevelText(String vehicleLevelText) {
        this.vehicleLevelText = vehicleLevelText == null ? null : vehicleLevelText.trim();
    }

    public Date getMortagageDate() {
        return mortagageDate;
    }

    public void setMortagageDate(Date mortagageDate) {
        this.mortagageDate = mortagageDate;
    }

    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(Date dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public BigDecimal getValuationPrice() {
        return valuationPrice;
    }

    public void setValuationPrice(BigDecimal valuationPrice) {
        this.valuationPrice = valuationPrice;
    }

    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(String vehicleCategory) {
        this.vehicleCategory = vehicleCategory == null ? null : vehicleCategory.trim();
    }

    public String getVehicleCategoryText() {
        return vehicleCategoryText;
    }

    public void setVehicleCategoryText(String vehicleCategoryText) {
        this.vehicleCategoryText = vehicleCategoryText == null ? null : vehicleCategoryText.trim();
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand == null ? null : vehicleBrand.trim();
    }

    public String getVehiclePlateNumber() {
        return vehiclePlateNumber;
    }

    public void setVehiclePlateNumber(String vehiclePlateNumber) {
        this.vehiclePlateNumber = vehiclePlateNumber == null ? null : vehiclePlateNumber.trim();
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType == null ? null : vehicleType.trim();
    }

    public String getVehicleTypeText() {
        return vehicleTypeText;
    }

    public void setVehicleTypeText(String vehicleTypeText) {
        this.vehicleTypeText = vehicleTypeText == null ? null : vehicleTypeText.trim();
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel == null ? null : vehicleModel.trim();
    }

    public Boolean getHasMortgageContract() {
        return hasMortgageContract;
    }

    public void setHasMortgageContract(Boolean hasMortgageContract) {
        this.hasMortgageContract = hasMortgageContract;
    }

    public String getHasMortgageContractText() {
        return hasMortgageContractText;
    }

    public void setHasMortgageContractText(String hasMortgageContractText) {
        this.hasMortgageContractText = hasMortgageContractText == null ? null : hasMortgageContractText.trim();
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo == null ? null : engineNo.trim();
    }

    public BigDecimal getMortgageRates() {
        return mortgageRates;
    }

    public void setMortgageRates(BigDecimal mortgageRates) {
        this.mortgageRates = mortgageRates;
    }

    public String getMortgageAuthorizer() {
        return mortgageAuthorizer;
    }

    public void setMortgageAuthorizer(String mortgageAuthorizer) {
        this.mortgageAuthorizer = mortgageAuthorizer == null ? null : mortgageAuthorizer.trim();
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getSweptVolume() {
        return sweptVolume;
    }

    public void setSweptVolume(String sweptVolume) {
        this.sweptVolume = sweptVolume == null ? null : sweptVolume.trim();
    }

    public BigDecimal getKilometers() {
        return kilometers;
    }

    public void setKilometers(BigDecimal kilometers) {
        this.kilometers = kilometers;
    }

    public BigDecimal getDownPaymentRatio() {
        return downPaymentRatio;
    }

    public void setDownPaymentRatio(BigDecimal downPaymentRatio) {
        this.downPaymentRatio = downPaymentRatio;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor == null ? null : vehicleColor.trim();
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType == null ? null : rentType.trim();
    }

    public String getMortagageModel() {
        return mortagageModel;
    }

    public void setMortagageModel(String mortagageModel) {
        this.mortagageModel = mortagageModel == null ? null : mortagageModel.trim();
    }

    public BigDecimal getThirdpartyEvaluationPrice() {
        return thirdpartyEvaluationPrice;
    }

    public void setThirdpartyEvaluationPrice(BigDecimal thirdpartyEvaluationPrice) {
        this.thirdpartyEvaluationPrice = thirdpartyEvaluationPrice;
    }

    public Boolean getIsExtension() {
        return isExtension;
    }

    public void setIsExtension(Boolean isExtension) {
        this.isExtension = isExtension;
    }

    public String getIsExtensionText() {
        return isExtensionText;
    }

    public void setIsExtensionText(String isExtensionText) {
        this.isExtensionText = isExtensionText == null ? null : isExtensionText.trim();
    }

    public String getInscuranceName() {
        return inscuranceName;
    }

    public void setInscuranceName(String inscuranceName) {
        this.inscuranceName = inscuranceName == null ? null : inscuranceName.trim();
    }

    public Date getSALIExpireDate() {
        return SALIExpireDate;
    }

    public void setSALIExpireDate(Date SALIExpireDate) {
        this.SALIExpireDate = SALIExpireDate;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Integer getTransferCount() {
        return transferCount;
    }

    public void setTransferCount(Integer transferCount) {
        this.transferCount = transferCount;
    }

    public Date getHisWarrantsUploadingTime() {
        return hisWarrantsUploadingTime;
    }

    public void setHisWarrantsUploadingTime(Date hisWarrantsUploadingTime) {
        this.hisWarrantsUploadingTime = hisWarrantsUploadingTime;
    }

    public Date getVaiEndDate() {
        return vaiEndDate;
    }

    public void setVaiEndDate(Date vaiEndDate) {
        this.vaiEndDate = vaiEndDate;
    }

    public Integer getUsedDays() {
        return usedDays;
    }

    public void setUsedDays(Integer usedDays) {
        this.usedDays = usedDays;
    }

    public Date getStorageDate() {
        return storageDate;
    }

    public void setStorageDate(Date storageDate) {
        this.storageDate = storageDate;
    }

    public Date getOutStorageDate() {
        return outStorageDate;
    }

    public void setOutStorageDate(Date outStorageDate) {
        this.outStorageDate = outStorageDate;
    }

    public BigDecimal getVehiclePurchasePrice() {
        return vehiclePurchasePrice;
    }

    public void setVehiclePurchasePrice(BigDecimal vehiclePurchasePrice) {
        this.vehiclePurchasePrice = vehiclePurchasePrice;
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

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor == null ? null : interiorColor.trim();
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(String vehicleDetails) {
        this.vehicleDetails = vehicleDetails == null ? null : vehicleDetails.trim();
    }

    public String getStorePlace() {
        return storePlace;
    }

    public void setStorePlace(String storePlace) {
        this.storePlace = storePlace == null ? null : storePlace.trim();
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

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser == null ? null : createdUser.trim();
    }

    public String getDeclarationNo() {
        return declarationNo;
    }

    public void setDeclarationNo(String declarationNo) {
        this.declarationNo = declarationNo == null ? null : declarationNo.trim();
    }

    public BigDecimal getMarginRatio() {
        return marginRatio;
    }

    public void setMarginRatio(BigDecimal marginRatio) {
        this.marginRatio = marginRatio;
    }

    public String getCarInsurance() {
        return carInsurance;
    }

    public void setCarInsurance(String carInsurance) {
        this.carInsurance = carInsurance == null ? null : carInsurance.trim();
    }

    public String getCarInsuranceText() {
        return carInsuranceText;
    }

    public void setCarInsuranceText(String carInsuranceText) {
        this.carInsuranceText = carInsuranceText == null ? null : carInsuranceText.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getMortagageDateString() {
        return DateUtil.formateDate(mortagageDate);
    }

    public String getDateOfProductionString() {
        return DateUtil.formateDate(dateOfProduction);
    }

    public String getPurchaseDateString() {
        return DateUtil.formateDate(purchaseDate);
    }

    public String getSALIExpireDateString() {
        return DateUtil.formateDate(SALIExpireDate);
    }

    public String getIssueDateString() {
        return DateUtil.formateDate(issueDate);
    }

    public String getHisWarrantsUploadingTimeString() {
        return DateUtil.formateDate(hisWarrantsUploadingTime);
    }

    public String getVaiEndDateString() {
        return DateUtil.formateDate(vaiEndDate);
    }

    public String getStorageDateString() {
        return DateUtil.formateDate(storageDate);
    }

    public String getOutStorageDateString() {
        return DateUtil.formateDate(outStorageDate);
    }

    public String getCreationTimeString() {
        return DateUtil.formateDate(creationTime);
    }

    public String getModifyTimeString() {
        return DateUtil.formateDate(modifyTime);
    }

    @Override
    public String toString() {
        return
                id +
                        "\001" + loanNo +
                        "\001" + projectNo +
                        "\001" + vehicleIdentify +
                        "\001" + useCharacter +
                        "\001" + useCharacterText +
                        "\001" + vehicleLevel +
                        "\001" + vehicleLevelText +
                        "\001" + this.getMortagageDateString() +
                        "\001" + this.getDateOfProductionString() +
                        "\001" + valuationPrice +
                        "\001" + vehicleCategory +
                        "\001" + vehicleCategoryText +
                        "\001" + vehicleBrand +
                        "\001" + vehiclePlateNumber +
                        "\001" + vehicleType +
                        "\001" + vehicleTypeText +
                        "\001" + vehicleModel +
                        "\001" + hasMortgageContract +
                        "\001" + hasMortgageContractText +
                        "\001" + this.getPurchaseDateString() +
                        "\001" + engineNo +
                        "\001" + mortgageRates +
                        "\001" + mortgageAuthorizer +
                        "\001" + purchasePrice +
                        "\001" + sweptVolume +
                        "\001" + kilometers +
                        "\001" + downPaymentRatio +
                        "\001" + idNo +
                        "\001" + vehicleColor +
                        "\001" + rentType +
                        "\001" + mortagageModel +
                        "\001" + thirdpartyEvaluationPrice +
                        "\001" + isExtension +
                        "\001" + isExtensionText +
                        "\001" + inscuranceName +
                        "\001" + this.getSALIExpireDateString() +
                        "\001" + this.getIssueDateString() +
                        "\001" + transferCount +
                        "\001" + this.getHisWarrantsUploadingTimeString() +
                        "\001" + this.getVaiEndDateString() +
                        "\001" + usedDays +
                        "\001" + this.getStorageDateString() +
                        "\001" + this.getOutStorageDateString() +
                        "\001" + vehiclePurchasePrice +
                        "\001" + collertalModel +
                        "\001" + collertalModelText +
                        "\001" + interiorColor +
                        "\001" + vehicleDetails +
                        "\001" + storePlace +
                        "\001" + this.getCreationTimeString() +
                        "\001" + this.getModifyTimeString() +
                        "\001" + createdUser +
                        "\001" + declarationNo +
                        "\001" + marginRatio +
                        "\001" + carInsurance +
                        "\001" + carInsuranceText +
                        "\001" + remark +
                        '\r';
    }
}