package com.casestudy.events.Service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.casestudy.events.Entity.Customer;
import com.casestudy.events.Repository.CustomerRegistrationRepository;


@ExtendWith(MockitoExtension.class)
class CustomerRegistrationServiceTest {

	 @Mock
	  
	    CustomerRegistrationRepository repo;
	    
	    @Mock
	  
	    CustomerRegistrationService service;
	    
	    @Test
	    public void testcreateCustomer() {
	   
	        Customer customer=new Customer(4,"viraj@gmail.com","viraj123","viraj",9887570597L);
	        repo.save(customer);
	        assertThat(customer.getCustomeremailid()).isEqualTo("viraj@gmail.com");
	    }
	   
	   
	}


