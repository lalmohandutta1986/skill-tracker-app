package com.fse4.lalmohan.skilltrackerapp.profileservice.repository;

import com.fse4.lalmohan.skilltrackerapp.profileservice.entity.Engineer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends MongoRepository<Engineer, Long> {

//	@Query(value = "{'associateId' : ?0 }")
//	public Engineer findByAssociateId(@Param("associateId") String associateId);

}


