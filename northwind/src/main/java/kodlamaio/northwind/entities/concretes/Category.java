package kodlamaio.northwind.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kodlamaio.northwind.entities.concretes.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categories")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"}) //loop oluşmaması için tembel yükleme yapıyor
public class Category {

    @Id
    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "category_name")
    private String categoryName;

    //categories tablosu ile ilişkilendirilir.
    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Product> products;


}
