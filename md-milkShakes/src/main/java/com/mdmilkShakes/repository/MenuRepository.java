package com.mdmilkShakes.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mdmilkShakes.models.Item;

@Repository
public interface MenuRepository extends MongoRepository<Item, Long>{

}
