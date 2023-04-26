package com.ratnam.subscriptionmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratnam.subscriptionmanagement.entities.SubscriptionPlans;

public interface SubscriptionPlansRepo extends JpaRepository<SubscriptionPlans,Integer> {
	SubscriptionPlans findSubscriptionPlansByPricePerMonth(int amt);
}
