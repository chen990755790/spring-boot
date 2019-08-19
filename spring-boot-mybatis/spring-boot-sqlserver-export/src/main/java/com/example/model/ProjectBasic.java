package com.example.model;

import com.example.util.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class ProjectBasic extends Example{
    private Integer projectId;

    private String projectName;

    private String projectNo;

    private Integer projectType;

    private String projectTypeText;

    private String projectBackground;

    private String exchangeStructrue;

    private BigDecimal investmentAmount;

    private Integer investmentTerm;

    private BigDecimal expectIncomeRate;

    private Integer loanType;

    private String loanTypeText;

    private String firstRepaymentSource;

    private String useOfFunds;

    private Integer collateralType;

    private String collateralTypeText;

    private BigDecimal mortgageRate;

    private Integer pledgeType;

    private String pledgeTypeText;

    private BigDecimal pledgeRate;

    private Integer fundsSource;

    private String fundsSourceText;

    private Integer projectStage;

    private String projectStageText;

    private String businessManger;

    private String businessTeam;

    private String inputUser;

    private String businessTeamUser;

    private String institutionalDirector;

    private String dueDiligenceUser;

    private String financingCompany;
    private Date createdTime;

    private String createdUser;
    private Date modifedTime;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    public String getProjectTypeText() {
        return projectTypeText;
    }

    public void setProjectTypeText(String projectTypeText) {
        this.projectTypeText = projectTypeText == null ? null : projectTypeText.trim();
    }

    public String getProjectBackground() {
        return projectBackground;
    }

    public void setProjectBackground(String projectBackground) {
        this.projectBackground = projectBackground == null ? null : projectBackground.trim();
    }

    public String getExchangeStructrue() {
        return exchangeStructrue;
    }

    public void setExchangeStructrue(String exchangeStructrue) {
        this.exchangeStructrue = exchangeStructrue == null ? null : exchangeStructrue.trim();
    }

    public BigDecimal getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(BigDecimal investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    public Integer getInvestmentTerm() {
        return investmentTerm;
    }

    public void setInvestmentTerm(Integer investmentTerm) {
        this.investmentTerm = investmentTerm;
    }

    public BigDecimal getExpectIncomeRate() {
        return expectIncomeRate;
    }

    public void setExpectIncomeRate(BigDecimal expectIncomeRate) {
        this.expectIncomeRate = expectIncomeRate;
    }

    public Integer getLoanType() {
        return loanType;
    }

    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    public String getLoanTypeText() {
        return loanTypeText;
    }

    public void setLoanTypeText(String loanTypeText) {
        this.loanTypeText = loanTypeText == null ? null : loanTypeText.trim();
    }

    public String getFirstRepaymentSource() {
        return firstRepaymentSource;
    }

    public void setFirstRepaymentSource(String firstRepaymentSource) {
        this.firstRepaymentSource = firstRepaymentSource == null ? null : firstRepaymentSource.trim();
    }

    public String getUseOfFunds() {
        return useOfFunds;
    }

    public void setUseOfFunds(String useOfFunds) {
        this.useOfFunds = useOfFunds == null ? null : useOfFunds.trim();
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

    public BigDecimal getMortgageRate() {
        return mortgageRate;
    }

    public void setMortgageRate(BigDecimal mortgageRate) {
        this.mortgageRate = mortgageRate;
    }

    public Integer getPledgeType() {
        return pledgeType;
    }

    public void setPledgeType(Integer pledgeType) {
        this.pledgeType = pledgeType;
    }

    public String getPledgeTypeText() {
        return pledgeTypeText;
    }

    public void setPledgeTypeText(String pledgeTypeText) {
        this.pledgeTypeText = pledgeTypeText == null ? null : pledgeTypeText.trim();
    }

    public BigDecimal getPledgeRate() {
        return pledgeRate;
    }

    public void setPledgeRate(BigDecimal pledgeRate) {
        this.pledgeRate = pledgeRate;
    }

    public Integer getFundsSource() {
        return fundsSource;
    }

    public void setFundsSource(Integer fundsSource) {
        this.fundsSource = fundsSource;
    }

    public String getFundsSourceText() {
        return fundsSourceText;
    }

    public void setFundsSourceText(String fundsSourceText) {
        this.fundsSourceText = fundsSourceText == null ? null : fundsSourceText.trim();
    }

    public Integer getProjectStage() {
        return projectStage;
    }

    public void setProjectStage(Integer projectStage) {
        this.projectStage = projectStage;
    }

    public String getProjectStageText() {
        return projectStageText;
    }

    public void setProjectStageText(String projectStageText) {
        this.projectStageText = projectStageText == null ? null : projectStageText.trim();
    }

    public String getBusinessManger() {
        return businessManger;
    }

    public void setBusinessManger(String businessManger) {
        this.businessManger = businessManger == null ? null : businessManger.trim();
    }

    public String getBusinessTeam() {
        return businessTeam;
    }

    public void setBusinessTeam(String businessTeam) {
        this.businessTeam = businessTeam == null ? null : businessTeam.trim();
    }

    public String getInputUser() {
        return inputUser;
    }

    public void setInputUser(String inputUser) {
        this.inputUser = inputUser == null ? null : inputUser.trim();
    }

    public String getBusinessTeamUser() {
        return businessTeamUser;
    }

    public void setBusinessTeamUser(String businessTeamUser) {
        this.businessTeamUser = businessTeamUser == null ? null : businessTeamUser.trim();
    }

    public String getInstitutionalDirector() {
        return institutionalDirector;
    }

    public void setInstitutionalDirector(String institutionalDirector) {
        this.institutionalDirector = institutionalDirector == null ? null : institutionalDirector.trim();
    }

    public String getDueDiligenceUser() {
        return dueDiligenceUser;
    }

    public void setDueDiligenceUser(String dueDiligenceUser) {
        this.dueDiligenceUser = dueDiligenceUser == null ? null : dueDiligenceUser.trim();
    }

    public String getFinancingCompany() {
        return financingCompany;
    }

    public void setFinancingCompany(String financingCompany) {
        this.financingCompany = financingCompany == null ? null : financingCompany.trim();
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

    public Date getModifedTime() {
        return modifedTime;
    }

    public String getModifedTimeString() {
        return DateUtil.formateDate(modifedTime);
    }

    public void setModifedTime(Date modifedTime) {
        this.modifedTime = modifedTime;
    }

    @Override
    public String toString() {
        return
                projectId +
                        "\001" + projectName +
                        "\001" + projectNo +
                        "\001" + projectType +
                        "\001" + projectTypeText +
                        "\001" + projectBackground +
                        "\001" + exchangeStructrue +
                        "\001" + investmentAmount +
                        "\001" + investmentTerm +
                        "\001" + expectIncomeRate +
                        "\001" + loanType +
                        "\001" + loanTypeText +
                        "\001" + firstRepaymentSource +
                        "\001" + useOfFunds +
                        "\001" + collateralType +
                        "\001" + collateralTypeText +
                        "\001" + mortgageRate +
                        "\001" + pledgeType +
                        "\001" + pledgeTypeText +
                        "\001" + pledgeRate +
                        "\001" + fundsSource +
                        "\001" + fundsSourceText +
                        "\001" + projectStage +
                        "\001" + projectStageText +
                        "\001" + businessManger +
                        "\001" + businessTeam +
                        "\001" + inputUser +
                        "\001" + businessTeamUser +
                        "\001" + institutionalDirector +
                        "\001" + dueDiligenceUser +
                        "\001" + financingCompany +
                        "\001" + this.getCreatedTimeString() +
                        "\001" + createdUser +
                        "\001" + this.getModifedTimeString() +
                        '\r';
    }
}