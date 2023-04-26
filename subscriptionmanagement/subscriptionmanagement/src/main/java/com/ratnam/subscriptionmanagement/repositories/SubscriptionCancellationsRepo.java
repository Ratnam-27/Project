package com.ratnam.subscriptionmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratnam.subscriptionmanagement.entities.SubscriptionCancellations;

public interface SubscriptionCancellationsRepo extends JpaRepository<SubscriptionCancellations,Integer> {

}
