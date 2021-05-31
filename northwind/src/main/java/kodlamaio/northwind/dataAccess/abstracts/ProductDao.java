package kodlamaio.northwind.dataAccess.abstracts;

import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer>{ //hangi tablo için,  primary keyin tipi
	
	//hibernate implemente ettik

    Product getByProductName(String productName);

    Product getByProductNameAndCategoryCategoryId(String productName ,int categoryId);

    List<Product> getByProductNameOrCategoryCategoryId(String productName, int categoryId);

    List<Product> getByCategoryIn(List<Integer> categories);

    List<Product> getByProductNameContains (String productName);

    List<Product> getByProductNameStartingWith (String productName);

    //queryde entity'e göre yazılır // from ile başlarsak tüm alanları çekeriz
    @Query("From Product where  productName= :productName and category.categoryId = :categoryId")
    List<Product> getByNameAndCategory(String productName, int categoryId);

    //Join de paket adı önemli !!!
    @Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto(p.id, p.productName, c.categoryName) From Category c inner join c.products p")
    List<ProductWithCategoryDto> getProductWithCategoryDetails();

    //Select p.productId, p.productName, c.categoryName From Category c inner join Product p on c.categoryId = p.categoryId;
}
