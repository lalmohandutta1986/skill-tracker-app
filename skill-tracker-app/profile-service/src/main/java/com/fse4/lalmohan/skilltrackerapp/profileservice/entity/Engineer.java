package com.fse4.lalmohan.skilltrackerapp.profileservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "engineer")
public class Engineer {
	
	@Id
	private Long engineerId;

	private String associateId;
	
	private String name;
	
	private String email;

	private String mobile;

	private Date profileCreatedOn;

	private Date lastUpdatedOn;
	
}
