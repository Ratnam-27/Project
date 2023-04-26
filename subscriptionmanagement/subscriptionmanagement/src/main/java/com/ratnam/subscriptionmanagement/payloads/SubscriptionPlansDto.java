package com.ratnam.subscriptionmanagement.payloads;

import java.util.ArrayList;
import java.util.List;

import com.ratnam.subscriptionmanagement.entities.UserSubscriptions;

public class SubscriptionPlansDto {
	
	private int planId;
	private String name;
	private int pricePerMonth;
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPricePerMonth() {
		return pricePerMonth;
	}
	public void setPricePerMonth(int pricePerMonth) {
		this.pricePerMonth = pricePerMonth;
	}
	public SubscriptionPlansDto(int planId, String name, int pricePerMonth) {
		super();
		this.planId = planId;
		this.name = name;
		this.pricePerMonth = pricePerMonth;
	}
	public SubscriptionPlansDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
