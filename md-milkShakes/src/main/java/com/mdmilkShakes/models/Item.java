package com.mdmilkShakes.models;


import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;

@Document
@Data
@ToString
public class Item  {
	@Transient
    public static final String SEQUENCE_NAME = "item_sequence";
	@Id
	private int id;
	private String name;
	private double price;
	private boolean isAvailble;
	
	
}
