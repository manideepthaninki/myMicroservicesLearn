package com.mdmilkShakes.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdmilkShakes.models.Item;
import com.mdmilkShakes.models.ItemVO;
import com.mdmilkShakes.repository.MenuRepository;

@Service
public class MenuServiceImpl implements MenuService{
	
	@Autowired
	private MenuRepository menuRepository;
	
	
	@Override
	public List<Item> getMenu() {
		List<Item> items=menuRepository.findAll();
		if(!items.isEmpty()) {
		return items;
		}
		else {
			return null;
		}
	}

	@Override
	public String addItem(ItemVO vo) {
		Item item=new Item();
		item.setName(vo.getName());
		item.setPrice(vo.getPrice());
		item.setAvailble(vo.isAvalible());
		item.setId(SequenceService.getSequence(Item.SEQUENCE_NAME));
		Item i=menuRepository.save(item);
		if(!Objects.isNull(i)) {
		return "Object Saved";
		}
		else {
			return "Failed to save Object";
		}
	}

}
