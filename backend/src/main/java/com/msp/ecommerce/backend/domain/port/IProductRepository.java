package com.msp.ecommerce.backend.domain.port;

import com.msp.ecommerce.backend.domain.model.Product;

public interface IProductRepository {
    Product save(Product product);
    Iterable<Product> findAll();
    Product findById(Integer id);
    void deleteById(Integer id);
    Product updateById(Product product);
}
