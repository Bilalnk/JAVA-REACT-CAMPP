package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

    public static void main(String[] args) {

        //TODO Entity'ler dışında newleme yapma. Spring ioc ile iyileştirilecek.
//        ProductService productService = new ProductManager(new HibernateProductDao());
        ProductService productService = new ProductManager(new AbcProductDao());

        Product product = new Product();
        product.setId(1);
        product.setCategoryId(2);
        product.setName("Elma");
        product.setUnitPrice(12);
        product.setUnitsInStock(50);
        productService.add(product);

    }
}
