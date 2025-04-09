package com.example.msa.service;

import java.util.List;

import com.example.msa.entity.Mobile;

public interface MobileServiceI {
	
	Mobile saveMobile(Mobile mobile);
	
	Mobile getMobileById(int mobileId);
	
	List<Mobile> getAllMobiles();
	
    Mobile updateMobile(Mobile mobile);
	
	void deleteMobile(int mobileId);
 
}