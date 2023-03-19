package com.example.demo.repository;

import javax.transaction.Transactional;

import com.example.demo.models.Products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products,Integer> {
  @Transactional
  @Modifying 
  @Query("update Products p set p.Product_Name = ?1, p.Product_Category =?2, p.Product_Image =?3, p.Product_Description =?4, p.Product_Price = ?5, p.Product_Stock = ?6 where p.Product_Id = ?7")
  void updateProductsById(String Product_Name,String Product_Category,String Product_Image, String Product_Description,Double Product_Price,Integer Product_Stock,Integer Product_Id); 
  
}
