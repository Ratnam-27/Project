package com.ratnam.subscriptionmanagement.services;

import com.ratnam.subscriptionmanagement.entities.UserSubscriptions;
import com.ratnam.subscriptionmanagement.payloads.UserSubscriptionsDto;

public interface UserSubscriptionsService {

	public UserSubscriptionsDto addUserSubs(UserSubscriptionsDto newSubscriptionDto);
	public UserSubscriptionsDto updatePlan(Integer subId, UserSubscriptionsDto updateUser);
	public UserSubscriptionsDto cancelSubscription(int subId,UserSubscriptionsDto cancelUser);
	public UserSubscriptionsDto findSubscription(String username);
	
}	