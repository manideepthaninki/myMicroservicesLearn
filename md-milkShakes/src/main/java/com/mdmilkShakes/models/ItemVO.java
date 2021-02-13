package com.mdmilkShakes.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemVO {

	private String name;
	private long id;
	private double price;
	private boolean isAvalible;
	
}
