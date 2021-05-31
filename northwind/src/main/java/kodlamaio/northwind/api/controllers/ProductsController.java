package kodlamaio.northwind.api.controllers;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilites.result.DataResult;
import kodlamaio.northwind.core.utilites.result.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController  //restfull çalışılacak burada
@RequestMapping("/api/products") // parantezdeki istek geldiginde bu class onu karsilayacak.
public class ProductsController {

    private ProductService productService;

    @Autowired //Projede ProductService arayıp buluyor productmaganer'ın instance'ını dönüyor.
    public ProductsController(ProductService productService) {
        super();
        this.productService = productService;
    }

    @GetMapping("/getall") // kodlama.io/api/product/getall -> istegine karsılık calisacak
    public DataResult<List<Product>> getAll(){
        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product) {
        return this.productService.add(product);
    }

    @GetMapping("/getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String productName) {
        return this.productService.getByProductName(productName);
    }

    @GetMapping("/getProductNameAndCategoryId")
    public DataResult<Product> getByProductNameAndCategoryId(@RequestParam String productName, @RequestParam int categoryId){
        return this.productService.getByProductNameAndCategoryId(productName, categoryId);
    }
    @GetMapping("/getByProductNameOrCategoryId")
    public DataResult<List<Product>> getByProductNameOrCategoryId(@RequestParam String productName,@RequestParam int categoryId){
        return this.productService.getByProductNameOrCategoryId(productName, categoryId);
    }
    @GetMapping("/getByProductNameContains")
    public DataResult<List<Product>> getByProductNameContains (@RequestParam String productName){
        return this.productService.getByProductNameContains(productName);
    }

    @GetMapping("/getAllPage")
    DataResult<List<Product>> getAll(int pageNo, int pageSize){
        return this.productService.getAll(pageNo, pageSize);
    }


    @GetMapping("/getAllDesc")
    public DataResult<List<Product>> getAllSorted() {
        return this.productService.getAllSorted();
    }
/*

    public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories){

    }


    public DataResult<List<Product>> getByProductNameStartingWith (String productName){

    }

    public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId){

    }*/

    @GetMapping("/getProductWithCategoryDetails")
    public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails(){
        return this.productService.getProductWithCategoryDetails();

    }
}


//kodlama.io/api/product
