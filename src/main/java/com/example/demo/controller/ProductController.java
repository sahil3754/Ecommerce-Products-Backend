package com.example.demo.controller;

import java.util.List;

import com.example.demo.models.Products;
import com.example.demo.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService productservice;
    
    @GetMapping("/allproducts")
    
    public List<Products> Show_Products() {
        return productservice.Show_Products();
    }

    @PostMapping("/addproducts")
   
    public void Add_Products(@RequestBody List<Products> products) {
        
        productservice.Add_Products(products);
        
    }


    @DeleteMapping("/allproducts/{Id}")
   
    public void Delete_Products(@PathVariable("Id") Integer Id) {
        
        productservice.Delete_Products(Id);
    }
    
    
    @PutMapping("/allproducts/{Id}")
  
    public void Update_Products(@PathVariable("Id") Integer Id, @RequestBody Products update_products) {
        
        productservice.Update_Products(Id, update_products);
    }

}
