package com.ratnam.subscriptionmanagement.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratnam.subscriptionmanagement.entities.SubscriptionPlans;
import com.ratnam.subscriptionmanagement.entities.UserSubscriptions;
import com.ratnam.subscriptionmanagement.payloads.UserSubscriptionsDto;
import com.ratnam.subscriptionmanagement.repositories.SubscriptionPlansRepo;
import com.ratnam.subscriptionmanagement.repositories.UserSubscriptionsRepo;
import com.ratnam.subscriptionmanagement.services.UserSubscriptionsService;

@Service
public class UserSubscriptionsServiceImp implements UserSubscriptionsService {

	@Autowired
	private UserSubscriptionsRepo usr;
	@Autowired
	private SubscriptionPlansRepo sp;
	
	@Override
	public UserSubscriptionsDto addUserSubs(UserSubscriptionsDto newSubscriptionDto) {
		// TODO Auto-generated method stub
		 
		return null;
	}

	@Override
	public UserSubscriptionsDto updatePlan(Integer subId, UserSubscriptionsDto updateUser) {
		
		UserSubscriptions us1 = this.usr.findById(subId).orElseThrow(()->new RuntimeException("user id not found"));
		SubscriptionPlans sb=this.sp.findSubscriptionPlansByPricePerMonth( updateUser.getAmountPaid());
		us1.setUserName(updateUser.getUserName());
		us1.setAmountPaid(updateUser.getAmountPaid());
		us1.setPaymentMode(updateUser.getPaymentMode());
		us1.setSubscriptionStartDate(updateUser.getSubscriptionStartDate());
		us1.setSubscriptionEndDate(updateUser.getSubscriptionEndDate());
		us1.setSubscriptionStatus(updateUser.getSubscriptionStatus());
		us1.setSubscriptionPlans(sb);
		
		UserSubscriptions updatedUser = this.usr.save(us1);
		//UserSubscriptionsDto updatedDto = userSubToDto(updatedUser);
		
		return null;
	}

	@Override
	public UserSubscriptionsDto cancelSubscription(int subId, UserSubscriptionsDto cancelUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserSubscriptionsDto findSubscription(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserSubscriptionsDto userSubToDto() {
		return null;
	}
}
