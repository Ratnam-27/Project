package com.ratnam.subscriptionmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratnam.subscriptionmanagement.entities.UserSubscriptions;

public interface UserSubscriptionsRepo extends JpaRepository<UserSubscriptions,Integer> {

	public UserSubscriptions findByUserName(String username);
}
