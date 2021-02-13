package com.mdmilkShakes.services;

import java.util.List;

import com.mdmilkShakes.models.Item;
import com.mdmilkShakes.models.ItemVO;

public interface MenuService {

	public List<Item> getMenu();	
	public String addItem(ItemVO itemVo);
	
}
