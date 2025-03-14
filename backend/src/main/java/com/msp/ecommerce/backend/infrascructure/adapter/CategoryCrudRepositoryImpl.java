package com.msp.ecommerce.backend.infrascructure.adapter;

import com.msp.ecommerce.backend.domain.model.Category;
import com.msp.ecommerce.backend.domain.port.ICategoryRepository;
import com.msp.ecommerce.backend.infrascructure.mapper.CategoryMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryCrudRepositoryImpl implements ICategoryRepository {
    private final ICategoryCrudRepository iCategoryCrudRepository;
    private final CategoryMapper categoryMapper;

    public CategoryCrudRepositoryImpl(ICategoryCrudRepository iCategoryCrudRepository, CategoryMapper categoryMapper) {
        this.iCategoryCrudRepository = iCategoryCrudRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public Category save(Category category) {
        return categoryMapper.toCategory(iCategoryCrudRepository.save(categoryMapper.toCategoryEntity(category)));
    }

    @Override
    public Iterable<Category> findAll() {
        return categoryMapper.toCategoryList(iCategoryCrudRepository.findAll());
    }

    @Override
    public Category findById(Integer id) {
        return categoryMapper.toCategory(iCategoryCrudRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Categoría con id " + id + " no se encuentra")
        ));
    }

    @Override
    public void deleteById(Integer id) {
        iCategoryCrudRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Categoria con id " + id + " no se encuentra")
        );

        iCategoryCrudRepository.deleteById(id);
    }

    @Override
    public Category updateById(Category category) {
        return null;
    }


}
