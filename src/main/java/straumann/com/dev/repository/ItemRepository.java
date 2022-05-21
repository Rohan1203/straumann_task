package straumann.com.dev.repository;

import org.springframework.data.repository.CrudRepository;
import straumann.com.dev.model.Item;


public interface ItemRepository extends CrudRepository<Item, Integer>{

}
