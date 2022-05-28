package flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flipkart.bean.Product;

@Repository
public interface MyLocalRepository extends JpaRepository<Product, Long> {
	
}
