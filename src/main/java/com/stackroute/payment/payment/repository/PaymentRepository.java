 package com.stackroute.payment.payment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.payment.kafka.domain.TicketDetails;

@Repository
public interface PaymentRepository extends MongoRepository<TicketDetails, Integer> {
	
	public TicketDetails getByEmail(String email);

}
