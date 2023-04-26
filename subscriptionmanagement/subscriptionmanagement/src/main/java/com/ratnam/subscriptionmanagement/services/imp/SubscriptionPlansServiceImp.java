package com.ratnam.subscriptionmanagement.services.imp;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratnam.subscriptionmanagement.entities.SubscriptionPlans;
import com.ratnam.subscriptionmanagement.payloads.SubscriptionPlansDto;
import com.ratnam.subscriptionmanagement.repositories.SubscriptionPlansRepo;
import com.ratnam.subscriptionmanagement.services.SubscriptionPlansService;

@Service
public class SubscriptionPlansServiceImp implements SubscriptionPlansService {
	
	@Autowired
	private SubscriptionPlansRepo spr;

	@Override
	public List<SubscriptionPlansDto> getAllSubscriptionPlans() {
         
		List <SubscriptionPlans> plansList = this.spr.findAll();
		List<SubscriptionPlansDto> planDtoList = plansList.stream().map(planList->this.SubPlansToDto(planList)).collect(Collectors.toList());
		return planDtoList;
	}
	
	public SubscriptionPlans DtoToSubPlans(SubscriptionPlansDto spd)
	{
		SubscriptionPlans sp=new SubscriptionPlans();
		sp.setPlanId(spd.getPlanId());
		sp.setName(spd.getName());
		sp.setPricePerMonth(spd.getPricePerMonth());
		return sp;
	}
    
	public SubscriptionPlansDto SubPlansToDto(SubscriptionPlans sp)
	{
		SubscriptionPlansDto spd = new SubscriptionPlansDto();
		spd.setPlanId(sp.getPlanId());
		spd.setName(sp.getName());
		spd.setPricePerMonth(sp.getPricePerMonth());
		return spd;
	}
}
