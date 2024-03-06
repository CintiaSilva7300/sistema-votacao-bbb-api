package com.votacaobbbapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.votacaobbbapi.models.ParametroModel;

public interface ParametroRepository extends MongoRepository<ParametroModel, String> {
	
}
