package com.ensah.Test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ensah.Test.Model.Item;
import com.ensah.Test.Repository.ItemRepository;

@RestController
@RequestMapping("/items")
public class ItemController {
	
	@Autowired
	ItemRepository itemRepository;

	//@GetMapping("/all")
	@CrossOrigin
	@RequestMapping(value="/all",method = RequestMethod.GET)
	@ResponseBody
	public List<Item> getAll()
	{
			List<Item> items= itemRepository.findAll();
			
			return items;
	}
	
	@CrossOrigin
	@RequestMapping(value="/add",method = RequestMethod.POST)  
	@ResponseBody
	public Item AddIttem(@RequestBody Item item){
		System.out.println("/items/add item = "+item.toString());
		itemRepository.save(item); 
		Item i = itemRepository.findOne(item.getTitle());
		return i; 
	}

	/* je reesssaye rah jai connecter la db
	 * kayen un probleme f repository !! whyyb7ala mamconnectiach l mongodb ou la makatinitialisach ga3 !!! att
	 */
}
