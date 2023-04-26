package com.ratnam.subscriptionmanagement.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

@Entity
@Table(name="SubscriptionPlans")
public class SubscriptionPlans {
	
	@Id
	@Column(name="PlanId",length=10)
    private int planId;
	@Column(name="Name",length=100)
    private String name;
	@Column(name="PricePerMonth",length=10)
	private int pricePerMonth;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="subscriptionPlans")
	private List<UserSubscriptions> usersubscriptions;
    

	public SubscriptionPlans() {
		super();
	}
	
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
    
    
}
