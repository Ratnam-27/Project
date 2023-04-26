package com.ratnam.subscriptionmanagement.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SubscriptionCancellations")
public class SubscriptionCancellations {

	@Id
	@Column(name="id",length=10)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="CancellatinDate")
	private Date cancellatinDate;
	@Column(name="CancellatinReason" ,length=100)
	private String cancellatinReason;
	
	@OneToOne
	@JoinColumn(name="SubscriptionId")
	private UserSubscriptions userSubscriptions;
	
	public UserSubscriptions getUserSubscriptions() {
		return userSubscriptions;
	}

	public void setUserSubscriptions(UserSubscriptions userSubscriptions) {
		this.userSubscriptions = userSubscriptions;
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

	public SubscriptionCancellations() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
