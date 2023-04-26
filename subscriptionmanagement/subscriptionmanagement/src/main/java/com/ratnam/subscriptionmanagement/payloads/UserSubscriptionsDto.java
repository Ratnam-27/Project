package com.ratnam.subscriptionmanagement.payloads;

import java.util.Date;

public class UserSubscriptionsDto {

	private int subscriptionId;
	private String userName;
	private Date subscriptionStartDate;
	private Date subscriptionEndDate;
	private int amountPaid;
	private String paymentMode;
	private String subscriptionStatus;
	private SubscriptionPlansDto subscriptionPlansDto;
	
	
	public UserSubscriptionsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(int subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getSubscriptionStartDate() {
		return subscriptionStartDate;
	}
	public void setSubscriptionStartDate(Date subscriptionStartDate) {
		this.subscriptionStartDate = subscriptionStartDate;
	}
	public Date getSubscriptionEndDate() {
		return subscriptionEndDate;
	}
	public void setSubscriptionEndDate(Date subscriptionEndDate) {
		this.subscriptionEndDate = subscriptionEndDate;
	}
	public int getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getSubscriptionStatus() {
		return subscriptionStatus;
	}
	public void setSubscriptionStatus(String subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}
	public SubscriptionPlansDto getSubscriptionPlansDto() {
		return subscriptionPlansDto;
	}
	public void setSubscriptionPlansDto(SubscriptionPlansDto subscriptionPlansDto) {
		this.subscriptionPlansDto = subscriptionPlansDto;
	}
}
