package com.mdmilkShakes.models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
@Data
@AllArgsConstructor
@ToString
@Document(collection = "id_sequence")
public class Id_sequence {

	private String id;
	private int sequence; 
	
}
