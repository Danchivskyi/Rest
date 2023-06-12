package Projekt.Rest.Service;

import Projekt.Rest.Repository.Repository;
import Projekt.Rest.data.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    Repository repo;

    public Product findByName(String name){
        return repo.getProdByName(name);
    }
}
