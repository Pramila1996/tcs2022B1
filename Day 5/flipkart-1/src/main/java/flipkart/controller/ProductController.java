 package flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import flipkart.bean.Product;
import flipkart.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	//create service for admin
	@PostMapping(value="/createproduct")  //endpoint
	Product createProduct(@RequestBody Product prod) {
		
		Product p = productService.addProduct(prod);
		System.out.println("product->>>>> "+p.getProductname());
		System.out.println("brand->>>>> "+p.getBrandname());
		return p;
		
	}
	
	// get list of product from the db
	@GetMapping(value="/viewAllOfProduct")
	List<Product> viewAllListOfProduct(){
		
		return productService.getAllListOfProducts();
	}
		
		//update by id
    @PutMapping(value="/updateproduct/{id}")
     Product updateProduct(@RequestBody  Product updateproduct,@PathVariable long id) {
			Product updateDetails =	productService.updateProduct(updateproduct,id);
            return updateDetails;
	
	}
    
    //delete
    @DeleteMapping(value = "/deleteproductbyid/{productid}" )
    ResponseEntity<String> deleteProductBy(@PathVariable long productid ){
    	try {
    		
    		if (productid == 0) {
    			return ResponseEntity.ok("pls enter in proper id" + productid);
    		}
    		productService.deleteProductById(productid);
    		
    		return ResponseEntity.ok("Sucessfully deleted" +productid);
    		
    	}catch (Exception e) {
    		return ResponseEntity.ok("Product id does not exist" + productid);
    	}
    }
		

		
	}


