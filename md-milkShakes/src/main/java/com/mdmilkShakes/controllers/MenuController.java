package com.mdmilkShakes.controllers;

import java.nio.file.Path;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerAdapter;

import com.mdmilkShakes.models.Item;
import com.mdmilkShakes.models.ItemVO;
import com.mdmilkShakes.services.MenuService;

@RestController
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	
	@GetMapping(path = "menu")
	public List<Item> getMenu(){
		return menuService.getMenu();
		
	}
	@PostMapping(path="menu")
	public String addItem(@RequestBody ItemVO vo) {
		return menuService.addItem(vo);
		
	}
	
	
}
