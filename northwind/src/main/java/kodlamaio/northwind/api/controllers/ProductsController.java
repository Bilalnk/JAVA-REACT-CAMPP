package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

//TODO api/products yap

@RestController  //restfull çalışılacak
@RequestMapping("/api/products") // parantezdeki istek geldiginde bu class onu karsilayacak.
public class ProductsController {

	private ProductService productService;

	@Autowired //Projede ProductService arayıp buluyor productmaganer'ın instance'ını dönüyor.
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall") // kodlama.io/api/product/getall -> istegine karsılık calisacak
	public List<Product> getAll(){
		
		return this.productService.getAll();
	}
}


//kodlama.io/api/product
