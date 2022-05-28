package flipkart.service;

  
import java.util.List;


import flipkart.bean.Product;

public interface ProductService {
	// service give by admin isert
	Product addProduct(Product product);
	
	
	//get all list of products
	List<Product> getAllListOfProducts();
	
	
	//update by id
	Product updateProduct(Product product, long id);
		// TODO Auto-generated method stub
		//return null;
	
	
	// delete service
	void deleteProductById(long id);
	}
	


