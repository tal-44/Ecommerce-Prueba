package com.msp.ecommerce.backend.infrascructure.adapter;

import com.msp.ecommerce.backend.infrascructure.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface IProductCrudRepository extends CrudRepository<ProductEntity, Integer> {
}
