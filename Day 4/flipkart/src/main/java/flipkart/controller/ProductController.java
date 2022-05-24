package flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import flipkart.bean.Product;
import flipkart.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping(value="/addproduct")
	Product addProduct(@RequestBody Product product) {
		
		Product prod = productService.addProduct(product);
		
		
		return product;
		
	}

}
