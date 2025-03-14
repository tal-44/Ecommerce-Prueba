package com.msp.ecommerce.backend.infrascructure.adapter;

import com.msp.ecommerce.backend.infrascructure.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryCrudRepository extends CrudRepository<CategoryEntity, Integer> {
}
