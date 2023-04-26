package com.ratnam.subscriptionmanagement.payloads;

import java.util.Date;

public class SubscriptionCancellationsDto {

	private int id;
	private Date cancellatinDate;
	private String cancellatinReason;
	private UserSubscriptionsDto userSubscriptionsDto;
	
	public SubscriptionCancellationsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCancellatinDate() {
		return cancellatinDate;
	}

	public void setCancellatinDate(Date cancellatinDate) {
		this.cancellatinDate = cancellatinDate;
	}

	public String getCancellatinReason() {
		return cancellatinReason;
	}

	public void setCancellatinReason(String cancellatinReason) {
		this.cancellatinReason = cancellatinReason;
	}

	public UserSubscriptionsDto getUserSubscriptionsDto() {
		return userSubscriptionsDto;
	}

	public void setUserSubscriptionsDto(UserSubscriptionsDto userSubscriptionsDto) {
		this.userSubscriptionsDto = userSubscriptionsDto;
	}
	
	
}
