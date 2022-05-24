package flipkart.bean;

import javax.annotation.Generated;

@Entit
@Table

public class Product {
	
	@Id
	@Generatevalue(strategy = GenerationType.Auto)
	private long id;
	private String productname;
	private String brandname;
	private String price;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	

}
