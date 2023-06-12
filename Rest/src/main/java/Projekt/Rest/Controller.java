package Projekt.Rest;

import Projekt.Rest.Repository.Repository;
import Projekt.Rest.Service.ProductService;
import Projekt.Rest.data.Product;
import Projekt.Rest.data.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class Controller {
    @Autowired
    Repository repository;
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    List<Product> all(){
        return repository.findAll();
    }

    @GetMapping("/products/{name}")
    Product singleProduct(@PathVariable Long name){
        if(repository.findById(name).isPresent())
            return repository.findById(name).get();

        return null;
    }

    @GetMapping("/productss/{name}")
    Product singleProductTwo(@PathVariable String name){
        return productService.findByName(name);
    }

    @PostMapping("/products")
    Product newProduct(@RequestBody Product newProduct){
        return repository.save(newProduct);
    }

    @DeleteMapping("/products/{name}")
    void deleteProduct(@PathVariable Long name){
        repository.deleteById(name);
    }
}
