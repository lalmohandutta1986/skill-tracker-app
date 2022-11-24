package com.fse4.lalmohan.skilltrackerapp.profileservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "skill")
public class Skill {
	
	@Id
	private Long skillId;
	
	private String skillName;

	private String skillType;
	
	private Integer expertiseLevel;

	private Date lastUpdatedOn;

}
