package straumann.com.dev.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import straumann.com.dev.model.Item;
import straumann.com.dev.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired  
	ItemService itemService; 
	
	
	@GetMapping("/health")
	public Map<String, String> health() {
		Map<String, String> map = new HashMap<>();
		map.put("health", "up");
		return map;
	}
	
	@GetMapping("/items")  
	private List<Item> getAllItems(){  
		return itemService.getAllItems();  
	}
	
	@GetMapping("/item/{itemid}")  
	private Item getItems(@PathVariable("itemid") int itemid){  
		return itemService.getItemById(itemid);  
	}   
	
	@PostMapping("/item")  
	private int saveItem(@RequestBody Item items){  
		itemService.saveOrUpdateItem(items);  
		return items.getID();  
	}  
	
	@PutMapping("/item")  
	private Item update(@RequestBody Item books){  
		itemService.saveOrUpdateItem(books);  
		return books;  
	}
	
	@DeleteMapping("/item/{itemid}")  
	private void deleteBook(@PathVariable("itemid") int itemid){  
		itemService.deleteItem(itemid);  
	} 

}
