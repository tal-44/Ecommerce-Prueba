package com.msp.ecommerce.backend.application;

import com.msp.ecommerce.backend.domain.model.Category;
import com.msp.ecommerce.backend.domain.port.ICategoryRepository;

public class CategoryService {
    private final ICategoryRepository iCategoryRepository;

    public CategoryService(ICategoryRepository iCategoryRepository) {
        this.iCategoryRepository = iCategoryRepository;
    }
    public Category save(Category category) {
        return iCategoryRepository.save(category);
    }
    public Iterable<Category> findAll() {
        return iCategoryRepository.findAll();
    }
    public Category findById(Integer id) {
        return iCategoryRepository.findById(id);
    }
    public Category updateById(Category category) {
        return iCategoryRepository.updateById(category);
    }
    public void deleteById(Integer id) {
        iCategoryRepository.deleteById(id);
    }

}
