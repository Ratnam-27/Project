package com.ratnam.subscriptionmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratnam.subscriptionmanagement.payloads.SubscriptionPlansDto;
import com.ratnam.subscriptionmanagement.services.SubscriptionPlansService;

@RestController
@RequestMapping("/api/SubscriptionPlans")
public class SubscriptionPlansController {
	
	@Autowired
	private SubscriptionPlansService sps;

	@GetMapping("/")
	public ResponseEntity<List<SubscriptionPlansDto>> getAllSubscriptionPlans(){
		
		return ResponseEntity.ok(this.sps.getAllSubscriptionPlans());
	}
}
