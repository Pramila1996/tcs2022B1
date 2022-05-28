package flipkart.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flipkart.bean.Product;
import flipkart.repository.MyLocalRepository;
import flipkart.service.ProductService;


@Service
public class ProductServiceImp implements ProductService {
	
  //injected the dependency MyLocalRepository into service class
	@Autowired
	MyLocalRepository myLocalRepository;
	
	
	public Product addProduct(Product product) {
		
		Product addproduct = myLocalRepository.save(product);
		
		return addproduct;  // returning to controler
	}
	
	//added new service here
	public List<Product> getAllListOfProducts(){
		
		List<Product> listofproducts = myLocalRepository.findAll();
		
		return listofproducts;
	}
	
	
	// for update product by admin
	public Product updateProduct(Product product,long id) {
		
	product.setId(id);
	Product updateproduct = myLocalRepository.save(product);
	
	
	return updateproduct;
	}
	
	//delete service
	@Override
	public void deleteProductById(long id) {
		myLocalRepository.deleteById(id);  //delete from where id 
	}
}

		


