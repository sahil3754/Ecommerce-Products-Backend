package com.example.demo.services;

import java.util.List;

import com.example.demo.models.Products;
import com.example.demo.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productrepository;
    
    public List<Products> Show_Products() {
        return productrepository.findAll();
    }

    public String Add_Products(List<Products> products) {
        productrepository.saveAll(products);
        return "Data Save Succesfullly" ;
    }

    public void Delete_Products(Integer Id) {
        productrepository.deleteById(Id);

    }
    

    public String Update_Products (Integer Product_Id, Products update_products) {
        
        productrepository.updateProductsById(update_products.getProduct_Name(),update_products.getProduct_Category(),update_products.getProduct_Image(),update_products.getProduct_Description(),update_products.getProduct_Price(), update_products.getProduct_Stock(), Product_Id);
        return "Data is Upated";
    }
}
