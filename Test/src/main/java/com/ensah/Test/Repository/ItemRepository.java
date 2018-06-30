package com.ensah.Test.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ensah.Test.Model.Item;

public interface ItemRepository extends MongoRepository<Item,String> {

}
