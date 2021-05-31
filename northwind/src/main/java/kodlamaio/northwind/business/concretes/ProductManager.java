package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilites.result.DataResult;
import kodlamaio.northwind.core.utilites.result.Result;
import kodlamaio.northwind.core.utilites.result.SuccessDataResult;
import kodlamaio.northwind.core.utilites.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //bu class servis görevi görecek (business kısmı)
public class ProductManager implements ProductService {

    private ProductDao productdao;

    @Autowired //spring arka planda ProductDao'nun instance'ını olusturup verir.
    public ProductManager(ProductDao productdao) {
        super();
        this.productdao = productdao;
    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>(this.productdao.findAll(), "OK, Success");

    }

    @Override
    public Result add(Product product) {

        this.productdao.save(product);
        return new SuccessResult("Ekleme Başarılı");
    }

    @Override
    public DataResult<Product> getByProductName(String productName) {
        return new SuccessDataResult<Product>(this.productdao.getByProductName(productName), "success");
    }

    @Override
    public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
        //businness codes here

        return new SuccessDataResult<>(this.productdao.getByProductNameAndCategoryCategoryId(productName, categoryId), " by produuctname and categoryid");
    }

    @Override
    public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>(this.productdao.getByProductNameOrCategoryCategoryId(productName, categoryId), "product by name and id");
    }

    @Override
    public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories) {
        return new SuccessDataResult<List<Product>>(this.productdao.getByCategoryIn(categories), "product by name and id");
    }

    @Override
    public DataResult<List<Product>> getByProductNameContains(String productName) {
        return new SuccessDataResult<List<Product>>(this.productdao.getByProductNameContains(productName), "getByProductNameContains");
    }

    @Override
    public DataResult<List<Product>> getByProductNameStartingWith(String productName) {
        return new SuccessDataResult<List<Product>>(this.productdao.getByProductNameStartingWith(productName), "getByProductNameStartingWith");
    }

    @Override
    public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>(this.productdao.getByNameAndCategory(productName, categoryId), "getByNameAndCategory");
    }

    @Override
    public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);

        return new SuccessDataResult<List<Product>>(this.productdao.findAll(pageable).getContent(), "Sayfalandı");
    }

    @Override
    public DataResult<List<Product>> getAllSorted() {
        Sort sort = Sort.by(Sort.Direction.DESC, "productName");

        return new SuccessDataResult<List<Product>>(this.productdao.findAll(sort), "Başarılı");
    }

    @Override
    public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
        return new SuccessDataResult<List<ProductWithCategoryDto>>( this.productdao.getProductWithCategoryDetails(), "Data listelendi");
    }


}
