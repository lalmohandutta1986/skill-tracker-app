package com.fse4.lalmohan.skilltrackerapp.profileservice.repository;

import com.fse4.lalmohan.skilltrackerapp.profileservice.entity.Engineer;
import com.fse4.lalmohan.skilltrackerapp.profileservice.entity.Skill;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends MongoRepository<Skill, Long> {



}


