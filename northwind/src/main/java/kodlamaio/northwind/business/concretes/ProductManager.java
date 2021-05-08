package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service //bu class servis görevi görecek (business kısmı)
public class ProductManager implements ProductService{
	
	private ProductDao productdao;
	
	@Autowired //spring arka planda ProductDao'nun instance'ını olusturup verir.
	public ProductManager(ProductDao productdao) {
		super();
		this.productdao = productdao;
	}



	@Override
	public List<Product> getAll() {
		
		return this.productdao.findAll();
	}

}
