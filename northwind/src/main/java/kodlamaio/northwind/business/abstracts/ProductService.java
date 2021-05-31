package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.utilites.result.DataResult;
import kodlamaio.northwind.core.utilites.result.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductService {
	
	DataResult<List<Product>> getAll();

	Result add(Product product);

	DataResult<Product> getByProductName(String productName);

	DataResult<Product> getByProductNameAndCategoryId(String productName ,int categoryId);

	DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);

	DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);

	DataResult<List<Product>> getByProductNameContains (String productName);

	DataResult<List<Product>> getByProductNameStartingWith (String productName);

	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);

	DataResult<List<Product>> getAll(int pageNo, int pageSize);

	DataResult<List<Product>> getAllSorted();

	DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();

}
