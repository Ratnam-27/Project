package com.ratnam.subscriptionmanagement.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;


@Entity
@Table(name="UserSubscription")
public class UserSubscriptions {
    
	@Id
	@Column(name="SubscriptionId",length=10)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int subscriptionId;
	@Column(name="UserName",length=10)
	private String userName;
	
	@Column(name="SubscriptionStartDate")
	private Date subscriptionStartDate;
	
	@Column(name="SubscriptionEndDate")
	private Date subscriptionEndDate;
	
	@Column(name="AmountPaid")
	@Min(value = 10)
	@Max(value = 10)
	private int amountPaid;
	
    @Column(name ="PaymentMode",length=50)
	@Pattern(regexp = "^(Card|NetBanking)$" , message="Not Found")
	private String paymentMode;
	
	@Column(name="SubscriptionStatus",length=12)
	@Pattern(regexp="^(New|Renewed|Cancelled)$" , message = "Not Found")
	private String subscriptionStatus;
	
	@ManyToOne
	@JoinColumn(name="PlanId")
	private SubscriptionPlans subscriptionPlans;
	
	@OneToOne(mappedBy="userSubscriptions")
	private SubscriptionCancellations subscriptionCancellations;


	public SubscriptionPlans getSubscriptionPlans() {
		return subscriptionPlans;
	}


	public void setSubscriptionPlans(SubscriptionPlans subscriptionPlans) {
		this.subscriptionPlans = subscriptionPlans;
	}


	public UserSubscriptions() {
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
	
	
	
	
}
