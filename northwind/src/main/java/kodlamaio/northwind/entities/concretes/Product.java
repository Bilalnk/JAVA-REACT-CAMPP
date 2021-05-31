package kodlamaio.northwind.entities.concretes;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity  //Bu sınıfın bir entity yani tablo olduğunu belirtir.
@Table(name="products") //veritabanındaki karşılık gelecek tablo ismi
public class    Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //id oto increment oldu
	@Column(name="product_id")
	private int id;
	
	/*@Column(name="category_id")
	private int categoryId;*/
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;

	@ManyToOne()
	@JoinColumn(name = "category_id") // join yaptığımızda category içerisindeki alanları da bu tabloya ekler
	private Category category;

}
