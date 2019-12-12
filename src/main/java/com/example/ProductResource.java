package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductResource{
    private List<Product> produtos;
    
    public ProductResource(){
        this.produtos = new ArrayList<>();
        this.produtos.add(new Product("cao", 50.00, 5));
        this.produtos.add(new Product("gato", 90.00, 7));
    }


@RequestMapping(value = "/produtos", method = RequestMethod.GET)
public List<Product> buscarProdutos(@RequestParam(required = false)String raca){
    if(raca == null){
        return this.produtos;
    }else{
        List<Product> prod = new ArrayList<>();
        for(Product p: this.produtos){
            if (raca.equals(p.getRaca())) prod.add(p);
        }
        return prod;
    }
}
@RequestMapping(value = "/produtos/{id}", method = RequestMethod.GET)
public Product buscarProduto(@PathVariable Integer id){
    return this.produtos.get(id - 1);
}
}