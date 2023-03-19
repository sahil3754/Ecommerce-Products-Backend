package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Product_Id;
    private String  Product_Name;
    private String  Product_Category;
    private String  Product_Image;
    private String  Product_Description;
    private Double  Product_Price;
    private Integer Product_Stock;

  
   

    public Products(Integer product_Id, String product_Name, String product_Category, String product_Image,String product_Description, Double product_Price, Integer product_Stock) {
        Product_Id = product_Id;
        Product_Name = product_Name;
        Product_Category = product_Category;
        Product_Image = product_Image;
        Product_Description = product_Description;
        Product_Price = product_Price;
        Product_Stock = product_Stock;
    }

    public Products(){
        //defalut constructor
    }

    public Integer getProduct_Id() {
        return Product_Id;
    }

    public void setProduct_Id(Integer product_Id) {
        Product_Id = product_Id;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String product_Name) {
        Product_Name = product_Name;
    }

    public Double getProduct_Price() {
        return Product_Price;
    }

    public void setProduct_Price(Double product_Price) {
        Product_Price = product_Price;
    }

    public Integer getProduct_Stock() {
        return Product_Stock;
    }

    public void setProduct_Stock(Integer product_Stock) {
        Product_Stock = product_Stock;
    }


    public String getProduct_Category() {
        return Product_Category;
    }


    public void setProduct_Category(String product_Category) {
        Product_Category = product_Category;
    }

    public String getProduct_Image() {
        return Product_Image;
    }

    public void setProduct_Image(String product_Image) {
        Product_Image = product_Image;
    }

    public String getProduct_Description() {
        return Product_Description;
    }

    public void setProduct_Description(String product_Description) {
        Product_Description = product_Description;
    }

    
    
    

    



}
