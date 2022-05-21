package straumann.com.dev.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import straumann.com.dev.model.Item;
import straumann.com.dev.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	ItemRepository itemRepository;  
	
	public List<Item> getAllItems(){  
		List<Item> items = new ArrayList<Item>();  
		itemRepository.findAll().forEach(item1 -> items.add(item1));  
		return items;  
	}  
	
	public Item getItemById(int itemid){  
		return itemRepository.findById(itemid).get();  
	}  
	 
	public void saveOrUpdateItem(Item item){  
		itemRepository.save(item);  
	}  
	
	public void deleteItem(int itemid){  
		itemRepository.deleteById(itemid);  
	}  
	
	public void updateItem(Item item, int itemid){  
		itemRepository.save(item);  
	}  
	
}
