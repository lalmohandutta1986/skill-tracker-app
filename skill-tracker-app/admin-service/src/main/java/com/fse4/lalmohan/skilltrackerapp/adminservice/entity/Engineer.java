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
@Document(collation = "engineer")
public class Engineer {
	
	@Id
	private Long associateId;
	
	private String name;
	
	private String email;

	private String mobile;
	
}
