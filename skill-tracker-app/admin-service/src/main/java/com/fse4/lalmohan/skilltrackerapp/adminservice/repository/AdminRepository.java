package com.fse4.lalmohan.skilltrackerapp.adminservice.repository;

import com.fse4.lalmohan.skilltrackerapp.adminservice.entity.Engineer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends MongoRepository<Engineer, Long> {

	@Query(value = "{'associateId' : ?0 }")
	public Engineer findByAssociateId(@Param("associateId") String associateId);

}


