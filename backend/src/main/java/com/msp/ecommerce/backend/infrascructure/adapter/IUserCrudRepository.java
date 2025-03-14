package com.msp.ecommerce.backend.infrascructure.adapter;

import com.msp.ecommerce.backend.infrascructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUserCrudRepository extends CrudRepository<UserEntity, Integer> {

}
