package Projekt.Rest.data;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;


@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_generator")
    @SequenceGenerator(name = "product_generator", sequenceName = "product_seq", allocationSize = 1)
    @Column(name = "product_id", nullable = false)
    private long productId;

    @Column(name = "name", nullable = false)
    private String name;


    @Column(name = "available_quantity", nullable = false)
    @Check(constraints = "available_quantity >= 0")
    private long availableQuantity;


    public Product() {

    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(long availableQuantity) {
        this.availableQuantity = availableQuantity;
    }



}