package com.fse4.lalmohan.skilltrackerapp.adminservice.entity;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collation = "skill")
public class Skill {
	
	@Id
	private Long skillId;
	
	private String skillName;
	
	private Integer expertiseLevel;


}
