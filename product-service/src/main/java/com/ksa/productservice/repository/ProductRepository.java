package com.ksa.productservice.repository;

import com.ksa.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByProductTypeId(Long id);
    public List<Product> findByProductTypeIdIn(List<Long> id);
    public List<Product> findByProductTypeIdInOrderByPrice(List<Long> id);
    public List<Product> findByProductTypeIdInOrderByPriceDesc(List<Long> id);
    public List<Product> findByOrderByPrice();
    public List<Product> findByOrderByPriceDesc();
}
