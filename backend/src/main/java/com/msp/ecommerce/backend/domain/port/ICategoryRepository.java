package com.msp.ecommerce.backend.domain.port;

import com.msp.ecommerce.backend.domain.model.Category;

public interface ICategoryRepository {
    Category save(Category category);
    Iterable<Category> findAll();
    Category findById(Integer id);
    void deleteById(Integer id);
    Category updateById(Category category);
}
