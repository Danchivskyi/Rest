package Projekt.Rest.Repository;

import Projekt.Rest.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface Repository extends JpaRepository<Product, Long> {

    @Query(nativeQuery = true, value="select * from Product where product_name = :nazwa")
    Product getProdByName(@Param(value = "nazwa")String nazwa);
}
