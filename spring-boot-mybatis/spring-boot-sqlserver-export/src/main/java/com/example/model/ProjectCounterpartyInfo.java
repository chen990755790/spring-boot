package com.example.model;

import com.example.util.DateUtil;

import java.util.Date;

public class ProjectCounterpartyInfo extends Example{
    private Integer counterpartyId;

    private Integer projectId;

    private Integer tradingParticipantsType;

    private String tradingParticipantsTypeText;

    private String tradingCompanyName;

    private String tradingCompanyCode;

    private String tradingCompanyRating;

    private String createdUser;
    private Date createdTime;
    private Date modifedTime;

    private String sessionId;

    public Integer getCounterpartyId() {
        return counterpartyId;
    }

    public void setCounterpartyId(Integer counterpartyId) {
        this.counterpartyId = counterpartyId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getTradingParticipantsType() {
        return tradingParticipantsType;
    }

    public void setTradingParticipantsType(Integer tradingParticipantsType) {
        this.tradingParticipantsType = tradingParticipantsType;
    }

    public String getTradingParticipantsTypeText() {
        return tradingParticipantsTypeText;
    }

    public void setTradingParticipantsTypeText(String tradingParticipantsTypeText) {
        this.tradingParticipantsTypeText = tradingParticipantsTypeText == null ? null : tradingParticipantsTypeText.trim();
    }

    public String getTradingCompanyName() {
        return tradingCompanyName;
    }

    public void setTradingCompanyName(String tradingCompanyName) {
        this.tradingCompanyName = tradingCompanyName == null ? null : tradingCompanyName.trim();
    }

    public String getTradingCompanyCode() {
        return tradingCompanyCode;
    }

    public void setTradingCompanyCode(String tradingCompanyCode) {
        this.tradingCompanyCode = tradingCompanyCode == null ? null : tradingCompanyCode.trim();
    }

    public String getTradingCompanyRating() {
        return tradingCompanyRating;
    }

    public void setTradingCompanyRating(String tradingCompanyRating) {
        this.tradingCompanyRating = tradingCompanyRating == null ? null : tradingCompanyRating.trim();
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser == null ? null : createdUser.trim();
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

    public String getModifedTimeStrng() {
        return DateUtil.formateDate(modifedTime);
    }

    public void setModifedTime(Date modifedTime) {
        this.modifedTime = modifedTime;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    @Override
    public String toString() {
        return
                counterpartyId +
                        "\001" + projectId +
                        "\001" + tradingParticipantsType +
                        "\001" + tradingParticipantsTypeText +
                        "\001" + tradingCompanyName +
                        "\001" + tradingCompanyCode +
                        "\001" + tradingCompanyRating +
                        "\001" + createdUser +
                        "\001" + this.getCreatedTimeString() +
                        "\001" + this.getModifedTimeStrng() +
                        "\001" + sessionId +
                        '\r';
    }
}