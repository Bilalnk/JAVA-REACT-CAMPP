package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{ //hangi tablo için,  primary keyin tipi
	
	//hibernate implemente ettik
	

}
