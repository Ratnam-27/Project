package com.ratnam.subscriptionmanagement.services;

import java.util.List;
import com.ratnam.subscriptionmanagement.payloads.SubscriptionPlansDto;

public interface SubscriptionPlansService {

	public List<SubscriptionPlansDto> getAllSubscriptionPlans();
}
