package shop;

import java.util.List;

public interface GeneralWarehouse {
	
	void add(Product product);
	Product get(Product product);
	void set(Product product);
	void remove(Product product);
	List<Product> getAllProducts();
	
}
